/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Configuracion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kkati
 */
public class productoDAO {

    Conectar Conexcion;
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;

    public List<Producto> obtenerProductos() {
        List<Producto> productos = new ArrayList<>();
        try {
            Conectar conection = new Conectar();
            Connection conexion = conection.crearconexion();
            if (conexion != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            String consulta = "SELECT * FROM producto";
            PreparedStatement stm = conexion.prepareStatement(consulta);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int id = rs.getInt("id");
                String descripcion = rs.getString("descripcion");
                int precio = rs.getInt("precio");
                String foto = rs.getString("foto");
                int stock = rs.getInt("stock");

                // Asegúrate de que el orden de los parámetros coincida con el constructor
                Producto producto = new Producto(id, precio, stock, nombre, foto, descripcion); 
                productos.add(producto);
            }
        } catch (Exception ex) {
            System.out.println("Hubo un Error Al Cargar Los Productos: " + ex);
        }

        return productos;
    }


    public boolean crear(Producto pro) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            Conectar Conexcion = new Conectar();
            con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }

            pstm = con.prepareStatement("INSERT INTO producto (nombre, descripcion, precio, foto, stock) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, pro.getNombre());
            pstm.setString(2, pro.getDescripcion());
            pstm.setInt(3, pro.getPrecio());
            pstm.setString(4, pro.getFoto());
            pstm.setInt(5, pro.getStock());

            int affectedRows = pstm.executeUpdate();
            if (affectedRows > 0) {
                rs = pstm.getGeneratedKeys();
                if (rs.next()) {
                    int generatedId = rs.getInt(1); // Obtén el id generado
                    pro.setId(generatedId); // Establece el id en el objeto Producto
                }
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error al crear los productos: " + e);
            return false;
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (con != null) con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar los recursos: " + e);
            }
        }
    }

    

    public Producto obtenerProducto(int idProducto) {
        Producto producto = new Producto();
        try {
            Conectar conection = new Conectar();
            Connection conexion = conection.crearconexion();
            if (conexion != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");

            }
            String consulta = "Select * from producto where id = ?";
            PreparedStatement pstm = conexion.prepareStatement(consulta);
            pstm.setInt(1, idProducto);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getInt("precio"));
                producto.setFoto(rs.getString("foto"));
                producto.setStock(rs.getInt("stock"));
            }
        } catch (Exception ex) {
            System.out.println("Hubo un Error Al Cargar Los Productos " + ex);
        }

        return producto;
    }

    public void eliminar(int idProducto) {
        try {
            Conexcion = new Conectar();
            Connection con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");
            }
            pstm = con.prepareStatement("delete from producto where id = ?");
            pstm.setInt(1, idProducto);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al eliminar el Producto " + e);
        }
    }

    public void actualizarProducto(Producto producto) {
        try {
            Conectar conection = new Conectar();
            Connection conexion = conection.crearconexion();
            if (conexion != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");

                String consulta = "UPDATE producto SET nombre = ?, descripcion = ?, precio = ?, foto = ?, stock = ? WHERE id = ?";
                PreparedStatement pstm = conexion.prepareStatement(consulta);
                pstm.setString(1, producto.getNombre());
                pstm.setString(2, producto.getDescripcion());
                pstm.setInt(3, producto.getPrecio());
                pstm.setString(4, producto.getFoto());
                pstm.setInt(5, producto.getStock());
                pstm.setInt(6, producto.getId());

                int filasAfectadas = pstm.executeUpdate();
            }
        } catch (Exception ex) {
            System.out.println("Hubo un error al actualizar el producto: " + ex.getMessage());
        }
    }

    // Método para crear un pedido en la base de datos
    public void crearPedido(Pedido pedido) {
        Connection conexion = null;
        PreparedStatement pstm = null;

        try {
            // Crear la conexión con la base de datos
            Conectar conection = new Conectar();
            conexion = conection.crearconexion(); // Establecer conexión con la base de datos

            // SQL para insertar un nuevo pedido
            String sql = "INSERT INTO pedido (idusuario, fechaCreacion, total, estado) VALUES (?, ?, ?, ?)";
            pstm = conexion.prepareStatement(sql);

            // Establecer los parámetros de la consulta
            pstm.setInt(1, pedido.getIdUsuario());
            pstm.setString(2, pedido.getFechaCreacion());
            pstm.setDouble(3, pedido.getTotal());
            pstm.setString(4, pedido.getEstado());

            // Ejecutar la actualización
            pstm.executeUpdate();

        } catch (SQLException e) {
            // Imprimir la excepción si ocurre un error
            System.out.println("error al crear pedido " + e);
        } finally {
            // Cerrar recursos en el bloque finally para garantizar que se cierren siempre
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

     public Pedido obtenerPedido(int idUsuario) {
        Pedido pedido = null;
        Connection conexion = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            // Crear la conexión con la base de datos
            Conectar conection = new Conectar();
            conexion = conection.crearconexion(); // Establecer conexión con la base de datos

            // SQL para obtener el último pedido con estado 'Espera' del usuario
            String sql = "SELECT id, idusuario, fechaCreacion, total, estado "
                    + "FROM pedido "
                    + "WHERE idusuario = ? AND estado = 'Espera' "
                    + "ORDER BY fechaCreacion DESC "
                    + "LIMIT 1";
            pstm = conexion.prepareStatement(sql);
            pstm.setInt(1, idUsuario);

            // Ejecutar la consulta
            rs = pstm.executeQuery();

            // Procesar el resultado
            if (rs.next()) {
                pedido = new Pedido(); // Inicializar el objeto pedido solo si hay resultados
                pedido.setId(rs.getInt("id"));
                pedido.setIdUsuario(rs.getInt("idusuario"));
                pedido.setFechaCreacion(rs.getString("fechaCreacion"));
                pedido.setTotal(rs.getInt("total")); // Cambiar a getDouble si el total es decimal
                pedido.setEstado(rs.getString("estado"));
            }

        } catch (SQLException e) {
            // Imprimir la excepción si ocurre un error
            e.printStackTrace();
        } finally {
            // Cerrar recursos en el bloque finally para garantizar que se cierren siempre
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conexion != null) conexion.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return pedido;
    }

   public void crearDetalle(DetallePedido detallePedido) {
        Connection conexion = null;
        PreparedStatement pstm = null;

        try {
            // Crear la conexión con la base de datos
            Conectar conection = new Conectar();
            conexion = conection.crearconexion(); // Establecer conexión con la base de datos

            // SQL para insertar un detalle de pedido
            String sql = "INSERT INTO detalle_pedido (idpedido, idproducto, cantidad, total) VALUES (?, ?, ?, ?)";
            pstm = conexion.prepareStatement(sql);

            // Establecer los parámetros de la consulta
            pstm.setInt(1, detallePedido.getIdPedido());
            pstm.setInt(2, detallePedido.getIdProducto());
            pstm.setInt(3, detallePedido.getCantidad());
            pstm.setDouble(4, detallePedido.getTotal());

            // Ejecutar la actualización
            pstm.executeUpdate();

        } catch (SQLException e) {
            // Imprimir la excepción si ocurre un error
            e.printStackTrace();
        } finally {
            // Cerrar recursos en el bloque finally para garantizar que se cierren siempre
            try {
                if (pstm != null) pstm.close();
                if (conexion != null) conexion.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

}
