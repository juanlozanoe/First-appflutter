


import 'dart:convert';

List<Artesanium> artesaniumFromJson(String str) => List<Artesanium>.from(json.decode(str).map((x) => Artesanium.fromJson(x)));

String artesaniumToJson(List<Artesanium> data) => json.encode(List<dynamic>.from(data.map((x) => x.toJson())));

class Artesanium {
    int id;
    String nombre;
    String categoria;
    String precio;
    Unidad unidad;
    String descripcion;
    DateTime createdAt;
    DateTime updatedAt;

    Artesanium({
        required this.id,
        required this.nombre,
        required this.categoria,
        required this.precio,
        required this.unidad,
        required this.descripcion,
        required this.createdAt,
        required this.updatedAt,
    });

    factory Artesanium.fromJson(Map<String, dynamic> json) => Artesanium(
        id: json["id"],
        nombre: json["nombre"],
        categoria: json["categoria"],
        precio: json["precio"],
        unidad: unidadValues.map[json["unidad"]]!,
        descripcion: json["descripcion"],
        createdAt: DateTime.parse(json["created_at"]),
        updatedAt: DateTime.parse(json["updated_at"]),
    );

    Map<String, dynamic> toJson() => {
        "id": id,
        "nombre": nombre,
        "categoria": categoria,
        "precio": precio,
        "unidad": unidadValues.reverse[unidad],
        "descripcion": descripcion,
        "created_at": createdAt.toIso8601String(),
        "updated_at": updatedAt.toIso8601String(),
    };
}

enum Unidad {
    PIEZA
}

final unidadValues = EnumValues({
    "Pieza": Unidad.PIEZA
});

class EnumValues<T> {
    Map<String, T> map;
    late Map<T, String> reverseMap;

    EnumValues(this.map);

    Map<T, String> get reverse {
            reverseMap = map.map((k, v) => MapEntry(v, k));
            return reverseMap;
    }
class Artesanium{
  String? name;
}

