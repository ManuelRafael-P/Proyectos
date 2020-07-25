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
public class Fabricante {
    int id_fabricante;
    String nom_fabricante;

    public Fabricante() {
    }

    public Fabricante(int id_fabricante, String nom_fabricante) {
        this.id_fabricante = id_fabricante;
        this.nom_fabricante = nom_fabricante;
    }

    public int getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(int id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    public String getNom_fabricante() {
        return nom_fabricante;
    }

    public void setNom_fabricante(String nom_fabricante) {
        this.nom_fabricante = nom_fabricante;
    }
    
    
}
