<!DOCTYPE html>
<html lang="es">
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Deco Artesanía - Confirmar Pago</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link href="/Webdilan/CSS/StyleGeneral.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <!-- Reutilizando el header existente -->
    <header class="header bg-success">
        <div class="container-fluid d-flex justify-content-between align-items-center p-3">
            <a href="/Webdilan/CtrProductos?accion=home"><h1 class="mb-0 text-white">Deco Artesanía</h1></a>
            <div class="d-flex align-items-center">
                <a href="#" class="nav-link text-white"><i class="bi bi-search"></i></a>
                <a href="#" class="nav-link text-white ms-3">
                    <i class="bi bi-cart3"></i><span class="badge bg-danger rounded-pill">${contador}</span>
                </a>
                <div class="dropdown ms-3">
                    <a class="nav-link dropdown-toggle text-white" href="#" role="button" id="userDropdown" data-bs-toggle="dropdown">
                        <i class="bi bi-person-circle"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-menu-end">
                        <li><a class="dropdown-item" href="#">Usuario</a></li>
                        <li><a class="dropdown-item" href="/Webdilan/CtrProductos?accion=salir">Salir</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header>

    <div class="container mt-5">
        <h1>Confirmar Compra</h1>
        <!-- Usando JSTL para mostrar los productos del carrito -->
        <c:forEach var="car" items="${ListaCarrito}">
            <div class="card mt-4">
                <div class="card-body">
                    <h2 class="card-title">${car.nombreProducto}</h2>
                    <p class="card-text">Precio unitario: $${car.precioProducto}</p>
                    <p class="card-text">Subtotal: $${car.total}</p>
                    <div class="d-flex justify-content-center mt-4">
                        <!-- Realizar el pedido pasando el id del producto y el total -->
                        <a href="/Webdilan/CtrProductos?accion=realizarPedido&idProducto=${car.getIdProducto()}&total=${car.total}" class="btn btn-success">Pagar</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
