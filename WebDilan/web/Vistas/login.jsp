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
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <link href="/WebDilan/CSS/stile.css" rel="stylesheet" type="text/css">
    <style>
        body {
            background: linear-gradient(to bottom, #f0f9ff, #cbebff);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
            font-family: 'Arial', sans-serif;
        }

        .login-form {
            background: #fff;
            border-radius: 10px;
            padding: 30px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
            animation: fadeIn 1.5s ease-in-out;
            width: 100%;
            max-width: 400px; /* Ancho máximo del formulario */
        }

        h5 {
            text-align: center;
            color: #28a745;
            font-size: 24px;
            margin-bottom: 20px;
            animation: slideDown 1s ease-in-out;
        }

        .form-control {
            border: 2px solid #28a745;
            border-radius: 15px;
            padding: 10px;
            transition: 0.3s;
        }

        .form-control:focus {
            border-color: #218838;
            box-shadow: 0 0 10px rgba(33, 136, 56, 0.4);
        }

        #boton1 {
            background: linear-gradient(45deg, #28a745, #98fb98);
            border: none;
            padding: 10px 20px;
            border-radius: 25px;
            color: #fff;
            font-weight: bold;
            cursor: pointer;
            transition: all 0.4s ease;
            width: 100%;
            margin-top: 20px;
        }

        #boton1:hover {
            background: linear-gradient(45deg, #218838, #7ecb7e);
            transform: translateY(-3px);
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
        }

        p {
            text-align: center;
            margin-top: 10px;
        }

        p a {
            text-decoration: none;
            color: #28a745;
            font-weight: bold;
            transition: color 0.3s;
        }

        p a:hover {
            color: #218838;
        }

        /* Animations */
        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: scale(0.9);
            }
            to {
                opacity: 1;
                transform: scale(1);
            }
        }

        @keyframes slideDown {
            from {
                transform: translateY(-50px);
                opacity: 0;
            }
            to {
                transform: translateY(0);
                opacity: 1;
            }
        }
    </style>
</head>
<body>
    <div class="login-form">
        <h5><strong>Login</strong></h5>
        <div class="" role="alert">
            <c:if test="${not empty error}">
                <p style="color: red;">${error}</p>
            </c:if>
        </div>
        <form action="/WebDilan/CtrValidar?accion=ingresar" method="POST">
            <div class="mb-3">
                <label for="usuario" class="form-label">Usuario:</label>
                <input type="text" id="usuario" name="usuario" class="form-control" placeholder="Usuario" required>
            </div>
            <div class="mb-3">
                <label for="contrasena" class="form-label">Contraseña:</label>
                <input type="password" id="contrasena" name="contrasena" class="form-control" placeholder="Contraseña" required>
            </div>
            <button type="submit" name="accion" value="ingresar" class="btn" id="boton1">Ingresar</button>
        </form>
        <p class="mt-3"><a href="#">¿Olvidaste tu contraseña?</a></p>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</body>
</html>
