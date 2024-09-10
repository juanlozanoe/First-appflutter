import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:flutter_artesanias/widgets/datos_list.dart';
import 'package:http/http.dart' as http;
import 'Models/artesanias.dart'; // Asegúrate de que esta importación apunte a tu modelo Artesanium
import 'Widgets/carga_page.dart';
import 'Widgets/datos_list.dart';
import 'Widgets/error_page.dart';
import 'Widgets/login_form.dart';
import 'widgets/servicio.dart'; // Este widget debe mostrar una lista de Artesanium

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  bool isLoggedIn = false;
  AuthService authService = AuthService();

  void toggleLogin() {
    setState(() {
      isLoggedIn = !isLoggedIn;
    });
  }

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
            'Para continuar, inicia sesión.',
            style: TextStyle(fontSize: 20),
          ),
          SizedBox(height: 20),
          ElevatedButton(
            onPressed: () => _navigateToLogin(),
            child: Text('Iniciar Sesión'),
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
        body: FutureBuilder(
        builder: (context, snapshot) {
          if (snapshot.connectionState == ConnectionState.done) {
            if (snapshot.hasError) {
              return ErrorPage();
            }else if (snapshot.hasData) {
              return (DatosList(artesanias: [],));
            }
          }
          return CargaPage();
        },
        future: getList(),
      )
,
    );
  }

  Future<List<Artesanium>> getList() async {
    final url = Uri.parse('https://feb4-2803-1800-501a-5616-9908-2bf6-924f-8fe1.ngrok-free.app/artesanias'); // Actualiza la URL a tu endpoint de API
    final response = await http.get(url);
    
    if (response.statusCode == 200) {
      final List<dynamic> info = jsonDecode(response.body);
      return artesaniumFromJson(jsonEncode(info)); // Parsea el JSON a objetos Artesanium
    } else {
      throw Exception('Error al cargar las artesanías');
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

  void _logout() {
    setState(() {
      isLoggedIn = false;
    });
  }
}
