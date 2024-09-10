<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login y Registro</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/CSS/login.css">
    <link href="<%= request.getContextPath() %>/Css/Stylos.css" rel="stylesheet" type="text/css"/>
</head>
<%
String Mensaje = "";
if (request.getParameter("fallo") != null) {
    int i = Integer.parseInt(request.getParameter("fallo"));
    if (i == 0) {
        Mensaje = "usuario y/o contraseña incorrecta";
    }
}

if (request.getParameter("mensaje") != null) {
    int i = Integer.parseInt(request.getParameter("mensaje"));
    if (i == 0) {
        Mensaje = "usuario creado , por favor inicie sesión";
    }
}
%>
<body>
<div class="container">
            <div class="box">
                <div class="form sign_in">

                    <img src="/ArtesaniasWeb/Imagenes/lo-removebg-preview.png" alt="Logo" class="logo"/>
                    <h3>Iniciar sesión</h3>

                    <form action="/ArtesaniasWeb/CtrValidarInfo" id="form_input" method="post">
                        <div class="type">
                            <input type="text" placeholder="Usuario" id="email" name="txtusu">
                        </div>
                        <div class="type">
                            <input type="password" placeholder="Contraseña" id="password" name="txtpass">
                        </div>
                        <div class="forgot">
                            <span>¿Olvidó su contraseña?</span>
                        </div>

                        <input type="submit" name="accion" value="Ingresar" class="btn bkg">
                     
                        
                    </form>
                </div>

</body>
</html>
