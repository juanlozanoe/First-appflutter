package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import Configuracion.Conectar;

public class PedidoDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/artesania";

    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    // Método para insertar un nuevo pedido
    public boolean insertar(Pedido pedido) {
        String sql = "INSERT INTO pedido (idUsuario, total, estado, fechaCreacion) VALUES (?, ?, ?, ?)";
        try (Connection conexion = conectar();
            PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, pedido.getIdUsuario());
            stmt.setInt(2, pedido.getTotal());
            stmt.setString(3, pedido.getEstado());
            stmt.setString(4, pedido.getFechaCreacion());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("error al insertar pedido " + e);
            return false;
        }
    }

    // Método para actualizar el estado de un pedido
    public boolean actualizar(Pedido pedido) {
        String sql = "UPDATE pedido SET estado = ? WHERE id = ?";
        try (Connection conexion = conectar();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, pedido.getEstado());
            stmt.setInt(2, pedido.getId());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para obtener todos los pedidos
    public List<Pedido> obtenerTodos() {
        List<Pedido> pedidos = new ArrayList<>();
       
        try {
            Conectar conex = new Conectar();
            Connection con = conex.crearconexion();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM pedido");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("entro en while");
                Pedido pedido = new Pedido();  
                pedido.setId(rs.getInt("id"));
                pedido.setIdUsuario(rs.getInt("idusuario"));
                pedido.setTotal(rs.getInt("total")); 
                pedido.setEstado(rs.getString("estado"));
                pedido.setFechaCreacion(rs.getString("fechaCreacion"));
                //pedido.setFechaCreacion(rs.getObject("fechaCreacion", LocalDateTime.class));
                pedidos.add(pedido);            
            }
        } catch (SQLException e) {
            System.out.println("error al listar los pedidos" + e);
        }
        return pedidos;
    }
    
        // Método para obtener todos los pedidos
    public List<Pedido> obtenerByIdUser(int idJ) {
        List<Pedido> pedidos = new ArrayList<>();
       
        try {
            Conectar conex = new Conectar();
            Connection con = conex.crearconexion();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM pedido where idusuario = ?");
            stmt.setInt(1, idJ);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("entro en while");
                Pedido pedido = new Pedido();  
                pedido.setId(rs.getInt("id"));
                pedido.setIdUsuario(rs.getInt("idusuario"));
                pedido.setTotal(rs.getInt("total")); 
                pedido.setEstado(rs.getString("estado"));
                pedido.setFechaCreacion(rs.getString("fechaCreacion"));
                pedidos.add(pedido);            
            }
        } catch (SQLException e) {
            System.out.println("error al listar los pedidos" + e);
        }
        return pedidos;
    }
    

    public int crearPedido(int idUser, int totalPagar, List<Producto> carrito) {
        int idPedido = 0;
        String sqlInsertarPedido = "INSERT INTO pedido (idUsuario, total, estado, fechaCreacion) VALUES (?, ?, ?, ?)";
        String sqlInsertarDetalles = "INSERT INTO detalles_pedido (id_pedido, id_producto, cantidad, precio) VALUES (?, ?, ?, ?)";

        try (Connection con = conectar();
             PreparedStatement pstmInsertarPedido = con.prepareStatement(sqlInsertarPedido, Statement.RETURN_GENERATED_KEYS);
             PreparedStatement pstmInsertarDetalles = con.prepareStatement(sqlInsertarDetalles)) {
           
            // Crear el pedido
            pstmInsertarPedido.setInt(1, idUser);
            pstmInsertarPedido.setInt(2, totalPagar);
            pstmInsertarPedido.setString(3, "Pendiente");
            pstmInsertarPedido.setTimestamp(4, new Timestamp(new Date().getTime()));
            pstmInsertarPedido.executeUpdate();
            

            // Obtener el id del pedido generado
            try (ResultSet rs = pstmInsertarPedido.getGeneratedKeys()) {
                if (rs.next()) {
                    idPedido = rs.getInt(1);
                }
            }

            // Insertar los detalles del pedido
            if (idPedido > 0) {
                for (Producto producto : carrito) {
                    pstmInsertarDetalles.setInt(1, idPedido);
                    pstmInsertarDetalles.setInt(2, producto.getId()); // ID del producto
                    pstmInsertarDetalles.setInt(3, producto.getStock()); // Usar stock como cantidad
                    pstmInsertarDetalles.setInt(4, producto.getPrecio()); // Precio del producto
                    pstmInsertarDetalles.addBatch();
                }
                pstmInsertarDetalles.executeBatch();
            }
        } catch (SQLException e) {
            System.out.println("error al insertar pedido " + e);
        }
        return idPedido;
    }
    



}
