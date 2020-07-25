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
public class PedidoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public List listar() {
        String sql = "select * from pedido";
        List<Pedido> lista = new ArrayList<>();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pe = new Pedido();
                pe.setCod_pe(rs.getInt(1));
                pe.setCod_pro(rs.getString(2));
                pe.setCant_pe(rs.getInt(3));
                pe.setPrec_pro(rs.getFloat(4));
                lista.add(pe);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int GuardarPedido(Pedido pe) {
        String sql = "insert into pedido (cod_pro,cant_pro,prec_pro) values (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pe.getCod_pro());
            ps.setInt(2, pe.getCant_pe());
            ps.setFloat(3, pe.getPrec_pro());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
}
