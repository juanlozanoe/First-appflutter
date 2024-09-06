<%-- 
    Document   : seguimiento-producto
    Created on : 23/08/2024, 09:57:09 AM
    Author     : Usuario
--%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Seguimiento del Producto - Paraiso del Artesano</title>
    <link rel="stylesheet" href="/Artesania/CSS/pagweb.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: #56ab2f;
            background: -webkit-linear-gradient(to right, #a8e063, #56ab2f);
            background: linear-gradient(to right, #a8e063, #56ab2f);
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            font-style: italic;
        }

        header {
            background: linear-gradient(45deg, #11998e, #38ef7d);
            padding: 10px;
            color: white;
        }

        .main-container {
            margin: 50px auto;
            max-width: 1200px;
            text-align: center;
        }

        .timeline {
            position: relative;
            max-width: 1000px;
            margin: 0 auto;
        }

        .timeline::after {
            content: '';
            position: absolute;
            width: 6px;
            background-color: #56ab2f;
            top: 0;
            bottom: 0;
            left: 50%;
            margin-left: -3px;
        }

        .timeline-item {
            padding: 20px;
            position: relative;
            width: 50%;
            box-sizing: border-box;
        }

        .timeline-item.left {
            left: 0;
        }

        .timeline-item.right {
            left: 50%;
        }

        .timeline-item::before {
            content: '';
            position: absolute;
            width: 25px;
            height: 25px;
            right: -12px;
            background-color: white;
            border: 4px solid #56ab2f;
            top: 15px;
            border-radius: 50%;
            z-index: 1;
        }

        .timeline-item.right::before {
            left: -12px;
        }

        .timeline-item-content {
            padding: 20px;
            background-color: white;
            position: relative;
            border-radius: 6px;
        }

        .status {
            font-size: 18px;
            color: #38ef7d;
            font-weight: bold;
            text-align: left;
        }

        .timeline-item.right .status {
            text-align: right;
        }

        .timeline-item-content p {
            margin: 0;
            font-size: 16px;
        }

        .timeline-item-content span {
            display: block;
            margin-top: 10px;
            font-size: 12px;
            color: #aaa;
        }

        /* Animaci�n */
        .timeline-item-content {
            animation: fadeInUp 0.5s ease;
        }

        @keyframes fadeInUp {
            from {
                opacity: 0;
                transform: translateY(20px);
            }

            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        .current {
            background-color: #38ef7d !important;
        }
    </style>
</head>

<body>
    <header>
        <nav class="navbar navbar-expand-lg" id="partesuperior">
            <div class="container-fluid">
                <a class="navbar-brand" href="#"><b>Paraiso Del Artesano</b></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item"><a class="nav-link active" href="#"><b>PQR</b></a></li>
                        <li class="nav-item"><a class="nav-link active" href="#"><b>Inicio</b></a></li>
                        <li class="nav-item"><a class="nav-link" href="#"><b>Contacto</b></a></li>
                        <li class="nav-item"><a class="nav-link" href="novedades.html"><b>Novedades</b></a></li>
                        <a href="carrito.html" class="nav-link"><img src="imagenes\carrito-de-compras.png" alt="" width="40px"></a>
                        <a href="#" class="nav-link"><img src="imagenes/person-circle.svg" alt="Carrito de compras"
                                width="40px"><b>Mi Cuenta</b></a>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <div class="main-container">
        <h1>Seguimiento de tu Pedido</h1>
        <div class="timeline">
            <div class="timeline-item left">
                <div class="timeline-item-content">
                    <div class="status">Pedido Realizado</div>
                    <p>Tu pedido ha sido recibido y est� en proceso.</p>
                    <span>14 Agosto 2024, 10:00 AM</span>
                </div>
            </div>
            <div class="timeline-item right">
                <div class="timeline-item-content">
                    <div class="status">Pedido Empaquetado</div>
                    <p>El pedido ha sido empaquetado y est� listo para ser enviado.</p>
                    <span>14 Agosto 2024, 2:00 PM</span>
                </div>
            </div>
            <div class="timeline-item left current">
                <div class="timeline-item-content">
                    <div class="status">En Tr�nsito</div>
                    <p>Tu pedido est� en camino.</p>
                    <span>15 Agosto 2024, 9:00 AM</span>
                </div>
            </div>
            <div class="timeline-item right">
                <div class="timeline-item-content">
                    <div class="status">Entregado</div>
                    <p>Tu pedido ha sido entregado.</p>
                    <span>15 Agosto 2024, 1:00 PM</span>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>

