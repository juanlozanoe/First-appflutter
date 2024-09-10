import 'package:flutter/material.dart';
import 'package:flutter_artesanias/models/artesanias.dart';

class DatosList extends StatelessWidget {
  final List<Artesanium> artesanias;

  const DatosList({
    Key? key,
    required this.artesanias,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Lista de Artesanías'),
      ),
      body: ListView.builder(
        itemCount: artesanias.length,
        itemBuilder: (context, index) {
          final artesania = artesanias[index];
          return Card(
            elevation: 2,
            margin: EdgeInsets.symmetric(vertical: 8, horizontal: 16),
            child: ListTile(
              leading: CircleAvatar(
                child: Text(artesania.nombre.isNotEmpty ? artesania.nombre[0] : '?'),
              ),
              title: Text(artesania.nombre),
              subtitle: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text('Categoría: ${artesania.categoria}'),
                  SizedBox(height: 4),
                  Text('Precio: ${artesania.precio} ${unidadValues.reverse[artesania.unidad]}'),
                  SizedBox(height: 4),
                  Text('Descripción: ${artesania.descripcion}'),
                ],
              ),
              trailing: Icon(Icons.arrow_forward_ios),
              onTap: () {
                _showArtesaniaDetails(context, artesania);
              },
            ),
          );
        },
      ),
    );
  }

  void _showArtesaniaDetails(BuildContext context, Artesanium artesania) {
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        title: Text(artesania.nombre),
        content: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          mainAxisSize: MainAxisSize.min,
          children: [
            Text('Categoría: ${artesania.categoria}'),
            SizedBox(height: 8),
            Text('Precio: ${artesania.precio} ${unidadValues.reverse[artesania.unidad]}'),
            SizedBox(height: 8),
            Text('Descripción: ${artesania.descripcion}'),
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
}
