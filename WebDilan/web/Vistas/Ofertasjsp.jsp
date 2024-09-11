<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ofertas del Día - Paraíso del Artesano</title>
    <link rel="stylesheet" href="/Artesania/CSS/pagweb.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Estilos para el body y la estructura principal */
        html, body {
            height: 100%;
            margin: 0;
        }

        body {
            display: flex;
            flex-direction: column;
        }

        .contenido {
            flex: 1;
            background-color: #fff; /* Blanco */
            padding: 40px 0;
        }

        /* Estilos para el header */
        #partesuperior {
            background: linear-gradient(135deg, #4CAF50, #2E7D32); /* Gradiente verde */
            color: white;
        }

        #partesuperior .navbar-brand,
        #partesuperior .navbar-nav .nav-link {
            color: white;
        }

        #partesuperior .navbar-nav .nav-link.active {
            color: #ffc107;
        }

        /* Estilos para las tarjetas */
        .card {
            transition: transform 0.3s ease-in-out, box-shadow 0.3s ease-in-out;
            cursor: pointer;
            border: 1px solid #ddd; /* Borde de la tarjeta */
            border-radius: 8px; /* Bordes redondeados */
        }

        .card:hover {
            transform: scale(1.05);
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.3); /* Sombra más pronunciada */
        }

        /* Botones personalizados */
        .btn-custom {
            background: linear-gradient(135deg, #4CAF50, #388E3C); /* Gradiente verde */
            color: white;
            border-radius: 50px;
            transition: background-color 0.3s ease-in-out;
        }

        .btn-custom:hover {
            background: linear-gradient(135deg, #388E3C, #2E7D32); /* Gradiente verde más oscuro */
        }

        /* Estilos para el footer */
        footer {
            background: linear-gradient(135deg, #4CAF50, #2E7D32); /* Gradiente verde */
            color: white;
            text-align: center;
            padding: 40px 20px;
            box-shadow: 0 -4px 8px rgba(0, 0, 0, 0.2); /* Sombra superior para un efecto flotante */
        }

        footer p {
            margin: 0;
        }

        /* Animaciones suaves para scroll */
        html {
            scroll-behavior: smooth;
        }

        /* Animación de scroll suave para los enlaces de navegación */
        .nav-link {
            transition: color 0.3s ease;
        }

        .nav-link:hover {
            color: #ffffff;
        }
    </style>
</head>
<body>
    <header>
        <nav class="navbar navbar-expand-lg" id="partesuperior">
            <div class="container-fluid">
                <a class="navbar-brand" href="#"><b>Paraíso Del Artesano</b></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item"><a class="nav-link" href="index.html"><b>Inicio</b></a></li>
                        <li class="nav-item"><a class="nav-link" href="contacto.html"><b>Contacto</b></a></li>
                        <li class="nav-item"><a class="nav-link" href="novedades.html"><img src="icons8-marca-de-verificación-48.png" alt=""><b>Novedades</b></a></li>
                        <li class="nav-item"><a class="nav-link active" href="#"><img src="icons8-dólar-estadounidense-en-círculo-100.png" alt="" width="50px"><b>Ofertas del Día</b></a></li>
                    </ul>
                    <div class="d-flex align-items-center">
                        <a href="carrito.html" class="nav-link"><img src="icons8-carrito-de-compras-64.png" alt="" width="40px"></a>
                        <a href="mi_cuenta.html" class="nav-link"><b>Mi Cuenta</b></a>
                    </div>
                </div>
            </div>
        </nav>
    </header>

    <div class="contenido">
        <div class="container">
            <h1 class="text-center my-5">Ofertas del Día</h1>
            <div class="row row-cols-1 row-cols-md-3 g-4">
                <!-- Aquí puedes agregar las tarjetas de ofertas -->
                <div class="col">
                    <div class="card h-100 text-center">
                        <img src="oferta1.png" class="card-img-top" alt="Oferta 1">
                        <div class="card-body">
                            <h5 class="card-title">Oferta 1</h5>
                            <p class="card-text">Descripción de la oferta 1.</p>
                            <a href="#" class="btn btn-custom btn-lg">Ver ></a>
                        </div>
                    </div>
                </div>
                <!-- Repetir para más ofertas -->
            </div>
        </div>
    </div>

    <footer> 
        <p>&copy; 2024 Paraíso del Artesano. Todos los derechos reservados.</p>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
