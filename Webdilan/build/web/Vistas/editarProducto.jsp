<%-- 
    Document   : Editar-producto
    Created on : 14/09/2024, 08:59:31 AM
    Author     : Jashir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar Producto</title>
    <link rel="stylesheet" href="styles.css">
    <link href="/Webdilan/CSS/Editar-producto.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <div class="container">
        <h1>Editar Producto</h1>
        <form action="/edit-product" method="post" enctype="multipart/form-data">
            <label for="id">ID:</label>
            <input type="text" id="id" name="id" value="${pro.getId()}" readonly>
            
            <label for="name">Nombre:</label>
            <input type="text" id="name" name="name" value="${pro.getNombre()}" required>
            
            <label for="photo">Foto:</label>
            <input type="file" id="photo" name="photo" accept="image/*">
            <img id="preview" src="${pro.getFoto()}" alt="Vista Previa">
            
            <label for="description">Descripción:</label>
            <textarea id="description" name="description" required>${pro.getDescripcion()}</textarea>
            
            <label for="price">Precio:</label>
            <input type="number" id="price" name="price" step="0.01" value="${pro.getPrecio()}" required>
            
            <label for="stock">Stock:</label>
            <input type="number" id="stock" name="stock" value="${pro.getStock()}" required>
            
            <a href="/Webdilan/CtrProductos?accion=editarProducto&id=${pro.getId()}"><button type="submit">Actualizar Producto</button></a>
            
        </form>
    </div>
    <script>
        document.getElementById('photo').addEventListener('change', function(event) {
            const reader = new FileReader();
            reader.onload = function() {
                const preview = document.getElementById('preview');
                preview.src = reader.result;
                preview.style.display = 'block';
            }
            reader.readAsDataURL(event.target.files[0]);
        });
    </script>
</body>
</html>
