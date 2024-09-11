<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agregar Producto - Paraíso del Artesano</title>
    <link rel="stylesheet" href="pagweb.css">
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
        .container {
            margin-top: 20px;
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
        <nav class="navbar navbar-expand-lg" id="partesuperior">
            <div class="container-fluid">
                <a class="navbar-brand" href="#"><b>Paraíso del Artesano</b></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item"><a class="nav-link active" href="#"><b>PQR</b></a></li>
                        <li class="nav-item"><a class="nav-link active" href="#"><b>Inicio</b></a></li>
                        <li class="nav-item"><a class="nav-link" href="#"><b>Contacto</b></a></li>
                        <li class="nav-item"><a class="nav-link" href="novedades.html"><b>Novedades</b></a></li>
                        <li class="nav-item">
                            <a href="carrito.html" class="nav-link"><img src="imagenes/carrito-de-compras.png" alt="Carrito de compras" width="40px"></a>
                        </li>
                        <li class="nav-item">
                            <a href="#" class="nav-link"><img src="imagenes/person-circle.svg" alt="Mi Cuenta" width="40px"><b>Mi Cuenta</b></a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <div class="container mt-5">
        <h2>Agregar Producto</h2>
        <form action="agregar_producto" method="post" enctype="multipart/form-data">
            <div class="mb-3">
                <label for="titulo" class="form-label">Título del Producto</label>
                <input type="text" class="form-control" id="titulo" name="titulo" placeholder="Ingrese el título del producto" required>
            </div>
            <div class="mb-3">
                <label for="descripcion" class="form-label">Descripción</label>
                <textarea class="form-control" id="descripcion" name="descripcion" rows="3" placeholder="Ingrese la descripción" required></textarea>
            </div>
            <div class="mb-3">
                <label for="precio" class="form-label">Precio</label>
                <input type="number" class="form-control" id="precio" name="precio" placeholder="Ingrese el precio" required>
            </div>
            <div class="mb-3">
                <label for="categoria" class="form-label">Categoría</label>
                <select class="form-select" id="categoria" name="categoria" required>
                    <option value="" disabled selected>Seleccione una categoría</option>
                    <option value="artesanias">Artesanías</option>
                    <option value="decoracion">Decoración</option>
                    <option value="accesorios">Accesorios</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="imagen" class="form-label">Imagen del Producto</label>
                <input type="file" class="form-control" id="imagen" name="imagen" accept="image/*" required>
            </div>
            <button type="submit" class="btn btn-success">Agregar Producto</button>
        </form>

        <div class="mt-5">
            <h3>Productos Agregados</h3>
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Producto 1</h5>
                    <p class="card-text">Descripción breve del producto 1.</p>
                    <a href="#" class="btn btn-primary">Ver Detalles</a>
                </div>
            </div>
            <div class="card mt-2">
                <div class="card-body">
                    <h5 class="card-title">Producto 2</h5>
                    <p class="card-text">Descripción breve del producto 2.</p>
                    <a href="#" class="btn btn-primary">Ver Detalles</a>
                </div>
            </div>
        </div>
    </div>

    <footer>
        <div class="container">
            <p class="text-center">&copy; 2023 Paraíso del Artesano. Todos los derechos reservados.</p>
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
