import 'package:flutter/material.dart';
import 'package:intl/intl.dart';
import '../models/product.dart';

class CarritoPage extends StatefulWidget {
  final List<Product> cartItems;

  const CarritoPage({Key? key, required this.cartItems}) : super(key: key);

  @override
  _CarritoPageState createState() => _CarritoPageState();
}

class _CarritoPageState extends State<CarritoPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Carrito de compras'),
      ),
      body: ListView.builder(
        itemCount: widget.cartItems.length,
        itemBuilder: (context, index) {
          final product = widget.cartItems[index];
          return ListTile(
            leading: CircleAvatar(
              backgroundImage: NetworkImage(product.avatar),
            ),
            title: Text(product.name),
            subtitle: Text('\$${NumberFormat('#,##0.00', 'en_US').format(product.price)}'),
            trailing: IconButton(
              icon: Icon(Icons.delete),
              onPressed: () {
                _removeFromCart(product);
              },
            ),
          );
        },
      ),
      bottomNavigationBar: BottomAppBar(
        child: Padding(
          padding: const EdgeInsets.all(16.0),
          child: Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: <Widget>[
              Text(
                'Subtotal: \$${_calculateSubtotal()}',
                style: TextStyle(fontSize: 18.0, fontWeight: FontWeight.bold),
              ),
              ElevatedButton(
                onPressed: () {
                  print("logica de la compra");
                },
                child: Text('Pagar'),
              ),
            ],
          ),
        ),
      ),
    );
  }

  void _removeFromCart(Product product) {
    setState(() {
      widget.cartItems.remove(product);
    });
  }
  
  String _calculateSubtotal() {
    String subtotal = "";
    for (var item in widget.cartItems) {
      subtotal += item.price;
    }
    return NumberFormat('#,##0.00', 'en_US').format(subtotal);
  }
}
