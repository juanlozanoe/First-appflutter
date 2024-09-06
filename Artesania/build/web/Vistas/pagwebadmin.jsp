<%-- 
    Document   : pagwebadmin
    Created on : 23/08/2024, 10:44:09 AM
    Author     : Usuario
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Paraiso del Artesano</title>
    <link rel="stylesheet" href="/Artesania/CSS/pagweb.css">
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
              <li class="nav-item"><a class="nav-link active" href="#"><b>Agregar producto+</b></a></li>
              <li class="nav-item"><a class="nav-link active" href="#"><b>Inicio</b></a></li>
              <li class="nav-item"><a class="nav-link" href="#"><b>Contacto</b></a></li>
              <li class="nav-item"><a class="nav-link" href="#"><img src="icons8-marca-de-verificaci�n-48.png" alt=""><b>Categoria</b></a></li>
            </ul>
            <div class="d-flex align-items-center">
              <a href="#" class="nav-link"><img src="/Artesania/imagenes/cart3.svg" alt="Carrito de compras" width="40px"></a>
              <a href="#" class="nav-link"><img src="/Artesania/imagenes\person-circle.svg" alt="Carrito de compras" width="40px"><b>Admin</b></a>
            </div>
          </div>
        </div>
      </nav>
  </header>

  <div class="">
    <div class="contenido" id="fondo_negro">
      <div class="card mx-auto my-4" style="width: 35rem;">
        <div class="card-body-b text-center">
          <h5 class="card-title">Productos de artesan�as para tu hogar</h5>
          <p>Artesan�as coloridas y diversas de la costa caribe. Reflejan cultura y tradici�n con tejidos, cer�micas y joyer�a de materiales naturales.</p>
        </div>
        <div class="card-body-bot d-flex justify-content-center gap-3" id="botones1">
          <a href="#" class="btn btn-success rounded-pill btn-lg">Nuevos Productos</a>
          <a href="#" class="btn btn-success rounded-pill btn-lg">Ofertas del dia</a>
        </div>
      </div>
  </div>

  <nav class="navbar bg-body-tertiary">
    <div class="container search-container">
        <form class="d-flex search-bar" role="search">
            <input class="form-control me-2" type="search" placeholder="Buscar">
            <button class="btn btn-outline-success" type="submit">Buscar</button>
        </form>
    </div>
</nav>

    <hr class="border-bottom border-success">
    <h4 class="text-center">Tenemos las artesan�as que necesitas</h4>
    <p class="text-center">Elige la que mejor se adapte a tu gusto</p>
    <hr class="border-bottom border-success">

    <div class="row row-cols-1 row-cols-md-3 g-4">
      <div class="col">
        <div class="card h-100 text-center">
          <img src="feria-de-la-72--removebg-preview.png" class="card-img-top" alt="Carro de Artesan�as">
          <div class="card-body">
            <h5 class="card-title">Carro</h5>
            <p class="card-text">Un carrito de artesan�as es un puesto m�vil lleno de color y variedad.</p>
            <a href="#" class="btn btn-success rounded-pill btn-lg">Ver ></a>
          </div>
        </div>
      </div>
      <div class="col">
        <div class="card h-100 text-center">
          <img src="a7918370-6fe8-11ec-bd3a-37430a80d240-removebg-preview.png" class="card-img-top" alt="Sombrero Vueltiao">
          <div class="card-body">
            <h5 class="card-title">Sombrero vueltiao</h5>
            <p class="card-text">El sombrero vueltiao es una emblem�tica pieza artesanal colombiana.</p>
            <a href="#" class="btn btn-success rounded-pill btn-lg">Ver ></a>
          </div>
        </div>
      </div>
      <div class="col">
        <div class="card h-100 text-center">
          <img src="/Artesania/imagenes/IMG-20240811-WA0032.jpg" class="card-img-top" alt="Hamaca">
          <div class="card-body">
            <h5 class="card-title">Hamaca</h5>
            <p class="card-text">Una hamaca artesanal es una tela tejida a mano, suspendida entre dos puntos.</p>
            <a href="#" class="btn btn-success rounded-pill btn-lg">Ver ></a>
          </div>
        </div>
      </div>
    </div>

    <hr class="border-bottom border-success">
    <h4 class="text-center">�Quieres hacer una compra segura?</h4>
    <p class="text-center">Cumple con los pasos que hay abajo</p>
    <hr class="border-bottom border-success">

    <div class="row row-cols-1 row-cols-md-3 g-4">
      <div class="col">
        <div class="card h-100 text-center">
          <img src="4782144.jpg" class="card-img-top" alt="Selecciona tu producto">
          <div class="card-body">
            <h5 class="card-title">Selecciona tu producto</h5>
          </div>
        </div>
      </div>
      <div class="col">
        <div class="card h-100 text-center">
          <img src="5464287_Blog-post.jpg" class="card-img-top" alt="Contacta con nosotros">
          <div class="card-body">
            <h5 class="card-title">Contacta con nosotros</h5>
          </div>
        </div>
      </div>
      <div class="col">
        <div class="card h-100 text-center">
          <img src="18407465_5995369.jpg" class="card-img-top" alt="Elige tu d�a y listo">
          <div class="card-body">
            <h5 class="card-title">Elige qu� d�a y listo!</h5>
          </div>
        </div>
      </div>
    </div>
  </div>

  <footer> 
    <div class="container">
      <table class="table table-borderless text-center">
        <tbody>
          <tr>
            <td>&copy; 2023 Paraiso del artesano</td>
            <td>Todos los derechos reservados</td>
            <td>Tel�fono: +57 123 456 789</td>
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
      <a href="#" class="footer-icon"><img src="imagenes\icons8-facebook-50 (1).png" alt="Facebook" width="40px"></a>
      <a href="#" class="footer-icon"><img src="imagenes\icons8-instagram-50 (1).png" alt="Instagram" width="40px"></a>
      <img src="descarga (1).png" alt="Nequi" class="footer-icon" width="40px">
      <img src="descarga (2).png" alt="Visa" class="footer-icon" width="40px">
    </div>
  </footer>
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</html>