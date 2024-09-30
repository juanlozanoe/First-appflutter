package Modelo;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Representa un pedido en el sistema.
 */
public class Pedido {
    private int id;
    private int idUsuario;
    private int total;
    private String estado;
    private String fechaCreacion;

    // Constructor por defecto
    public Pedido() {
    }

    // Constructor con todos los campos
    public Pedido(int id, int idUsuario, int total, String estado, String fechaCreacion) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.total = total;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
    }

    // Getter y Setter para id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter y Setter para idUsuario
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    // Getter y Setter para total
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    // Getter y Setter para estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", total=" + total +
                ", estado='" + estado + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
