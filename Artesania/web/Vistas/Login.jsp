<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="/Artesania/CSS/login.css">
</head>
    <%String Mensaje = "";
    if (request.getParameter("ingreso")!= null){
        int i = Integer.parseInt(request.getParameter("ingreso"));
        if (i == 0){
            Mensaje = "Error: Datos Incorectos";
        }
    }
    %>
<body>
    <div class="wrapper">
        <div class="card-switch">
            <label class="switch">
               <input type="checkbox" class="toggle">
               <span class="slider"></span>
               <span class="card-side"></span>
               <div class="flip-card__inner">
                  <div class="flip-card__front">
                     <div class="title">Iniciar Sesion</div>
                     <form class="flip-card__form" action="">
                        <input class="flip-card__input" name="email" placeholder="Usuario" type="email">
                        <input class="flip-card__input" name="password" placeholder="Contraseña" type="password">
                        <button class="flip-card__btn" ><a href="pagweb.html" style="color: white;">Log in</a></button>
                     </form>
                  </div>
                  <div class="flip-card__back">
                     <div class="title">Registro</div>
                     <form class="flip-card__form" action="">
                        <input class="flip-card__input" placeholder="Id" type="id">
                        <input class="flip-card__input" placeholder="Nombre" type="name">
                        <input class="flip-card__input" placeholder="Apellido" type="name">
                        <input class="flip-card__input" placeholder="Direccion" type="name">           
                        <input class="flip-card__input" placeholder="Telefono" type="name">
                        <input class="flip-card__input" placeholder="Usuario" type="name">
                        <input class="flip-card__input" name="email" placeholder="Correo" type="email">
                        <input class="flip-card__input" name="password" placeholder="Contraseña" type="password">
                        <input class="flip-card__input" placeholder="Tipo" type="name">
                        <button class="flip-card__btn" style="color: white;">Confirmar</button>
                     </form>
                  </div>
               </div>
            </label>
        </div>   
   </div>
    
</body>
</html>
