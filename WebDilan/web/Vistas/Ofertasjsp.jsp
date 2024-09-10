<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ofertas del D�a - Para�so del Artesano</title>
    <link rel="stylesheet" href="/Artesania/CSS/pagweb.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Estilos para el header */
        #partesuperior {
            background-color: #4CAF50; /* Verde claro */
            color: white;
        }

        #partesuperior .navbar-brand,
        #partesuperior .navbar-nav .nav-link {
            color: white;
        }

        #partesuperior .navbar-nav .nav-link.active {
            color: #ffc107;
        }

        .card {
            transition: transform 0.3s ease-in-out;
            cursor: pointer;
        }

        .card:hover {
            transform: scale(1.05);
        }

        .btn-custom {
            background-color: #4CAF50; /* Verde claro */
            color: white;
            border-radius: 50px;
        }

        .btn-custom:hover {
            background-color: #388E3C; /* Verde m�s oscuro */
        }

        #fondo_negro {
            background-color: #333; /* Gris oscuro */
            color: white;
            padding: 40px 0;
        }

        footer {
            background-color: #4CAF50; /* Verde claro */
            color: white;
            text-align: center;
            padding: 20px;
        }
    </style>
</head>
<body>
    <header>
        <nav class="navbar navbar-expand-lg" id="partesuperior">
            <div class="container-fluid">
                <a class="navbar-brand" href="#"><b>Para�so Del Artesano</b></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item"><a class="nav-link" href="index.html"><b>Inicio</b></a></li>
                        <li class="nav-item"><a class="nav-link" href="contacto.html"><b>Contacto</b></a></li>
                        <li class="nav-item"><a class="nav-link" href="novedades.html"><img src="icons8-marca-de-verificaci�n-48.png" alt=""><b>Novedades</b></a></li>
                        <li class="nav-item"><a class="nav-link active" href="#"><img src="icons8-d�lar-estadounidense-en-c�rculo-100.png" alt="" width="50px"><b>Ofertas del D�a</b></a></li>
                    </ul>
                    <div class="d-flex align-items-center">
                        <a href="carrito.html" class="nav-link"><img src="icons8-carrito-de-compras-64.png" alt="" width="40px"></a>
                        <a href="mi_cuenta.html" class="nav-link"><b>Mi Cuenta</b></a>
                    </div>
                </div>
            </div>
        </nav>
    </header>

    <div class="contenido" id="fondo_negro">
        <div class="container">
            <h1 class="text-center my-5">Ofertas del D�a</h1>
            <div class="row row-cols-1 row-cols-md-3 g-4">
                <!-- Aqu� puedes agregar las tarjetas de ofertas -->
                <div class="col">
                    <div class="card h-100 text-center">
                        <img src="oferta1.png" class="card-img-top" alt="Oferta 1">
                        <div class="card-body">
                            <h5 class="card-title">Oferta 1</h5>
                            <p class="card-text">Descripci�n de la oferta 1.</p>
                            <a href="#" class="btn btn-custom btn-lg">Ver ></a>
                        </div>
                    </div>
                </div>
                <!-- Repetir para m�s ofertas -->
            </div>
        </div>
    </div>

    <footer> 
        <p>&copy; 2024 Para�so del Artesano. Todos los derechos reservados.</p>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <script>
        // Animaci�n de scroll suave para los enlaces de navegaci�n
        document.querySelectorAll('a.nav-link').forEach(anchor => {
            anchor.addEventListener('click', function (e) {
                e.preventDefault();
                document.querySelector(this.getAttribute('href')).scrollIntoView({
                    behavior: 'smooth'
                });
            });
        });
    </script>
</body>
</html>
