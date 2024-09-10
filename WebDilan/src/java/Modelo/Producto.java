/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Jashir
 */
public class Producto {
    private int Id;
    private String Nombre;
    private String Foto;
    private String Descripcion;
    private int Precio;
    private int Stock;
    private int Idcategoria;

    public Producto() {
    }

    public Producto(int Id, String Nombre, String Foto, String Descripcion, int Precio, int Stock, int Idcategoria) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Foto = Foto;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Idcategoria = Idcategoria;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getIdcategoria() {
        return Idcategoria;
    }

    public void setIdcategoria(int Idcategoria) {
        this.Idcategoria = Idcategoria;
    }
    
    
}
