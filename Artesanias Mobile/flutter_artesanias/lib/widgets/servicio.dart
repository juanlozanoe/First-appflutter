import 'package:flutter_artesanias/widgets/usuario.dart'; // Ensure this import is correct

class AuthService {
  Future<bool> login(Usuario user) async {
    // Verifies if the credentials are correct
    if (user.username == "juan" && user.password == "1208") {
      // Simulates a successful login process
      await Future.delayed(Duration(seconds: 1));
      return true;
    } else {
      // Simulates a failed login process
      await Future.delayed(Duration(seconds: 1));
      return false;
    }
  }
}