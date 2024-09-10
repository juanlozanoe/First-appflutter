package modelos;

import Configuracion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HPLAPTOP01
 */
public class UsuarioDAO {

    Connection con;
    PreparedStatement pstm;
    Conectar conexion;
    ResultSet resultado;

    public Usuario validar(String usuario, String contrasena) {
        Usuario usuarioValido = new Usuario();
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
                pstm = con.prepareStatement("SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?");
                pstm.setString(1, usuario);
                pstm.setString(2, contrasena);
                resultado = pstm.executeQuery();
                if (resultado.next()) {
                    usuarioValido.setId(resultado.getInt("Id"));
                    usuarioValido.setNombre(resultado.getString("Nombre"));
                    usuarioValido.setApellido(resultado.getString("Apellido"));
                    usuarioValido.setDireccion(resultado.getString("Direccion"));
                    usuarioValido.setTelefono(resultado.getString("Telefono"));
                    usuarioValido.setCorreo(resultado.getString("Correo"));
                    usuarioValido.setUsuario(resultado.getString("Usuario"));
                    usuarioValido.setContrasena(resultado.getString("Contrasena"));
                }
            }
        } catch (Exception e) {
            System.out.println("Error al validar el usuario en la base de datos: " + e);
        }
        return usuarioValido;
    }

    public List<Usuario> listarT() {
        List<Usuario> lista = new ArrayList<>();
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("SELECT * FROM usuarios");
            resultado = pstm.executeQuery();
            while (resultado.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultado.getInt("Id"));
                usuario.setNombre(resultado.getString("Nombre"));
                usuario.setApellido(resultado.getString("Apellido"));
                usuario.setDireccion(resultado.getString("Direccion"));
                usuario.setTelefono(resultado.getString("Telefono"));
                usuario.setCorreo(resultado.getString("Correo"));
                usuario.setUsuario(resultado.getString("Usuario"));
                usuario.setContrasena(resultado.getString("Contrasena"));
                lista.add(usuario);
            }
        } catch (Exception e) {
            System.out.println("Error al listar los usuarios: " + e);
        }
        return lista;
    }

    public List<Usuario> listarN(String nombre) {
        List<Usuario> lista = new ArrayList<>();
        nombre = "%" + nombre + "%";
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("SELECT * FROM usuarios WHERE Nombre LIKE ?");
            pstm.setString(1, nombre);
            resultado = pstm.executeQuery();
            while (resultado.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultado.getInt("Id"));
                usuario.setNombre(resultado.getString("Nombre"));
                usuario.setApellido(resultado.getString("Apellido"));
                usuario.setDireccion(resultado.getString("Direccion"));
                usuario.setTelefono(resultado.getString("Telefono"));
                usuario.setCorreo(resultado.getString("Correo"));
                usuario.setUsuario(resultado.getString("Usuario"));
                usuario.setContrasena(resultado.getString("Contrasena"));
                lista.add(usuario);
            }
        } catch (Exception e) {
            System.out.println("Error al listar los usuarios por nombre: " + e);
        }
        return lista;
    }

    public boolean crear(Usuario usuario) {
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("INSERT INTO usuarios (Id, Nombre, Apellido, Direccion, Telefono, Correo, Usuario, Contrasena) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            pstm.setInt(1, usuario.getId());
            pstm.setString(2, usuario.getNombre());
            pstm.setString(3, usuario.getApellido());
            pstm.setString(4, usuario.getDireccion());
            pstm.setString(5, usuario.getTelefono());
            pstm.setString(6, usuario.getCorreo());
            pstm.setString(7, usuario.getUsuario());
            pstm.setString(8, usuario.getContrasena());
            pstm.executeUpdate();
            System.out.println("Usuario creado");
        } catch (Exception e) {
            System.out.println("Error al crear el usuario: " + e);
        }
        return true;
    }

    public Usuario listarI(String id) {
        Usuario usuario = new Usuario();
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("SELECT * FROM usuarios WHERE Id = ?");
            pstm.setString(1, id);
            resultado = pstm.executeQuery();
            if (resultado.next()) {
                usuario.setId(resultado.getInt("Id"));
                usuario.setNombre(resultado.getString("Nombre"));
                usuario.setApellido(resultado.getString("Apellido"));
                usuario.setDireccion(resultado.getString("Direccion"));
                usuario.setTelefono(resultado.getString("Telefono"));
                usuario.setCorreo(resultado.getString("Correo"));
                usuario.setUsuario(resultado.getString("Usuario"));
                usuario.setContrasena(resultado.getString("Contrasena"));
            }
        } catch (Exception e) {
            System.out.println("Error al listar el usuario por identificación: " + e);
        }
        return usuario;
    }

    public boolean editar(Usuario usuario) {
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("UPDATE tblusuarios SET Nombre = ?, Apellido = ?, Direccion = ?, Telefono = ?, Correo = ?, Usuario = ?, Contrasena = ? WHERE Id = ?");
            pstm.setString(1, usuario.getNombre());
            pstm.setString(2, usuario.getApellido());
            pstm.setString(3, usuario.getDireccion());
            pstm.setString(4, usuario.getTelefono());
            pstm.setString(5, usuario.getCorreo());
            pstm.setString(6, usuario.getUsuario());
            pstm.setString(7, usuario.getContrasena());
            pstm.setInt(8, usuario.getId());
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al editar el usuario: " + e);
        }
        return true;
    }

    public boolean eliminar(String id) {
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("DELETE FROM usuarios WHERE Id = ?");
            pstm.setString(1, id);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al eliminar el usuario: " + e);
        }
        return true;
    }
}
