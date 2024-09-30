<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Iniciar Sesión / Registrarse</title>
        <link rel="stylesheet" href="styles.css">
        <link href="/Webdilan/CSS/Inicio-de-session.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <section class="user">
            <div class="user_options-container">
                <div class="user_options-text">
                    <div class="user_options-unregistered">
                        <h2 class="user_unregistered-title">No tienes una cuenta?</h2>
                        <p class="user_unregistered-text">Regístrate para obtener acceso a miles de artículos.</p>
                        <button class="user_unregistered-signup" id="signup-button">Registrarse</button>
                    </div>

                    <div class="user_options-registered">
                        <h2 class="user_registered-title">Ya tienes una cuenta?</h2>
                        <p class="user_registered-text">Inicia sesión con tus datos y sigue disfrutando de todos nuestros beneficios.</p>
                        <button class="user_registered-login" id="login-button">Iniciar</button>
                    </div>
                </div>

                <div class="user_options-forms" id="user_options-forms">
                    <div class="user_forms-login">
                        <h3 class="forms_title"><center>Iniciar sesión</center></h3>
                        <div class="deco">
                            <h2>Bienvenidos a Deco Artesanías</h2>
                        </div>
                        <form class="forms_form" action="/Webdilan/CtrValidar?accion=ingresar" method="POST">
                            <fieldset class="forms_fieldset">
                                <div class="forms_field">
                                    <input type="text" name="usuario" placeholder="Usuario" class="forms_field-input" required autofocus />
                                </div>
                                <div class="forms_field">
                                    <input type="password" name="contrasena" placeholder="Contraseña" class="forms_field-input" required />
                                </div>
                            </fieldset>
                            <div class="forms_buttons">
                                <button type="button" class="forms_buttons-forgot">Olvidó su contraseña?</button>
                                <input type="submit" value="Iniciar sesión" class="forms_buttons-action">
                            </div>
                            <c:if test="${not empty error}">
                                <p style="color: red;">${error}</p>
                            </c:if>
                        </form>
                    </div>

                    <!-- Formulario de registro -->
                    <div class="user_forms-signup">
                        <h3 class="forms_title"><center>Registrarse</center></h3>
                        <form class="forms_form" action="/Webdilan/CtrUsuario" method="POST">
                            <input type="hidden" name="accion" value="crear">
                            <fieldset class="forms_fieldset">
                                <div class="forms_field">
                                    <input type="text" name="nombre" placeholder="Nombre" class="forms_field-input" required />
                                </div>
                                <div class="forms_field">
                                    <input type="text" name="apellido" placeholder="Apellido" class="forms_field-input" required />
                                </div>
                                <div class="forms_field">
                                    <input type="text" name="direccion" placeholder="Dirección" class="forms_field-input" required />
                                </div>
                                <div class="forms_field">
                                    <input type="text" name="telefono" placeholder="Teléfono" class="forms_field-input" required />
                                </div>
                                <div class="forms_field">
                                    <input type="email" name="correo" placeholder="Correo" class="forms_field-input" required />
                                </div>
                                <div class="forms_field">
                                    <input type="text" name="usuario" placeholder="Usuario" class="forms_field-input" required />
                                </div>
                                <div class="forms_field">
                                    <input type="password" name="contrasena" placeholder="Contraseña" class="forms_field-input" required />
                                </div>
                                <div class="forms_field">
                                    <input type="text" name="rol" placeholder="Rol" class="forms_field-input" required />
                                </div>
                            </fieldset>
                            <div class="forms_buttons">
                                <input type="submit" value="Registrar" class="forms_buttons-action">
                            </div>
                        </form>
                    </div>


                </div>
            </div>
        </section>
        <script src="/Webdilan/JS/Inicio-de-session.js" type="text/javascript"></script>
    </body>
</html>
