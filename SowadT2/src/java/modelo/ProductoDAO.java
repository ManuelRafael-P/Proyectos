/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class ProductoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public List listar(int fab) {
        String sql = "select * from producto where id_fabricante=" +fab;
        List<Producto> lista = new ArrayList<>();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setCod(rs.getString(1));
                p.setDescripcion(rs.getString(2));
                p.setPrecio(rs.getFloat(3));
                p.setStock(rs.getInt(4));
                p.setStock_compro(rs.getInt(5));
                p.setId_cat(rs.getInt(6));
                p.setId_fabri(rs.getInt(7));
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public int obtenerPrecio(String cod){
        int a=0;        
        String sql = "select (prec_pro) from producto where cod_pro="+cod;
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                a=rs.getInt(1);        
            }
        }catch(Exception e){
        }
        return a;           
    }
    
    public int actualizarStock(String id, int stock){
        String sql = "update producto set stock_pro=? where cod_pro=?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1,stock);
            ps.setString(2,id);
            ps.executeUpdate();
        }catch(Exception e){
        }
        return r;
    }
    
    public Producto buscar(String id){
        Producto p = new Producto();
        String sql = "select * from producto where cod_pro ="+id;
        try{
            con = cn.getConnection();
            ps= con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                p.setCod(rs.getString(1));
                p.setDescripcion(rs.getString(2));
                p.setPrecio(rs.getFloat(3));
                p.setStock(rs.getInt(4));
            }
        }catch(Exception e){
        }
        return p;
    }
   
}
