<%-- 
    Document   : newjsp
    Created on : 9/09/2024, 08:35:26 PM
    Author     : jjuan
--%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Famisalud la 91</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <link href="/WebDilan/CSS/stile.css" rel="stylesheet" type="text/css">
    <style>
        #boton1{
            background: linear-gradient(greenyellow,white);
        }
    </style>
</head>
<body>
    <div class="login-form">
        <h5>Formulario de Login</h5>
        <div class=""  role="alert">
                            <c:if test="${not empty error}">
                                <p style="color: red;">${error}</p>
                            </c:if>
                        </div>
        <form  action="/WebDilan/CtrValidar?accion=ingresar" method="POST">
            <div class="mb-3">
                <label for="usuario" class="form-label">Usuario:</label>
                <input type="text" id="usuario" name="usuario" class="form-control" placeholder="Usuario" required>
            </div>
            <div class="mb-3">
                <label for="contrasena" class="form-label">Contraseña:</label>
                <input type="password" id="contrasena" name="contrasena" class="form-control" placeholder="Contraseña" required>
            </div>
            <button  type="submit" name="accion" value="ingresar"class="btn btn-primary" id="boton1" >Ingresar</button>
        </form>
        <p class="mt-3"><a href="#">¿Olvidaste tu contraseña?</a></p>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</body>
</html>
