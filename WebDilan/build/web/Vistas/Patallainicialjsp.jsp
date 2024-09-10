<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio - Paraiso del Artesano</title>
    <link rel="stylesheet" href="/Artesania/CSS/inicio.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/WebDilan/CSS/Pantallainiciocss.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <header>
        <nav class="navbar navbar-expand-lg navbar-light" id="partesuperior">
            <div class="container-fluid">
                <a class="navbar-brand" href="/WebDilan/CtrProducto?accion=Home"><b>DECO Artesanías</b></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item"><a class="nav-link" href="contacto.jsp"><b>Contacto</b></a></li>
                        <li class="nav-item"><a class="nav-link active" href="novedades.jsp"><b>Novedades</b></a></li>
                        <li class="nav-item"><a class="nav-link" href="oferta_del_dia.jsp"><b>Ofertas del día</b></a></li>
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
        <h1 class="text-center mb-5" id="titulo_principal">Bienvenido a Deco Artesanías</h1>

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
