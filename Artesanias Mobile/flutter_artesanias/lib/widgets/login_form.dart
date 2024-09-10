import 'package:flutter/material.dart';
import 'package:flutter_artesanias/home_page.dart';
import 'package:flutter_artesanias/widgets/servicio.dart';
import 'package:flutter_artesanias/widgets/usuario.dart';



class LoginForm extends StatefulWidget {
  final Function onLoginSuccess;
  final AuthService authService;

  const LoginForm({Key? key, required this.onLoginSuccess, required this.authService})
      : super(key: key);

  @override
  _LoginFormState createState() => _LoginFormState();
}

class _LoginFormState extends State<LoginForm> {
  final TextEditingController _usernameController = TextEditingController();
  final TextEditingController _passwordController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Iniciar Sesión')),
      body: Padding(
        padding: const EdgeInsets.all(20.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            TextField(
              controller: _usernameController,
              decoration: InputDecoration(labelText: 'Nombre de usuario'),
            ),
            TextField(
              controller: _passwordController,
              obscureText: true,
              decoration: InputDecoration(labelText: 'Contraseña'),
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () async {
                final username = _usernameController.text;
                final password = _passwordController.text;
                Usuario user = Usuario(username: username, password: password);
                bool loggedIn = await widget.authService.login(user);
                if (loggedIn) {
                  widget.onLoginSuccess();
                  Navigator.pop(context); // Regresa a la página anterior (LoginForm)
                  Navigator.pushReplacement( // Reemplaza la ruta actual con HomePage
                    context,
                    MaterialPageRoute(builder: (context) => HomePage()),
                  );
                } else {
                  // Maneja el caso en que el inicio de sesión falla
                  ScaffoldMessenger.of(context).showSnackBar(
                    SnackBar(content: Text('Inicio de sesión fallido')),
                  );
                }
              },
              child: Text('Iniciar Sesión'),
            ),
          ],
        ),
      ),
    );
  }
}