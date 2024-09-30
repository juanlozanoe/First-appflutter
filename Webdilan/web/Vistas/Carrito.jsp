<!DOCTYPE html>
<html lang="es">
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Deco Artesanía - carrito</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link href="/Webdilan/CSS/StyleGeneral.css" rel="stylesheet" type="text/css"/>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f9f8f6; /* Fondo suave */
            color: #333;
        }

        .container {
            max-width: 900px;
            margin: 2rem auto;
            padding: 2rem;
            background-color: #fff;
            border-radius: 1rem;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        h1 {
            font-size: 2.5rem;
            color: #357c28; /* Verde artesanal */
            margin-bottom: 2rem;
            text-align: center;
        }

        .scroll-area {
            max-height: 400px;
            overflow-y: auto;
        }

        .product-list {
            display: flex;
            flex-direction: column;
            gap: 1.5rem;
        }

        .card {
            display: flex;
            border: 1px solid #e0e0e0;
            border-radius: 0.75rem;
            overflow: hidden;
            background-color: #fff;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            transition: box-shadow 0.3s ease;
        }

        .card:hover {
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }

        .card img {
            width: 200px;
            height: 200px;
            object-fit: cover;
            border-radius: 0.75rem 0 0 0.75rem;
        }

        .card-content {
            padding: 1rem;
            flex-grow: 1;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
        }

        .card-content h2 {
            font-size: 1.25rem;
            color: #357c28; /* Verde artesanal */
            margin-bottom: 0.5rem;
        }

        .card-content .price {
            font-size: 1.125rem;
            color: #ff5722; /* Color para el precio */
        }

        .card-footer {
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 0.5rem 1rem;
            background-color: #f5f5f5;
        }

        .quantity-controls {
            display: flex;
            align-items: center;
            gap: 0.5rem;
        }

        .quantity-controls button {
            background-color: #357c28; /* Verde artesanal */
            color: white;
            border: none;
            border-radius: 0.25rem;
            width: 2rem;
            height: 2rem;
            font-size: 1.25rem;
            cursor: pointer;
        }

        .quantity-controls button:hover {
            background-color: #2c6b1f;
        }

        .delete-btn {
            background: none;
            border: none;
            color: #ff5722; /* Color de eliminar */
            font-size: 1.25rem;
            cursor: pointer;
        }

        .delete-btn:hover {
            color: #e64a19;
        }

        .total-section {
            margin-top: 2rem;
            padding-top: 1rem;
            border-top: 1px solid #e0e0e0;
            text-align: center;
        }

        .total-section h2 {
            font-size: 1.5rem;
            color: #357c28; /* Verde artesanal */
            margin-bottom: 0.5rem;
        }

        .total-price {
            font-size: 1.25rem;
            color: #ff5722; /* Color para el total */
            margin-bottom: 1rem;
        }

        .pay-button {
            display: inline-block;
            background-color: #357c28; /* Verde artesanal */
            color: white;
            padding: 0.75rem 1.5rem;
            border-radius: 0.5rem;
            text-decoration: none;
            font-size: 1.125rem;
            transition: background-color 0.3s ease, transform 0.2s ease;
        }

        .pay-button:hover {
            background-color: #2c6b1f;
            transform: scale(1.05);
        }
        .product-list{
            display: flex;
    justify-content: center; /* Centra horizontalmente */
    align-items: center; /* Centra verticalmente si es necesario */
    flex-wrap: wrap; /* Permite que las tarjetas se acomoden en múltiples filas */
    gap: 20px; /* Espacio entre cada tarjeta */
    margin: 20px 0; /* Añadir márgenes superior e inferior */
        }
        .card {
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    width: 300px; /* Ajusta según lo que necesites */
    border: 1px solid #ccc;
    border-radius: 8px;
    padding: 16px;
    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
    background-color: #fff;
}

.card img {
    width: 100%;
    height: auto;
    border-radius: 8px 8px 0 0;
}

/* Estilo para la cantidad y botones */
.quantity-controls {
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 10px;
}

.quantity-controls button {
    padding: 5px 10px;
    background-color: #f0f0f0;
    border: none;
    cursor: pointer;
    border-radius: 4px;
}

.quantity-controls span {
    font-size: 16px;
    font-weight: bold;
}

/* Estilo para el botón de eliminar */
.delete-btn {
    background-color: red;
    color: white;
    padding: 8px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    display: flex;
    justify-content: center;
    align-items: center;
}

.card-footer {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-top: 10px;
}
    </style>
</head>
<body>
    <header class="header bg-success">
        <div class="container-fluid d-flex justify-content-between align-items-center p-3">
            <a href="/Webdilan/CtrProductos?accion=home"><h1 class="mb-0 text-white">Deco Artesanía</h1></a>
            <div class="d-flex align-items-center">
                <a href="#" class="nav-link text-white"><i class="bi bi-search"></i></a>
                <a href="#" class="nav-link text-white ms-3">
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
    <div class="container">
        <h1>Carrito de Compras</h1>
        <div class="scroll-area">
            <c:forEach var="car" items="${ListaCarrito}">
                <div class="product-list">
                    <div class="card">
                        <img src="${car.fotoProducto}" alt="${car.nombreProducto}">
                        <div class="card-content">
                            <h2>${car.nombreProducto}</h2>
                            <p class="price">Precio unitario: $ ${car.precioProducto}</p>
                             <p class="price">SubTotal: $ ${car.total}</p>
                        </div>
                        <div class="card-footer">
                            <div class="quantity-controls">
                                <a href="/Webdilan/CtrProductos?accion=RestarCantidad&id=${car.getIdProducto()}"><button>-</button></a>
                                <span>${car.getCantidad()}</span>
                                <a href="/Webdilan/CtrProductos?accion=SumarCantidad&id=${car.getIdProducto()}"><button>+</button></a>
                            </div>
                            <a href="/Webdilan/CtrProductos?accion=EliminarDeCarrito&id=${car.getIdProducto()}"><button class="delete-btn"><i class="bi bi-trash"></i></button></a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div class="total-section">
            <h2>Total:</h2>
            <p class="total-price">$ ${totalpagar}</p>
            <a href="#" class="pay-button"  data-bs-toggle="modal" data-bs-target="#confirmModal">Proceder al pago</a>
        </div>
    </div>
            
            <!-- Modal de confirmación -->
<div class="modal fade" id="confirmModal" tabindex="-1" aria-labelledby="confirmModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="confirmModalLabel">Confirmar Compra</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                ¿Está seguro de que desea proceder con la compra? Su total es de $ ${totalpagar}.
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                     <a href="/Webdilan/CtrProductos?accion=confirmarCompra&idUser=${idUser}" class="btn btn-primary">Confirmar</a>
               
            </div>
        </div>
    </div>
</div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</body>
</html>
