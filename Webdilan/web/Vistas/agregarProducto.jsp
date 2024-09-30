<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Deco Artesanía - Agregar Producto</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <link href="/Webdilan/CSS/StyleGeneral.css" rel="stylesheet" type="text/css"/>  
    </head>
    <body>
        <header class="bg-success">
            <nav class="navbar navbar-expand-lg navbar-dark bg-success">
                <div class="container-fluid">
                    <!-- Logo o título -->
                    <a class="navbar-brand" href="#">
                        <h1 class="mb-0 text-white">Deco Artesanía</h1>
                    </a>

                    <!-- Toggle button for mobile view -->
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <!-- Navbar links and icons -->
                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link text-white" href="#">Inventario</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="/Webdilan/CtrProductos?accion=homeAdmin">Productos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="#">Pedidos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="#">Usuarios</a>
                            </li>
                        </ul>

                        <!-- Button to add new products and icons -->
                        <div class="d-flex align-items-center ms-auto">
                            <div class="dropdown">
                                <a class="nav-link dropdown-toggle text-white" href="#" role="button" id="userDropdown" data-bs-toggle="dropdown" aria-expanded="false">
                                    <i class="bi bi-person-circle"></i>
                                </a>
                                <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="userDropdown">
                                    <li><a class="dropdown-item" href="/Webdilan/CtrProductos?accion=salir">Salir</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </nav>
        </header>

        <div class="container mt-5">
            <h1>Gestión de Productos</h1>

            <!-- Formulario para agregar/editar productos -->
            <div class="form-container">
                <h2>Agregar Producto</h2>
                <form id="productForm"  action="/Webdilan/CtrProductos?accion=Agregar" method="POST" enctype="multipart/form-dsata">
                    <div class="mb-3">    
                        <label for="name" class="form-label">Nombre del Producto:</label>
                        <input type="text" class="form-control" id="txtnombre" name="name" placeholder="Producto X" required>
                    </div>
                    <div class="mb-3">
                        <label>Imagen</label> 
                        <input type="file" class="form-control" name="foto" id="foto" required="">
                    </div>
                    <div class="mb-3">
                        <label for="description" class="form-label">Descripción:</label>
                        <textarea class="form-control" id="txtdescripcion" name="description" rows="3" placeholder="Descripción del producto" required></textarea>
                    </div>
                    <div class="mb-3">
                        <label for="price" class="form-label">Precio:</label>
                        <input type="number" class="form-control" id="txtprecio" name="price" placeholder="00.00" step="0.01" required>
                    </div>
                    <div class="mb-3">
                        <label for="stock" class="form-label">Stock:</label>
                        <input type="number" class="form-control" id="txtstock" name="stock" placeholder="Cantidad en stock" required>
                    </div>

                    <button type="submit" value="Agregar" class="btn btn-primary">Guardar</button>
                </form>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    </body>
</html>
