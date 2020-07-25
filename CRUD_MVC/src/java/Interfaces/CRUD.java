/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Postulante;
import java.util.List;

/**
 *
 * @author Manuel
 */
public interface CRUD {    
    public List listar();
    public Postulante list(int id);
    public boolean add(Postulante per);
    public boolean edit(Postulante per);
    public boolean eliminar(int id); 
}
