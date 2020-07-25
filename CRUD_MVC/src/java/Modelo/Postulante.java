/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Manuel
 */
public class Postulante {
   int id;
   String dni,nombres,apellidos,sexo,est_civ,email,telf;

    public Postulante() {
    }

    public Postulante(String dni, String nombres, String apellidos, String sexo, String est_civ, String email, String telf) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.est_civ = est_civ;
        this.email = email;
        this.telf = telf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEst_civ() {
        return est_civ;
    }

    public void setEst_civ(String est_civ) {
        this.est_civ = est_civ;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }
   
    
}
