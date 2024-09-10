<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Proceder al Pago - Para�so del Artesano</title>
    <link rel="stylesheet" href="/Artesania/CSS/pagweb.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="../Css/pagoscss.css" rel="stylesheet" type="text/css"/>
</head>
<body>
  <header>
    <nav class="navbar navbar-expand-lg" id="partesuperior">
        <div class="container-fluid">
          <a class="navbar-brand" href="#"><b>DECO Artesanias</b></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
            <ul class="navbar-nav">
              <li class="nav-item"><a class="nav-link active" href="#"><b>PQR</b></a></li>
              <li class="nav-item"><a class="nav-link active" href="#"><b>Inicio</b></a></li>
              <li class="nav-item"><a class="nav-link" href="#"><b>Contacto</b></a></li>
              <li class="nav-item"><a class="nav-link" href="novedades.html"><b>Novedades</b></a></li>
              <a href="carrito.html" class="nav-link"><img src="imagenes\carrito-de-compras.png" alt="Carrito de compras" width="40px"></a>
              <a href="#" class="nav-link"><img src="imagenes/person-circle.svg" alt="Mi Cuenta" width="40px"><b>Mi Cuenta</b></a>
            </ul>
          </div>
        </div>
      </nav>
  </header>

  <main class="container mt-5">
    <h1 class="mb-4" style="color: #333;"><center>Proceder al Pago</center></h1>
    <div class="row">
      <div class="col-md-8">
        <div class="card">
          <div class="card-header">
            <h3>Detalles de Facturaci�n</h3>
          </div>
          <div class="card-body">
            <form>
              <div class="mb-3">
                <label for="nombreCompleto" class="form-label">Nombre Completo</label>
                <input type="text" class="form-control" id="nombreCompleto" placeholder="Ingresa tu nombre completo">
              </div>
              <div class="mb-3">
                <label for="direccion" class="form-label">Direcci�n</label>
                <input type="text" class="form-control" id="direccion" placeholder="Ingresa tu direcci�n de env�o">
              </div>
              <div class="mb-3">
                <label for="telefono" class="form-label">Tel�fono</label>
                <input type="tel" class="form-control" id="telefono" placeholder="Ingresa tu n�mero de tel�fono">
              </div>
              <div class="mb-3">
                <label for="email" class="form-label">Correo Electr�nico</label>
                <input type="email" class="form-control" id="email" placeholder="Ingresa tu correo electr�nico">
              </div>
              <div class="mb-3">
                <label for="metodoPago" class="form-label">M�todo de Pago</label>
                <select class="form-select" id="metodoPago">
                  <option selected>Selecciona un m�todo de pago</option>
                  <option value="tarjeta">Tarjeta de Cr�dito/D�bito</option>
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
                <span>Env�o</span>
                <strong>$5.00</strong>
              </li>
              <li class="list-group-item d-flex justify-content-between">
                <span>Total</span>
                <strong>$15.00</strong>
              </li>
            </ul>
            <a href="carrito.html" class="btn btn-secondary w-100">Volver al Carrito</a>
          </div>
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
            <td>Tel�fono: +57 300 5361916</td>
          </tr>
          <tr>
            <td>Artesan�as: Descubre nuestra amplia gama de productos hechos a mano.</td>
            <td>Tradiciones: Nos inspiramos en la cultura local para cada dise�o �nico.</td>
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

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
