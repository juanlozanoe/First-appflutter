import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';
import 'models/product.dart';
import 'widgets/carga_page.dart';
import 'widgets/datos_page.dart';
import 'widgets/error_page.dart';

class HomePage extends StatelessWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      
      body: FutureBuilder<List<Product>>(
        future: getList(),
        
        builder: (BuildContext context, AsyncSnapshot<List<Product>> snapshot) {
          if (snapshot.connectionState == ConnectionState.done) {
            if (snapshot.hasError) {
              print('Error: ${snapshot.error}');
              return ErrorPage();
            } else if (snapshot.hasData) {
              return DatoPage(products: snapshot.data!);
            }
          }
          return CargaPage();
        },
      ),
    );
  }

  Future<List<Product>> getList() async {
    final url = Uri.parse("https://c548-186-1-186-185.ngrok-free.app/products");
    final response = await http.get(url);
    if (response.statusCode == 200) {
      final info = jsonDecode(response.body);
      print(info);
      return productFromJson(jsonEncode(info));
    } else {
      throw 'Error';
    }
  }
}
