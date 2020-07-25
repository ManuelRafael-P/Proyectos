/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Manuel
 */
public class Producto {

    String cod;
    String descripcion;
    float precio;
    int stock;
    int stock_compro;
    int id_cat;
    int id_fabri;

    public Producto() {
    }

    public Producto(String cod, String descripcion, float precio, int stock, int stock_compro, int id_cat, int id_fabri) {
        this.cod = cod;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.stock_compro = stock_compro;
        this.id_cat = id_cat;
        this.id_fabri = id_fabri;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock_compro() {
        return stock_compro;
    }

    public void setStock_compro(int stock_compro) {
        this.stock_compro = stock_compro;
    }

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public int getId_fabri() {
        return id_fabri;
    }

    public void setId_fabri(int id_fabri) {
        this.id_fabri = id_fabri;
    }
    
    

}
