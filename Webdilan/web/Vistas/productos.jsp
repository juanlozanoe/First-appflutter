<!DOCTYPE html>
<html lang="es">
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Deco Artesanía - Productos</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link href="/Webdilan/CSS/StyleGeneral.css" rel="stylesheet" type="text/css"/>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
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
                        <a class="nav-link text-white" href="/Webdilan/CtrProductos?accion=homeAdmin">Productos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-white" href="/Webdilan/CtrPedido?accion=listarPedido">Pedidos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-white" href="/Webdilan/CtrUsuario?accion=listarUsers">Usuarios</a>
                    </li>
                </ul>

                <!-- Button to add new products and icons -->
                <div class="d-flex align-items-center ms-auto">
                    <div class="dropdown">
                        <a class="nav-link dropdown-toggle text-white" href="#" role="button" id="userDropdown" data-bs-toggle="dropdown" aria-expanded="false">
                            <i class="bi bi-person-circle"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="userDropdown">
                            <li><a class="dropdown-item" href="#">Admin</a></li>
                            <li><a class="dropdown-item" href="/Webdilan/CtrProductos?accion=salir">Salir</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </nav>
</header>

<div class="container mt-5">
    <a class="btn btn-light text-success me-3" href="/Webdilan/Vistas/agregarProducto.jsp" role="button">
        Agregar Producto <i class="bi bi-plus-circle"></i>
    </a>
    <section class="py-5">
        <h3 class="text-center mb-4">Productos</h3>
        <div class="row">
            <c:forEach var="c" items="${Productos}">
                <div class="col-md-4 mb-4">
                    <div class="card h-100">
                        <img src="${c.getFoto()}" class="card-img-top img" alt="Producto">
                        <div class="card-body d-flex flex-column">
                            <h5 class="card-title">${c.getNombre()}</h5>
                            <p class="card-text">Precio: ${c.getPrecio()}</p>
                            <div class="mt-auto">
                                <a href="/Webdilan/CtrProductos?accion=editar&id=${c.getId()}">
                                    <button class="btn btn-primary w-100 mb-2">
                                    Editar <i class="bi bi-highlighter"></i>
                                </button>
                                </a>
                                
                                    <a href="/Webdilan/CtrProductos?accion=eliminar&id=${c.getId()}">
                                        <button class="btn btn-danger w-100">
                                            Eliminar <i class="bi bi-trash"></i>
                                        </button>
                                    </a>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </section>
</div>

<footer class="bg-dark text-light py-3">
    <div class="container text-center">
        <p class="mb-0">&copy; 2024 Deco Artesanía. Todos los derechos reservados.</p>
    </div>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</body>
</html>
