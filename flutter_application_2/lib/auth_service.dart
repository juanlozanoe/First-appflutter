import 'package:http/http.dart' as http;

class AuthService {
  final String baseUrl = 'https://tu-api-url.ngrok-free.app';

  Future<http.Response> login(String username, String password) {
    final url = Uri.parse('$baseUrl/login');
    return http.post(
      url,
      body: {'username': username, 'password': password},
    );
  }

  Future<http.Response> signup(String username, String password, String email) {
    final url = Uri.parse('$baseUrl/users');
    return http.post(
      url,
      body: {'username': username, 'password': password, 'email': email},
    );
  }
}
