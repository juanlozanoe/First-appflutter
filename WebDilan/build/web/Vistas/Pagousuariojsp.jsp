<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Proceder al Pago - Paraíso del Artesano</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Estilos personalizados -->
    <style>
        body {
            background-color: #f8f9fa; /* Fondo blanco */
        }
        header {
            background: linear-gradient(to right, #4caf50, #2c6b2f); /* Verde degradado */
            color: white;
        }
        .navbar-brand {
            color: white !important;
        }
        .card {
            border: 1px solid #ddd;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.2);
        }
        .card-header {
            background: #2c6b2f;
            color: white;
        }
        .btn-primary {
            background: #4caf50;
            border: none;
        }
        .btn-primary:hover {
            background: #388e3c;
        }
        footer {
            background: linear-gradient(to right, #4caf50, #2c6b2f);
            color: white;
            padding: 20px;
            position: relative;
            bottom: 0;
            width: 100%;
        }
        .footer-icons img {
            margin: 0 10px;
        }
        .footer-icons a {
            color: white;
        }
        .footer-icons a:hover {
            color: #d4e157;
        }
    </style>
</head>
<body>
    <header>
        <nav class="navbar navbar-expand-lg">
            <div class="container-fluid">
                <a class="navbar-brand" href="#"><b>DECO Artesanías</b></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item"><a class="nav-link active" href="#"><b>PQR</b></a></li>
                        <li class="nav-item"><a class="nav-link active" href="#"><b>Inicio</b></a></li>
                        <li class="nav-item"><a class="nav-link" href="#"><b>Contacto</b></a></li>
                        <li class="nav-item"><a class="nav-link" href="novedades.jsp"><b>Novedades</b></a></li>
                        <li class="nav-item">
                            <a href="carrito.jsp" class="nav-link"><img src="imagenes/carrito-de-compras.png" alt="Carrito de compras" width="40px"></a>
                        </li>
                        <li class="nav-item">
                            <a href="#" class="nav-link"><img src="imagenes/person-circle.svg" alt="Mi Cuenta" width="40px"><b>Mi Cuenta</b></a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <main class="container mt-5">
        <h1 class="mb-4 text-center" style="color: #333;">Proceder al Pago</h1>
        <div class="row">
            <div class="col-md-8">
                <div class="card">
                    <div class="card-header">
                        <h3>Detalles de Facturación</h3>
                    </div>
                    <div class="card-body">
                        <form action="payment" method="post">
                            <div class="mb-3">
                                <label for="nombreCompleto" class="form-label">Nombre Completo</label>
                                <input type="text" class="form-control" id="nombreCompleto" name="nombreCompleto" placeholder="Ingresa tu nombre completo" required>
                            </div>
                            <div class="mb-3">
                                <label for="direccion" class="form-label">Dirección</label>
                                <input type="text" class="form-control" id="direccion" name="direccion" placeholder="Ingresa tu dirección de envío" required>
                            </div>
                            <div class="mb-3">
                                <label for="telefono" class="form-label">Teléfono</label>
                                <input type="tel" class="form-control" id="telefono" name="telefono" placeholder="Ingresa tu número de teléfono" required>
                            </div>
                            <div class="mb-3">
                                <label for="email" class="form-label">Correo Electrónico</label>
                                <input type="email" class="form-control" id="email" name="email" placeholder="Ingresa tu correo electrónico" required>
                            </div>
                            <div class="mb-3">
                                <label for="metodoPago" class="form-label">Método de Pago</label>
                                <select class="form-select" id="metodoPago" name="metodoPago" required>
                                    <option selected>Selecciona un método de pago</option>
                                    <option value="tarjeta">Tarjeta de Crédito/Débito</option>
                                    <option value="paypal">PayPal</option>
                                    <option value="transferencia">Transferencia Bancaria</option>
                                </select>
                            </div>
                            <button type="submit" class="btn btn-primary">Confirmar Pago</button>
                        </form>
                    </div>
                </div>
            </div>
            
            <div class="col-md-4">
                <div class="card">
                    <div class="card-header">
                        <h3>Resumen de la Orden</h3>
                    </div>
                    <div class="card-body">
                        <ul class="list-group mb-3">
                            <li class="list-group-item d-flex justify-content-between">
                                <span>Subtotal</span>
                                <strong>$10.00</strong>
                            </li>
                            <li class="list-group-item d-flex justify-content-between">
                                <span>Envío</span>
                                <strong>$5.00</strong>
                            </li>
                            <li class="list-group-item d-flex justify-content-between">
                                <span>Total</span>
                                <strong>$15.00</strong>
                            </li>
                        </ul>
                        <a href="carrito.jsp" class="btn btn-secondary w-100">Volver al Carrito</a>
                    </div>
                </div>
            </div>
        </div>
    </main>

    <footer>
        <div class="container">
            <table class="table table-borderless text-center">
                <tbody>
                    <tr>
                        <td>&copy; 2024 DECO Artesanías</td>
                        <td>Todos los derechos reservados</td>
                        <td>Teléfono: +57 300 5361916</td>
                    </tr>
                    <tr>
                        <td>Artesanías: Descubre nuestra amplia gama de productos hechos a mano.</td>
                        <td>Tradiciones: Nos inspiramos en la cultura local para cada diseño único.</td>
                        <td>Calidad: Garantizamos la excelencia en cada pieza que creamos.</td>
                    </tr>
                </tbody>
            </table>
        </div>

        <div class="bg-white py-3 footer-icons text-end">
            <a href="#" class="footer-icon"><img src="imagenes/icons8-facebook-50 (1).png" alt="Facebook" width="40px"></a>
            <a href="#" class="footer-icon"><img src="imagenes/icons8-instagram-50 (1).png" alt="Instagram" width="40px"></a>
            <img src="descarga (1).png" alt="Certificado" width="50px">
        </div>
    </footer>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
