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
public class Categoria {
    int id_cat;
    String descripcion_cat;            

    public Categoria() {
    }

    public Categoria(int id_cat, String descripcion_cat) {
        this.id_cat = id_cat;
        this.descripcion_cat = descripcion_cat;
    }

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public String getDescripcion_cat() {
        return descripcion_cat;
    }

    public void setDescripcion_cat(String descripcion_cat) {
        this.descripcion_cat = descripcion_cat;
    }
    
    
}
