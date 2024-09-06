<%-- 
    Document   : categoria
    Created on : 23/08/2024, 10:45:51 AM
    Author     : Usuario
--%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agregar Categor�a - Para�so del Artesano</title>
    <link rel="stylesheet" href="/Artesania/CSS/categoria.css">
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
  <div class="mt-5">
    <div class="container mt-5">
      <center>
        <h2 >Agregar Categor�a</h2>
        <form id="agregarCategoriaForm">
          <div class="mb-3">
            <label for="nombreCategoria" class="form-label">Nombre de la Categor�a</label>
            <input type="text" class="form-control" id="nombreCategoria" placeholder="Ingrese el nombre de la categor�a" required>
          </div>
          <button type="submit" class="button">Agregar Categor�a</button>
        </form>

        <div id="mensaje" class="alert mt-3" role="alert" style="display:none;"></div>

        <h3 class="mt-5" >Categor�as Agregadas</h3>
        <table class="table">
          <thead>
            <tr>
              <th>#</th>
              <th>Nombre de la Categor�a</th>
              <th>Acciones</th>
            </tr>
          </thead>
          <tbody id="categoriasList">
            <!-- Aqu� se agregar�n las categor�as -->
          </tbody>
        </table>
      </center>
    </div>
  </div>

  <footer>
<div class="container1">

    <div class="container">
      <p class="text-center">&copy; 2023 Para�so del Artesano. Todos los derechos reservados.</p>
    </div>
    <center>
      <div class="instagramSVG">
        <div class="tooltip-container">
          <div class="tooltip">
            <div class="profile">
              <div class="user">
                <div class="img">Ui</div>
                <div class="details">
                  <div class="name">User</div>
                  <div class="username">@username</div>
                </div>
              </div>
              <div class="about">800+ Followers</div>
            </div>
          </div>
          <div class="text">
            <a class="icon" href="#">
              <div class="layer">
                <span></span>
                <span></span>
                <span></span>
                <span></span>
                <span class="instagramSVG">
                  <svg
                    fill="white"
                    class="svgIcon"
                    viewBox="0 0 448 512"
                    height="1.5em"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      d="M224.1 141c-63.6 0-114.9 51.3-114.9 114.9s51.3 114.9 114.9 114.9S339 319.5 339 255.9 287.7 141 224.1 141zm0 189.6c-41.1 0-74.7-33.5-74.7-74.7s33.5-74.7 74.7-74.7 74.7 33.5 74.7 74.7-33.6 74.7-74.7 74.7zm146.4-194.3c0 14.9-12 26.8-26.8 26.8-14.9 0-26.8-12-26.8-26.8s12-26.8 26.8-26.8 26.8 12 26.8 26.8zm76.1 27.2c-1.7-35.9-9.9-67.7-36.2-93.9-26.2-26.2-58-34.4-93.9-36.2-37-2.1-147.9-2.1-184.9 0-35.8 1.7-67.6 9.9-93.9 36.1s-34.4 58-36.2 93.9c-2.1 37-2.1 147.9 0 184.9 1.7 35.9 9.9 67.7 36.2 93.9s58 34.4 93.9 36.2c37 2.1 147.9 2.1 184.9 0 35.9-1.7 67.7-9.9 93.9-36.2 26.2-26.2 34.4-58 36.2-93.9 2.1-37 2.1-147.8 0-184.8zM398.8 388c-7.8 19.6-22.9 34.7-42.6 42.6-29.5 11.7-99.5 9-132.1 9s-102.7 2.6-132.1-9c-19.6-7.8-34.7-22.9-42.6-42.6-11.7-29.5-9-99.5-9-132.1s-2.6-102.7 9-132.1c7.8-19.6 22.9-34.7 42.6-42.6 29.5-11.7 99.5-9 132.1-9s102.7-2.6 132.1 9c19.6 7.8 34.7 22.9 42.6 42.6 11.7 29.5 9 99.5 9 132.1s2.6 102.7-9 132.1z"
                    />
                  </svg>
                </span>
              </div>
            </a>
          </div>
        </div>
      </div>
    </center>
    </div>
  </footer>
  <script src="categoria.js"></script>
</body>
</html>

