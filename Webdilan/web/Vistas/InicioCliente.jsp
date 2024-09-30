<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Deco Artesanía</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <link href="/Webdilan/CSS/StyleGeneral.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <!-- Navbar -->
        <header class="header bg-success">
            <div class="container-fluid d-flex justify-content-between align-items-center p-3">
                <a href="/Webdilan/CtrProductos?accion=home&idUser=${idUser}"><h1 class="mb-0 text-white">Deco Artesanía</h1></a>
                <div class="d-flex align-items-center">
                 
                    <a href="/Webdilan/CtrPedido?accion=listarPedidoUser&idUser=${idUser}" class="nav-link text-white"><i class="bi bi-eye">Ver mi pedido</i></a>
                    <a href="/Webdilan/CtrProductos?accion=Carrito&idUser=${idUser}" class="nav-link text-white ms-3">
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

        <!-- Carrusel de Promociones -->
        <div id="carouselExampleControls" class="carousel slide my-4">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="/Webdilan/Imagenes/totot.jpg" class="d-block w-100" alt="Promoción 1">
                </div>
                <div class="carousel-item">
                    <img src="/Webdilan/Imagenes/totot.jpg" class="d-block w-100" alt="Promoción 2">
                </div>
                <div class="carousel-item">
                    <img src="/Webdilan/Imagenes/totot.jpg" class="d-block w-100" alt="Promoción 3">
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>

        <!-- Productos -->
        <main>
            <section class="py-5 px-4">
                <h3 class="text-center mb-4">Nuestros Productos</h3>
                <div class="container">
                    <div class="row">
                        <c:forEach var="c" items="${Productos}">
                            <div class="col-md-4 mb-4">
                                <div class="card h-100">
                                    <img src="${c.getFoto()}" class="card-img-top img" alt="Producto">
                                    <div class="card-body">
                                        <h5 class="card-title">${c.getNombre()}</h5>
                                        <p class="card-text">Precio: ${c.getPrecio()}</p>
                                        <div class="d-grid gap-2">
                                            <a href="/Webdilan/CtrProductos?accion=agregarCarrito&idProducto=${c.getId()}">
                                                <button class="btn btn-success w-100">
                                                    <i class="bi bi-cart-plus"></i> Agregar al Carrito
                                                </button>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </section>
        </main>

        <!-- Footer -->
        <footer class="footer bg-success text-white py-4">
            <div class="container d-flex flex-column flex-md-row justify-content-between align-items-center">
                <div class="mb-3 mb-md-0">
                    <h5 class="mb-2">Deco Artesanía</h5>
                    <p class="mb-0">Conectando artesanos con amantes del arte desde 2023</p>
                </div>
                <div class="d-flex footer-icons">
                    <i class="bi bi-facebook me-3"></i>
                    <i class="bi bi-instagram me-3"></i>
                    <i class="bi bi-twitter"></i>
                </div>
            </div>
        </footer>

        <!-- Scripts -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="/WebDilan/JS/manejoDetalle.js"></script>
    </body>
</html>
