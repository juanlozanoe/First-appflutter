import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:proyectomovil/Models/peliculas.dart';

class DatoPage extends StatelessWidget {
  final List<Pelicula> peliculas;
  const DatoPage({
    Key? key,required this.peliculas,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return ListView.builder(
      itemCount: peliculas.length,
      itemBuilder: (context, index){
        final user = peliculas[index];
        return ListTile(
          trailing: const Icon(Icons.arrow_forward_ios),
          title: Text('${user.nombre} ${user.genero} ${user.duracion}'),
          subtitle: Text(user.descripcion),
        );
      }
    );
  }

}