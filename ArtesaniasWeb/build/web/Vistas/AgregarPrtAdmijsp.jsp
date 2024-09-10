<%-- 
    Document   : agregar_producto
    Created on : 23/08/2024, 10:48:14 AM
    Author     : Usuario
--%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agregar Producto - Para�so del Artesano</title>
    <link rel="stylesheet" href="pagweb.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
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
              <a href="#" class="nav-link"><img src="imagenes/person-circle.svg" alt="Carrito de compras" width="40px"><b>Mi Cuenta</b></a>
            </ul>
          
          </div>
        </div>
      </nav>
  </header>

  <div class="container mt-5">
    <h2>Agregar Producto</h2>
    <form>
      <div class="mb-3">
        <label for="titulo" class="form-label">T�tulo del Producto</label>
        <input type="text" class="form-control" id="titulo" placeholder="Ingrese el t�tulo del producto" required>
      </div>
      <div class="mb-3">
        <label for="descripcion" class="form-label">Descripci�n</label>
        <textarea class="form-control" id="descripcion" rows="3" placeholder="Ingrese la descripci�n" required></textarea>
      </div>
      <div class="mb-3">
        <label for="precio" class="form-label">Precio</label>
        <input type="number" class="form-control" id="precio" placeholder="Ingrese el precio" required>
      </div>
      <div class="mb-3">
        <label for="categoria" class="form-label">Categor�a</label>
        <select class="form-select" id="categoria" required>
          <option value="" disabled selected>Seleccione una categor�a</option>
          <option value="artesanias">Artesan�as</option>
          <option value="decoracion">Decoraci�n</option>
          <option value="accesorios">Accesorios</option>
        </select>
      </div>
      <div class="mb-3">
        <label for="imagen" class="form-label">Imagen del Producto</label>
        <input type="file" class="form-control" id="imagen" accept="image/*" required>
      </div>
      <button type="submit" class="btn btn-success">Agregar Producto</button>
    </form>

    <div class="mt-5">
      <h3>Productos Agregados</h3>
      <div class="card">
        <div class="card-body">
          <h5 class="card-title">Producto 1</h5>
          <p class="card-text">Descripci�n breve del producto 1.</p>
          <a href="#" class="btn btn-primary">Ver Detalles</a>
        </div>
      </div>
      <div class="card mt-2">
        <div class="card-body">
          <h5 class="card-title">Producto 2</h5>
          <p class="card-text">Descripci�n breve del producto 2.</p>
          <a href="#" class="btn btn-primary">Ver Detalles</a>
        </div>
      </div>
    </div>
  </div>
<br>
  <footer>
    <div class="container">
      <p class="text-center">&copy; 2023 Para�so del Artesano. Todos los derechos reservados.</p>
    </div>
  </footer>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</html>