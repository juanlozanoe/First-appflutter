<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Carrito de Compras - Paraiso del Artesano</title>
    <link rel="stylesheet" href="/Artesania/CSS/pagweb.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .main-container {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
        }
        .card {
            max-width: 800px;
            width: 100%;
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
              <a href="#" class="nav-link"><img src="imagenes/person-circle.svg" alt="Carrito de compras" width="40px"><b>Mi Cuenta</b></a>
            </ul>
          </div>
        </div>
      </nav>
  </header>

  <main class="main-container mt-5">
    <h1 class="mb-4" style="color: white;">Carrito de Compras</h1>
    <div class="card">
      <div class="card-header">
        <h3>Productos en el Carrito</h3>
      </div>
      <div class="card-body">
        <table class="table">
          <thead>
            <tr>
              <th>Producto</th>
              <th>Cantidad</th>
              <th>Precio</th>
              <th>Subtotal</th>
              <th>Acciones</th>
            </tr>
          </thead>
          <tbody>
            <!-- Repite este bloque para cada producto -->
            <tr>
              <td>Nombre del Producto</td>
              <td><input type="number" class="form-control" value="1" min="1"></td>
              <td>$10.00</td>
              <td>$10.00</td>
              <td><button class="btn btn-danger btn-sm">Eliminar</button></td>
            </tr>
            <!-- Fin del bloque de producto -->
          </tbody>
        </table>
      </div>
      <div class="card-footer d-flex justify-content-between align-items-center">
        <h4>Total: $10.00</h4>
        <div>
          <a href="pagweb.html" class="btn btn-secondary">Seguir Comprando</a>
          <a href="procederpago.html" class="btn btn-primary">Proceder al Pago</a>
        </div>
      </div>
    </div>
  </main>
  <br>
  <footer> 
    <div class="container">
      <table class="table table-borderless text-center">
        <tbody>
          <tr>
            <td>&copy; 2024 DECO Artesanias</td>
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
  
    <div class=" py-3 footer-icons text-end">
      <a href="#" class="footer-icon"><img src="imagenes/icons8-facebook-50 (1).png" alt="Facebook" width="40px"></a>
      <a href="#" class="footer-icon"><img src="imagenes/icons8-instagram-50 (1).png" alt="Instagram" width="40px"></a>
      <img src="descarga (1).png" alt="Nequi" class="footer-icon" width="40px">
      <img src="descarga (2).png" alt="Visa" class="footer-icon" width="40px">
    </div>
  </footer>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
