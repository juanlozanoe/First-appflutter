import 'package:flutter/material.dart';
import 'package:sena_project/models/product.dart';
import 'package:intl/intl.dart';
import 'package:sena_project/widgets/producto_details.dart';

class ProductSearch extends SearchDelegate<Product> {
  final List<Product> products;

  ProductSearch(this.products);

  @override
  List<Widget> buildActions(BuildContext context) {
    return [
      IconButton(
        icon: Icon(Icons.clear),
        onPressed: () {
          query = '';
        },
      ),
    ];
  }

  @override
  Widget buildLeading(BuildContext context) {
    return IconButton(
      icon: Icon(Icons.arrow_back),
      onPressed: () {
        Navigator.pop(context);
      },
    );
  }

  @override
  Widget buildResults(BuildContext context) {
    final List<Product> results = products
        .where((product) => product.name.toLowerCase().contains(query.toLowerCase()))
        .toList();
    return GridView.builder(
      gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
        crossAxisCount: 2,
        crossAxisSpacing: 10.0,
        mainAxisSpacing: 10.0,
        childAspectRatio: 0.7,
      ),
      itemCount: results.length,
      itemBuilder: (context, index) {
        final product = results[index];
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
                  Text(
                    '\$${NumberFormat('#,##0.00', 'en_US').format(product.price)}', // Precio formateado
                    style: TextStyle(
                      fontSize: 18.0,
                      fontWeight: FontWeight.bold,
                      color: Colors.green,
                    ),
                    
                  ),
                ],
              ),
            ),
          ),
        );
      },
      
    );
    
  }

  @override
  Widget buildSuggestions(BuildContext context) {
    // Devolvemos un contenedor vacío en lugar de la lista de sugerencias
    return Container();
  }
}
