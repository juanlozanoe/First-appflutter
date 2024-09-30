<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@page import="Modelo.Pedido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Ver Órdenes</title>
        <link rel="stylesheet" href="styles.css">
        <link href="/Webdilan/CSS/Ver-ordenes.css" rel="stylesheet" type="text/css"/>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    </head>
    <header class="header bg-success">
        <div class="container-fluid d-flex justify-content-between align-items-center p-3">
            <a href="/Webdilan/CtrProductos?accion=home&idUser=${idJ}"><h1 class="mb-0 text-white">Deco Artesanía</h1></a>
            <div class="d-flex align-items-center">
                
                <div class="dropdown ms-3">
                    <a class="nav-link dropdown-toggle text-white" href="#" role="button" id="userDropdown" data-bs-toggle="dropdown">
                        <i class="bi bi-person-circle"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-menu-end">
                        <li><a class="dropdown-item" href="/">Usuario</a></li>
                        <li><a class="dropdown-item" href="/Webdilan/CtrProductos?accion=salir">Salir</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header>
    <body>
        <div class="container">
            <h1>Ver por dónde va mi orden</h1>
            <div class="filters mb-3">

            </div>

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Valor</th>
                        <th>Estado</th>
                        <th>Fecha</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="pedido" items="${pedidos}">
                        <tr>
                            <td>${pedido.getId()}</td>
                            <td>${pedido.getTotal()}</td>
                            <td>${pedido.getEstado()}</td>
                            <td>${pedido.getFechaCreacion()}</td>
                    <input type="hidden" name="id" value="${idJ}">
                        </tr>

                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <script src="/WebDilan/JS/manejoDetalle.js"></script>
</html>
