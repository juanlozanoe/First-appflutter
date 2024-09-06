<%-- 
    Document   : Pagweb
    Created on : 6/08/2024, 09:54:02 AM
    Author     : SENA
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Deco-Artesanias</title>
    <link rel="stylesheet" href="/Artesania/CSS/pagweb.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
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
              <li class="nav-item"><a class="nav-link active" href="pqr.html"><b>PQR</b></a></li>
              <li class="nav-item"><a class="nav-link active" href="inicio.html"><b>Inicio</b></a></li>
              <li class="nav-item"><a class="nav-link" href="contacto.html"><b>Contacto</b></a></li>
              <li class="nav-item"><a class="nav-link" href="novedades.html"><b>Novedades</b></a></li>
              <a href="carrito.html" class="nav-link"><img src="imagenes\carrito-de-compras.png" alt="" width="40px"></a>
              <a href="#" class="nav-link"><img src="imagenes/person-circle.svg" alt="Carrito de compras" width="40px"><b>Mi Cuenta</b></a>
            </ul>
          
          </div>
        </div>
      </nav>
  </header>
  
<div class="">
  <div class="contenido" id="fondo_negro" >
    <div class="card mx-auto my-4" style="width: 35rem; background: linear-gradient(white, grey); padding: 20px;">
      <div class="card-body-b text-center">
        <h5 class="card-title">Productos de artesanías para tu hogar</h5>
        <p>Artesanías coloridas y diversas de la costa caribe. Reflejan cultura y tradición con tejidos, cerámicas y joyería de materiales naturales.</p>
      </div>
      <div class="card-body-bot d-flex justify-content-center gap-3" id="botones1">
        <a href="novedades.html" class="btn btn-success rounded-pill btn-lg">Nuevos Productos</a>
        <a href="oferta_del_dia.html" class="btn btn-success rounded-pill btn-lg">Ofertas del dia</a>
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
<div class="diseno1">
<hr class="border-bottom border-success">
    <h4 class="text-center" style="color: white;">Tenemos las artesanías que necesitas</h4>
    <p class="text-center">Elige la que mejor se adapte a tu gusto</p>
    <hr class="border-bottom border-success">
</div>
    <div class="carousel-container">
        <button class="carousel-button prev" onclick="moveCarousel(-1)">&#10094;</button>
        <div class="carousel">
            <div class="carousel-card">
                <img src="https://vhlblog.vistahigherlearning.com/wp-content/uploads/2020/06/Artesani%CC%81a-Huichol.jpg" alt="Carro de Artesanías">
                <div class="card-body">
                    <h5 class="card-title">Colgante de tigre</h5>
                    <p class="card-text">Un carrito de artesanías es un puesto móvil lleno de color y variedad.</p>
                </div>
            </div>
            <div class="carousel-card">
                <img src="https://i.pinimg.com/736x/a5/28/7a/a5287a13fc7d9f6dfdfc55996397bf79.jpg" alt="Sombrero Vueltiao">
                <div class="card-body">
                    <h5 class="card-title">Ventana del mundo</h5>
                    <p class="card-text">El sombrero vueltiao es una emblemática pieza artesanal colombiana.</p>
                </div>
            </div>
            <div class="carousel-card">
                <img src="https://i.pinimg.com/236x/6c/0c/0e/6c0c0e8c8e515c0a45cfdffdc6ea3ddc.jpg" alt="Hamaca">
                <div class="card-body">
                    <h5 class="card-title">Aretes de flores</h5>
                    <p class="card-text">Una hamaca artesanal es una tela tejida a mano, suspendida entre dos puntos.</p>
                </div>
            </div>
            <div class="carousel-card">
                <img src="https://mf.b37mrtl.ru/actualidad/public_images/2021.04/article/6082f4fe59bf5b17d11d19a9.jpg" alt="Hamaca">
                <div class="card-body">
                    <h5 class="card-title">Sombrero vueltiao</h5>
                    <p class="card-text">Una hamaca artesanal es una tela tejida a mano, suspendida entre dos puntos.</p>
                </div>
            </div>
            <div class="carousel-card">
                <img src="https://artesaniasbatan.com.co/wp-content/uploads/2022/11/Mascara-Toro-Carnaval-de-Barranquilla.png" alt="Hamaca">
                <div class="card-body">
                    <h5 class="card-title">Colgante de toro</h5>
                    <p class="card-text">Una hamaca artesanal es una tela tejida a mano, suspendida entre dos puntos.</p>
                </div>
            </div>
            <div class="carousel-card">
                <img src="https://www.bluelinemexico.com/acapulco/img/p/3/7/37-large_default.jpg" alt="Hamaca">
                <div class="card-body">
                    <h5 class="card-title">Llavero de cangrejo</h5>
                    <p class="card-text">Una hamaca artesanal es una tela tejida a mano, suspendida entre dos puntos.</p>
                </div>
            </div>
        </div>
        <button class="carousel-button next" onclick="moveCarousel(1)">&#10095;</button>
    </div>
    
   <div class="diseno1">
    <hr class="border-bottom border-success">
    <h4 class="text-center" style="color: white;">¿Quieres hacer una compra segura?</h4>
    <p class="text-center">Cumple con los pasos que hay abajo</p>
    <hr class="border-bottom border-success">
  </div>
    <div class="row row-cols-1 row-cols-md-3 g-4">
      <div class="col">
        <div class="card h-100 text-center">
          <img src="imagenes/4782144.jpg" class="card-img-top" alt="Selecciona tu producto">
          <div class="card-body">
            <h5 class="card-title">Selecciona tu producto</h5>
          </div>
        </div>
      </div>
      <div class="col">
        <div class="card h-100 text-center">
          <img src="imagenes/5464287_Blog-post.jpg" class="card-img-top" alt="Contacta con nosotros">
          <div class="card-body">
            <h5 class="card-title">Contacta con nosotros</h5>
          </div>
        </div>
      </div>
      <div class="col">
        <div class="card h-100 text-center">
          <img src="imagenes/18407465_5995369.jpg" class="card-img-top" alt="Elige tu día y listo">
          <div class="card-body">
            <h5 class="card-title">Elige qué día y listo!</h5>
          </div>
        </div>
      </div>
    </div>
  </div>
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
  <script src="/Artesania/JS/carrusel.js"></script>

</body>
</html>
