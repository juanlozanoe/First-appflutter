import 'package:flutter/material.dart';
import '../models/products.dart';

class DatosList extends StatelessWidget {
  final List<Products> products;

  const DatosList({
    Key? key,
    required this.products,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Lista de Productos'),
        actions: [
          IconButton(
            icon: Icon(Icons.logout),
            onPressed: () => _logout(context),
          ),
        ],
      ),
      body: ListView.builder(
        itemCount: products.length,
        itemBuilder: (context, index) {
          final product = products[index];
          return Card(
            elevation: 2,
            margin: EdgeInsets.symmetric(vertical: 8, horizontal: 16),
            child: ListTile(
              leading: CircleAvatar(
                backgroundImage: AssetImage('assets/${product.photo}'), // Muestra la imagen del producto
              ),
              title: Text(product.nameProduct),
              subtitle: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text('Precio: ${product.price}'),
                  SizedBox(height: 4),
                  Text('Descripción: ${product.description}'),
                ],
              ),
              trailing: Icon(Icons.arrow_forward_ios),
              onTap: () {
                _showProductDetails(context, product);
              },
            ),
          );
        },
      ),
    );
  }

  // Método para mostrar detalles del producto
  void _showProductDetails(BuildContext context, Products product) {
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        title: Text(product.nameProduct),
        content: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          mainAxisSize: MainAxisSize.min,
          children: [
            Text('Precio: ${product.price}'),
            SizedBox(height: 8),
            Text('Descripción: ${product.description}'),
            SizedBox(height: 8),
            Text('Categoría ID: ${product.categoryId}'),
          ],
        ),
        actions: [
          TextButton(
            onPressed: () {
              Navigator.of(context).pop();
            },
            child: Text('Cerrar'),
          ),
        ],
      ),
    );
  }

  // Método para cerrar sesión
  void _logout(BuildContext context) {
    Navigator.of(context).popUntil((route) => route.isFirst); // Navegar a la primera página (HomePage)
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(content: Text('Sesión cerrada')),
    );
  }
}
