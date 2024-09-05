import 'package:proyectomovil/Widgets/usuario.dart';

class AuthService {
  Future<bool> login(Usuario user) async {
    // Verifica si las credenciales son correctas
    if (user.username == "abel" && user.password == "mattos") {
      // Simula un proceso de inicio de sesión exitoso
      await Future.delayed(Duration(seconds: 1));
      return true;
    } else {
      // Simula un proceso de inicio de sesión fallido
      await Future.delayed(Duration(seconds: 1));
      return false;
    }
  }
}
