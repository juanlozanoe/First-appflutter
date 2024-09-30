import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';
import 'package:sena_project/models/product.dart';
import 'package:sena_project/widgets/datos_page.dart'; // Asegúrate de que esta ruta sea correcta

class LoginPage extends StatefulWidget {
  @override
  _LoginPageState createState() => _LoginPageState();
}

class _LoginPageState extends State<LoginPage> {
  final TextEditingController _usernameController = TextEditingController();
  final TextEditingController _passwordController = TextEditingController();
  bool _isLoading = false;
  String? _errorMessage;

  Future<void> _login() async {
    setState(() {
      _isLoading = true;
      _errorMessage = null;
    });

    final url = Uri.parse("https://c548-186-1-186-185.ngrok-free.app/users"); // Reemplaza con tu endpoint de usuarios
    try {
      final response = await http.get(url);

      setState(() {
        _isLoading = false;
      });

      if (response.statusCode == 200) {
        final List<dynamic> data = jsonDecode(response.body);

        // Busca el usuario en la lista obtenida
        final userExists = data.any(
          (user) =>
              user['email'] == _usernameController.text &&
              user['password'] == _passwordController.text,
        );

        if (userExists) {
          // Obtener la lista de productos después de validar al usuario
          await _fetchProductsAndNavigate();
        } else {
          setState(() {
            _errorMessage = 'Email o contraseña incorrectos';
          });
        }
      } else {
        setState(() {
          _errorMessage = 'Error en el servidor. Inténtalo nuevamente.';
        });
      }
    } catch (e) {
      setState(() {
        _isLoading = false;
        _errorMessage = 'Ocurrió un error. Revisa tu conexión y vuelve a intentar.';
      });
      print("Error de conexión: $e");
    }
  }

  Future<void> _fetchProductsAndNavigate() async {
    setState(() {
      _isLoading = true;
    });

    final url = Uri.parse("https://c548-186-1-186-185.ngrok-free.app/products"); // Reemplaza con tu endpoint de productos
    try {
      final response = await http.get(url);

      setState(() {
        _isLoading = false;
      });

      if (response.statusCode == 200) {
        final List<dynamic> productData = jsonDecode(response.body);

        // Convierte los productos a una lista de objetos Products
        List<Product> products = productFromJson(jsonEncode(productData));

        // Navega a DatoPage con la lista de productos
        Navigator.pushReplacement(
          context,
          MaterialPageRoute(
            builder: (context) => DatoPage(products: products),
          ),
        );
      } else {
        setState(() {
          _errorMessage = 'Error al obtener productos. Inténtalo nuevamente.';
        });
      }
    } catch (e) {
      setState(() {
        _isLoading = false;
        _errorMessage = 'Ocurrió un error al obtener productos. Revisa tu conexión y vuelve a intentar.';
      });
      print("Error de conexión: $e");
    }
  }

  @override
  Widget build(BuildContext context) {
    return Container(
      decoration: const BoxDecoration(
          gradient: LinearGradient(
        begin: Alignment.topRight,
        end: Alignment.bottomLeft,
        colors: [
          Colors.purple, // Color de fondo morado
          Colors.deepPurple, // Color de fondo morado oscuro
        ],
      )),
      child: Scaffold(
        backgroundColor: Colors.transparent,
        body: Padding(
          padding: const EdgeInsets.all(32.0),
          child: Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                
                const SizedBox(height: 50),
                _inputField("Email", _usernameController),
                const SizedBox(height: 20),
                _inputField("Password", _passwordController, isPassword: true),
                const SizedBox(height: 50),
                _isLoading
                    ? CircularProgressIndicator()
                    : _loginBtn(),
                const SizedBox(height: 20),
                if (_errorMessage != null)
                  Text(
                    _errorMessage!,
                    style: TextStyle(color: Colors.red),
                  ),
                _extraText(),
              ],
            ),
          ),
        ),
      ),
    );
  }

  

  Widget _inputField(String hintText, TextEditingController controller,
      {isPassword = false}) {
    var border = OutlineInputBorder(
        borderRadius: BorderRadius.circular(18),
        borderSide: const BorderSide(color: Colors.white));

    return TextField(
      style: const TextStyle(color: Colors.white),
      controller: controller,
      decoration: InputDecoration(
        hintText: hintText,
        hintStyle: const TextStyle(color: Colors.white),
        enabledBorder: border,
        focusedBorder: border,
      ),
      obscureText: isPassword,
    );
  }

  Widget _loginBtn() {
    return ElevatedButton(
      onPressed: () {
        _login();
      },
      child: const SizedBox(
          width: double.infinity,
          child: Text(
            "Sign in",
            textAlign: TextAlign.center,
            style: TextStyle(fontSize: 20),
          )),
      style: ElevatedButton.styleFrom(
        foregroundColor: Colors.purple, // Color del texto del botón
        shape: const StadiumBorder(), 
        backgroundColor: Colors.white, // Color de fondo del botón
        padding: const EdgeInsets.symmetric(vertical: 16),
      ),
    );
  }

  Widget _extraText() {
    return const Text(
      "Can't access to your account?",
      textAlign: TextAlign.center,
      style: TextStyle(fontSize: 16, color: Colors.white),
    );
  }
}
