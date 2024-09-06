/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Carrito {
    private int item;
    private int idproducto;
    private String nombre;
    private String descripcion;
    private String foto;
    private int preciocompra;
    private int cantidad;
    private int subtotal;

    public Carrito(int item, int idproducto, String nombre, String descripcion, String foto, int preciocompra, int cantidad, int subtotal) {
        this.item = item;
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
        this.preciocompra = preciocompra;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public Carrito() {
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(int preciocompra) {
        this.preciocompra = preciocompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
}
