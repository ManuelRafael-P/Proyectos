/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Postulante;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class PersonaDao implements CRUD{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Postulante p = new Postulante();
    
    @Override
    public List listar() {
        ArrayList<Postulante>list = new ArrayList<>();
        String sql = "select * from postulante";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Postulante per = new Postulante();
                per.setId(rs.getInt("id"));
                per.setDni(rs.getString("dni"));
                per.setNombres(rs.getString("nombres"));
                per.setApellidos(rs.getString("apellidos"));
                per.setSexo(rs.getString("sexo"));
                per.setEst_civ(rs.getString("estado_civil"));
                per.setEmail(rs.getString("email"));
                per.setTelf(rs.getString("telefono"));
                list.add(per);
            }
        }catch(Exception e){
        
        }
        return list;
    }
    

    @Override
    public Postulante list(int id) {
        String sql = "select * from postulante where id="+id;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                p.setId(rs.getInt("id"));
                p.setDni(rs.getString("dni"));
                p.setNombres(rs.getString("nombres"));
                p.setApellidos(rs.getString("apellidos"));
                p.setSexo(rs.getString("sexo"));
                p.setEst_civ(rs.getString("estado_civil"));
                p.setEmail(rs.getString("email"));
                p.setTelf(rs.getString("telefono"));
                
            }
        }catch(Exception e){
        
        }
        return p;
    }

    @Override
    public boolean add(Postulante per) {
        String sql = "insert into postulante(dni,nombres,apellidos,sexo,estado_civil,email,telefono) values ('"+per.getDni()+"','"+per.getNombres()+"','"+per.getApellidos()+"','"+per.getSexo()+"','"+per.getEst_civ()+"','"+per.getEmail()+"','"+per.getTelf()+"')";                                                               
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
        }
        return false;
    }

    @Override
    public boolean edit(Postulante per) {
        String sql = "update postulante set dni='"+per.getDni()+"',nombres='"+per.getNombres()+"',apellidos='"+per.getApellidos()+"',sexo='"+per.getSexo()+"',estado_civil='"+per.getEst_civ()+"',email='"+per.getEmail()+"',telefono='"+per.getTelf()+"'where id="+per.getId();                                                               
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e){}
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "delete from postulante where id="+id;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){}
        return false;
    }
    
}
