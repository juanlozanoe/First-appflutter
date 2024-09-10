<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home - Deco-Artesanías</title>
    <link rel="stylesheet" href="Home_cliente.jsp.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="../Css/Homeusuariocss.css" rel="stylesheet" type="text/css"/>
</head>
<body>

    <!-- Header -->
    <header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="#">DECO Artesanías</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item"><a class="nav-link active" href="#">Inicio</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Novedades</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Ofertas</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Contacto</a></li>
                        <li class="nav-item"><a class="nav-link" href="#"><img src="cart-icon.png" alt="Carrito" width="30"></a></li>
                        <li class="nav-item"><a class="nav-link" href="#"><img src="user-icon.png" alt="Mi Cuenta" width="30"> Mi Cuenta</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    
    <!-- Main Content -->
    <main>
        <!-- Hero Section -->
        <section class="hero bg-light text-center py-5">
            <div class="container">
                <h1 class="display-4">Descubre nuestras artesanías únicas</h1>
                <p class="lead">Artículos hechos a mano que reflejan la riqueza cultural de nuestra región.</p>
                <a href="#" class="btn btn-primary">Ver Novedades</a>
                <a href="#" class="btn btn-secondary">Ofertas Especiales</a>
            </div>
        </section>

        <!-- Product Grid -->
        <section class="products py-5">
            <div class="container">
                <h2 class="text-center mb-4">Nuestros Productos</h2>
                <div class="row">
                    <div class="col-md-4">
                        <div class="card mb-4">
                            <img src="product1.jpg" class="card-img-top" alt="Producto 1">
                            <div class="card-body">
                                <h5 class="card-title">Producto 1</h5>
                                <p class="card-text">$20.00</p>
                                <a href="#" class="btn btn-primary">Comprar</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="card mb-4">
                            <img src="product2.jpg" class="card-img-top" alt="Producto 2">
                            <div class="card-body">
                                <h5 class="card-title">Producto 2</h5>
                                <p class="card-text">$30.00</p>
                                <a href="#" class="btn btn-primary">Comprar</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="card mb-4">
                            <img src="product3.jpg" class="card-img-top" alt="Producto 3">
                            <div class="card-body">
                                <h5 class="card-title">Producto 3</h5>
                                <p class="card-text">$25.00</p>
                                <a href="#" class="btn btn-primary">Comprar</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- Footer -->
        <footer class="bg-dark text-white text-center py-3">
            <p>&copy; 2024 DECO Artesanías. Todos los derechos reservados.</p>
            <div class="footer-icons">
                <a href="#" class="text-white me-2"><img src="facebook-icon.png" alt="Facebook" width="30"></a>
                <a href="#" class="text-white"><img src="instagram-icon.png" alt="Instagram" width="30"></a>
            </div>
        </footer>
    </main>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
