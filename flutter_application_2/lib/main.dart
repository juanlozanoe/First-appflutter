import 'package:flutter/material.dart';
import 'home_page.dart';
import 'auth_service.dart'; // Importa el servicio de autenticación

void main() {
  runApp(Miclase());
}

class Miclase extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'My App',
      debugShowCheckedModeBanner: false,
      home: HomePage(),
    );
  }
}
