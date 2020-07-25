/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Config.Conexion;
import Modelo.Producto;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class ProductoDao implements CRUD {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Producto p = new Producto();
    
    @Override
    public List listar() {
        ArrayList<Producto>list = new ArrayList<>();
        String sql = "select * from producto";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);   
            rs = ps.executeQuery();
            while(rs.next()){
                Producto proc = new Producto();
                proc.setId(rs.getInt("id"));
                proc.setNombre(rs.getString("nombre"));
                proc.setPrecio(rs.getInt("precio"));
                proc.setStock(rs.getInt("stock"));
                proc.setCategoria(rs.getString("categoria"));
                list.add(proc);
            }
        }catch(Exception e){
        }
        return list;
    }

    @Override
    public Producto list(int id) {
        String sql = "select * from producto where id="+id;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);   
            rs = ps.executeQuery();
            while(rs.next()){ 
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getInt("precio"));
                p.setStock(rs.getInt("stock"));
                p.setCategoria(rs.getString("categoria"));
            }
        }catch(Exception e){
        }
        return p;
    }

    @Override
    public boolean add(Producto p) {
        String sql = "insert into producto (nombre,precio,stock,categoria) values('"+p.getNombre()+"','"+p.getPrecio()+"','"+p.getStock()+"','"+p.getCategoria()+"')";
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        }catch(Exception e){
            
        }
        return false;
    }

    @Override
    public boolean edit(Producto p) {
        String sql = "update producto set nombre='"+p.getNombre()+"',precio='"+p.getPrecio()+"',stock='"+p.getStock()+"',categoria='"+p.getCategoria()+"'where id="+p.getId();
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
        
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "delete from producto where id="+id;
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch(Exception e){
        }
        return false;
    }
    
}
