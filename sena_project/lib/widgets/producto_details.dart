import 'package:flutter/material.dart';
import 'package:intl/intl.dart';
import '../models/product.dart';

class ProductDetailsDialog {
  static void show(BuildContext context, Product product) {
    showDialog(
      context: context,
      builder: (BuildContext context) {
        return AlertDialog(
          title: Text(product.name),
          content: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            mainAxisSize: MainAxisSize.min,
            children: <Widget>[
              Image.network(
                product.avatar,
                width: 150,
                height: 150,
                fit: BoxFit.cover,
              ),
              SizedBox(height: 16.0),
              Text(
                product.description,
                style: TextStyle(fontSize: 16.0),
              ),
              SizedBox(height: 8.0),
              Text(
                '\$${NumberFormat('#,##0.00', 'en_US').format(product.price)}',
                style: TextStyle(
                  fontSize: 18.0,
                  fontWeight: FontWeight.bold,
                  color: Colors.green,
                ),
              ),
            ],
          ),
          actions: <Widget>[
            TextButton(
              child: Text('Cerrar'),
              style: TextButton.styleFrom(
                foregroundColor: Color.fromARGB(255, 115, 76, 122),
              ),
              onPressed: () {
                Navigator.of(context).pop();
              },
            ),
            TextButton(
              child: Text('Comprar'),
              style: TextButton.styleFrom(
                foregroundColor: Color.fromARGB(255, 115, 76, 122),
              ),
              onPressed: () {
              },
            ),
          ],
        );
      },
    );
  }
}
