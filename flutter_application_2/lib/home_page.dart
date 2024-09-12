import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'auth_service.dart'; // Servicio de autenticación
import 'login_form.dart'; // Formulario de inicio de sesión
import 'signup_form.dart'; // Formulario de registro
import 'models/products.dart'; // Modelo para los productos
import 'widgets/datos_list.dart'; // Lista para mostrar los productos
import 'widgets/carga_page.dart'; // Página de carga
import 'widgets/error_page.dart'; // Página de error

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  bool isLoggedIn = false; // Estado de autenticación
  AuthService authService = AuthService(); // Instancia del servicio de autenticación

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: isLoggedIn ? _buildLoggedIn() : _buildLoggedOut(),
    );
  }

  Widget _buildLoggedOut() {
    return Center(
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Text(
            'Para continuar, inicia sesión o regístrate.',
            style: TextStyle(fontSize: 20),
          ),
          SizedBox(height: 20),
          ElevatedButton(
            onPressed: () => _navigateToLogin(),
            child: Text('Iniciar Sesión'),
          ),
          ElevatedButton(
            onPressed: () => _navigateToSignup(),
            child: Text('Registrarse'),
          ),
        ],
      ),
    );
  }

  Widget _buildLoggedIn() {
    return Scaffold(
      appBar: AppBar(
        title: Text('Bienvenido'),
        actions: [
          IconButton(
            icon: Icon(Icons.logout),
            onPressed: () => _logout(),
          ),
        ],
      ),
      body: FutureBuilder<List<Products>>(
        future: getProductList(),
        builder: (context, snapshot) {
          if (snapshot.connectionState == ConnectionState.done) {
            if (snapshot.hasError) {
              return ErrorPage();
            } else if (snapshot.hasData) {
              return DatosList(products: snapshot.data!);
            } else {
              return Text('No hay datos disponibles');
            }
          } else {
            return CargaPage();
          }
        },
      ),
    );
  }

  Future<List<Products>> getProductList() async {
    final url = Uri.parse('https://tu-api-url.ngrok-free.app/products'); // Actualiza con tu URL de API
    final response = await http.get(url);

    if (response.statusCode == 200) {
      return productsFromJson(response.body); // Convertir JSON a objetos Products
    } else {
      throw Exception('Error al cargar los productos');
    }
  }

  void _navigateToLogin() {
    Navigator.push(
      context,
      MaterialPageRoute(
        builder: (context) => LoginForm(
          onLoginSuccess: () => setState(() {
            isLoggedIn = true;
          }),
          authService: authService,
        ),
      ),
    );
  }

  void _navigateToSignup() {
    Navigator.push(
      context,
      MaterialPageRoute(
        builder: (context) => SignupForm(authService: authService),
      ),
    );
  }

  void _logout() {
    setState(() {
      isLoggedIn = false;
    });
  }
}
