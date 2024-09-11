<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio - Paraíso del Artesano</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
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
        .navbar-nav .nav-link {
            color: white !important;
        }
        .navbar-nav .nav-link.active {
            font-weight: bold;
        }
        #titulo_principal {
            color: #2c6b2f; /* Verde oscuro */
        }
        .card {
            border: 1px solid #ddd;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.2);
        }
        .card-body {
            padding: 20px;
        }
        footer {
            background: linear-gradient(to right, #4caf50, #2c6b2f);
            color: white;
            padding: 20px;
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
        <nav class="navbar navbar-expand-lg navbar-light" id="partesuperior">
            <div class="container-fluid">
                <a class="navbar-brand" href="/WebDilan/CtrProducto?accion=Home"><b>Paraíso del Artesano</b></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item"><a class="nav-link" href="contacto.jsp"><b>Contacto</b></a></li>
                        <li class="nav-item"><a class="nav-link active" href="novedades.jsp"><b>Novedades</b></a></li>
                        <li class="nav-item"><a class="nav-link" href="oferta_del_dia.jsp"><b>Ofertas del Día</b></a></li>
                        <li class="nav-item">
                            <a class="nav-link" href="carrito.jsp">
                                <img src="imagenes/carrito-de-compras.png" alt="Carrito" width="30px">
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="btn btn-primary" href="login.jsp">Iniciar Sesión</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <div class="container my-5">
        <h1 class="text-center mb-5" id="titulo_principal">Bienvenido a Paraíso del Artesano</h1>

        <div class="row">
            <c:forEach var="pro" items="${productos}">
                <div class="col-md-4 mb-4">
                    <div class="card mx-2">
                        <img src="${pro.getFoto()}" class="card-img-top" alt="${pro.getNombre()}">
                        <div class="card-body">
                            <h5 class="card-title">${pro.getNombre()}</h5>
                            <p class="card-text">${pro.getDescripcion()}</p>
                            <a href="#" class="btn btn-primary">${pro.getPrecio()}</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>

    <footer> 
        <div class="container">
            <table class="table table-borderless text-center">
                <tbody>
                    <tr>
                        <td>&copy; 2024 Paraíso del Artesano</td>
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
            <a href="#" class="footer-icon">
                <img src="imagenes/icons8-facebook-50 (1).png" alt="Facebook" width="40px">
            </a>
            <a href="#" class="footer-icon">
                <img src="imagenes/icons8-instagram-50 (1).png" alt="Instagram" width="40px">
            </a>
            <img src="descarga (1).png" alt="Nequi" class="footer-icon" width="40px">
            <img src="descarga (2).png" alt="Visa" class="footer-icon" width="40px">
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
