/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Configuracion.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
            conectar conexion = new conectar();
            con = conexion.crearconexion();
            if (con != null) {
                String query = "SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?";
                pstm = con.prepareStatement(query);
                pstm.setString(1, usuario);
                String hashedPass = hashPassword(pass);
                pstm.setString(2, hashedPass);
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
            System.out.println("Error al conectarse a la base de datos: " + e.getMessage());
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
}
