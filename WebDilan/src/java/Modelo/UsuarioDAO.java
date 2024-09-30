/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Configuracion.Conectar;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jjuan
 */
public class UsuarioDAO {
    
    
    public Usuario Validar(String usuario, String pass) {
        Usuario usua = null;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            Conectar conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                String query = "SELECT * FROM usuarios WHERE usuario = ?";
                pstm = con.prepareStatement(query);
                pstm.setString(1, usuario);
                rs = pstm.executeQuery();
                if (rs.next()) {
                    usua = new Usuario();
                    usua.setCorreo(rs.getString("correo"));
                    usua.setId(rs.getInt("id"));
                    usua.setContrasena(rs.getString("contrasena"));
                    usua.setNombre(rs.getString("nombre"));
                    usua.setRol(rs.getString("rol"));
                    usua.setDireccion(rs.getString("direccion"));
                    usua.setApellido(rs.getString("apellido"));
                    usua.setTelefono(rs.getString("telefono"));
                    usua.setUsuario(rs.getString("usuario"));
                }
            }
        } catch (Exception e) {
            System.out.println("Error al Conectarse a la base de datos: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return usua;
    }
    private String hashPassword(String password) {
        return password;
    }
    public List<Usuario> listar() {
        List<Usuario> listarUser = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            Conectar conexion = new Conectar();
            con = conexion.crearconexion();

            String query = "SELECT * FROM usuarios";
            pstm = con.prepareStatement(query);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Usuario usua = new Usuario();
                usua.setId(rs.getInt("id"));
                usua.setNombre(rs.getString("nombre"));
                usua.setApellido(rs.getString("apellido"));
                usua.setDireccion(rs.getString("direccion"));
                usua.setTelefono(rs.getString("telefono"));
                usua.setCorreo(rs.getString("correo"));
                usua.setUsuario(rs.getString("usuario"));
                usua.setContrasena(rs.getString("contrasena"));
                usua.setRol(rs.getString("rol"));
                listarUser.add(usua);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar usuarios: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return listarUser;
    }
    public boolean insertar(Usuario user) {
      Connection con = null;
      PreparedStatement pstm = null;

      try {
          Conectar conexion = new Conectar();
          con = conexion.crearconexion();

            if (con != null) {
              System.out.println("Conexión establecida con la base de datos.");
            }

          String query = "INSERT INTO usuarios (nombre, apellido, direccion, telefono, correo, usuario, contrasena, rol) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
          pstm = con.prepareStatement(query);

          pstm.setString(1, user.getNombre());
          pstm.setString(2, user.getApellido());
          pstm.setString(3, user.getDireccion());
          pstm.setString(4, user.getTelefono());
          pstm.setString(5, user.getCorreo());
          pstm.setString(6, user.getUsuario());
          pstm.setString(7, user.getContrasena());  // La contraseña ya debería estar encriptada en este punto
          pstm.setString(8, user.getRol());

          int result = pstm.executeUpdate();  // Ejecutar la inserción

          return result > 0;  // Si se insertaron filas, retorna true
        }catch (SQLException e) {
          System.out.println("Error al insertar el usuario: " + e.getMessage());
          return false;
        }finally {
          try {
              if (pstm != null) pstm.close();
              if (con != null) con.close();
            }catch (SQLException e) {
              System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
    }
    

    
}

