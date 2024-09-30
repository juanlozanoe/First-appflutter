import 'package:flutter/material.dart';
import 'package:intl/intl.dart';
import 'package:sena_project/widgets/producto_details.dart';
import 'package:sena_project/widgets/search_page.dart';
import '../models/product.dart';
import '../widgets/carrito_compra.dart';

class DatoPage extends StatefulWidget {
  final List<Product> products;

  const DatoPage({
    Key? key,
    required this.products,
  }) : super(key: key);

  @override
  _DatoPageState createState() => _DatoPageState();
}

class _DatoPageState extends State<DatoPage> {
  List<Product> _cartItems = []; 
  String _searchQuery = '';

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          'Artesanias Deco',
          style: TextStyle(
            color: Colors.white,
          ),
        ),
        backgroundColor: Color.fromARGB(255, 59, 150, 25), // Color de fondo del app bar
        elevation: 0, // Sin sombra bajo el app bar
        actions: [
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: 12.0),
            child: IconButton(
              icon: Icon(Icons.search),
              color: Colors.white,
              onPressed: () {
                showSearch(context: context, delegate: ProductSearch(widget.products));
              },
            ),
          ),
        ],
      ),
      body: GridView.builder(
        gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
          crossAxisCount: 2,
          crossAxisSpacing: 10.0,
          mainAxisSpacing: 10.0,
          childAspectRatio: 0.7,
        ),
        itemCount: widget.products.length,
        itemBuilder: (context, index) {
          final product = widget.products[index];
          // Aplica la lógica de filtro según el texto de búsqueda
          if (_searchQuery.isNotEmpty &&
              !product.name.toLowerCase().contains(_searchQuery.toLowerCase())) {
            return Container(); 
          }
          return Card(
            margin: EdgeInsets.all(10.0),
            child: InkWell(
              onTap: () {
                ProductDetailsDialog.show(context, product);
              },
              child: Padding(
                padding: EdgeInsets.all(16.0),
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: <Widget>[
                    Container(
                      width: 80,
                      height: 80,
                      decoration: BoxDecoration(
                        shape: BoxShape.rectangle,
                        image: DecorationImage(
                          fit: BoxFit.cover,
                          image: NetworkImage(product.avatar),
                        ),
                      ),
                    ),
                    Text(
                      product.name,
                      style: TextStyle(
                        fontSize: 20.0,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    SizedBox(height: 8.0),
                    Text(
                      product.description,
                      style: TextStyle(fontSize: 16.0),
                    ),
                    SizedBox(height: 8.0),
                    ElevatedButton(
                      onPressed: () {
                        _addToCart(product);
                      },
                      
                      child: Text('Agregar al carrito'),
                    ),
                  ],
                ),
              ),
            ),
          );
        },
      ),
      floatingActionButton: FloatingActionButton.extended(
        onPressed: () {
          if (_cartItems.isNotEmpty) {
            Navigator.push(
              context,
              MaterialPageRoute(
                builder: (context) => CarritoPage(cartItems: _cartItems),
              ),
            ).then((value) {
              // Actualiza la lista _cartItems con el valor devuelto
              setState(() {
                _cartItems = value ?? []; 
              });
            });
          } else {
            showDialog(
              context: context,
              builder: (context) => AlertDialog(
                title: Text('Carrito de compras vacío'),
                content: Text('No hay productos en el carrito para proceder con el pago.'),
                actions: [
                  TextButton(
                    onPressed: () {
                      Navigator.of(context).pop();
                    },
                    child: Text('Aceptar'),
                  ),
                ],
              ),
            );
          }
        },
        icon: Icon(Icons.shopping_cart),
        label: Text('${_cartItems.length}'), // Muestra la cantidad total de productos en el carrito
        backgroundColor: Color.fromARGB(255, 115, 76, 122),
        foregroundColor: Colors.white,
      ),
      floatingActionButtonLocation: FloatingActionButtonLocation.endFloat,
    );
  }

  void _addToCart(Product product) {
    setState(() {
      _cartItems.add(product);
    });
  }
}