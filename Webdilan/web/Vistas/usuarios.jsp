<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Ver Usuarios</title>

        <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <link href="/Webdilan/CSS/StyleGeneral.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <style>
            .filters {
                margin-bottom: 20px;
            }

            .filters label,
            .filters select,
            .filters input {
                margin-right: 10px;
            }

            table {
                width: 100%;
                border-collapse: collapse;
                margin-bottom: 20px;
            }

            table, th, td {

                border: 1px solid #ddd;
            }

            th, td {
                padding: 10px;
                text-align: left;
            }

            th {
                background-color: #357c28;
                color: black;
            }

            tr:nth-child(even) {
                background-color: #f2f2f2;
            }
        </style>
        <header class="bg-success">
            <nav class="navbar navbar-expand-lg navbar-dark bg-success">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">
                        <h1 class="mb-0 text-white">Deco Artesan�a</h1>
                    </a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link text-white" href="/Webdilan/CtrProductos?accion=homeAdmin">Productos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="/Webdilan/CtrPedido?accion=listarPedido">Pedidos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="#">Usuarios</a>
                            </li>
                        </ul>
                        <div class="d-flex align-items-center ms-auto">
                            <div class="dropdown">
                                <a class="nav-link dropdown-toggle text-white" href="#" role="button" id="userDropdown" data-bs-toggle="dropdown" aria-expanded="false">
                                    <i class="bi bi-person-circle"></i>
                                </a>
                                <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="userDropdown">
                                    <li><a class="dropdown-item" href="#">Admin</a></li>
                                    <li><a class="dropdown-item" href="/Webdilan/CtrProductos?accion=salir">Salir</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </nav>
        </header>

        <div class="container">
            <h1>Ver Usuarios</h1>

            <table class="table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="usuario" items="${usuarios}">
                        <tr>
                            <td>${usuario.id}</td>
                            <td>${usuario.nombre}</td>
                            <td>${usuario.correo}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
