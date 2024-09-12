import 'dart:convert';

List<Products> productsFromJson(String str) => List<Products>.from(json.decode(str).map((x) => Products.fromJson(x)));

String productsToJson(List<Products> data) => json.encode(List<dynamic>.from(data.map((x) => x.toJson())));

class Products {
    int id;
    String price;
    String nameProduct;
    String photo;
    String description;
    int stock;
    int categoryId;
    DateTime createdAt;
    DateTime updatedAt;

    Products({
        required this.id,
        required this.price,
        required this.nameProduct,
        required this.photo,
        required this.description,
        required this.stock,
        required this.categoryId,
        required this.createdAt,
        required this.updatedAt,
    });

    factory Products.fromJson(Map<String, dynamic> json) => Products(
        id: json["id"],
        price: json["price"],
        nameProduct: json["name_product"],
        photo: json["photo"],
        description: json["description"],
        stock: json["stock"],
        categoryId: json["category_id"],
        createdAt: DateTime.parse(json["created_at"]),
        updatedAt: DateTime.parse(json["updated_at"]),
    );

    Map<String, dynamic> toJson() => {
        "id": id,
        "price": price,
        "name_product": nameProduct,
        "photo": photo,
        "description": description,
        "stock": stock,
        "category_id": categoryId,
        "created_at": createdAt.toIso8601String(),
        "updated_at": updatedAt.toIso8601String(),
    };
}