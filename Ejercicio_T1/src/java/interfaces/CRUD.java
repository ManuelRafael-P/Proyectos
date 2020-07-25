/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Modelo.Producto;
import java.util.List;

/**
 *
 * @author Manuel
 */
public interface CRUD {
    public List listar();
    public Producto list(int id);
    public boolean add(Producto p);
    public boolean edit(Producto p);
    public boolean eliminar(int id);
}
