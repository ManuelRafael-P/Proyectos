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
public class Pedido {
    int cod_pe;
    String cod_pro;
    int cant_pe;
    float prec_pro;

    public Pedido() {
    }

    public Pedido(int cod_pe, String cod_pro, int cant_pe, float prec_pro) {
        this.cod_pe = cod_pe;
        this.cod_pro = cod_pro;
        this.cant_pe = cant_pe;
        this.prec_pro = prec_pro;
    }

    public int getCod_pe() {
        return cod_pe;
    }

    public void setCod_pe(int cod_pe) {
        this.cod_pe = cod_pe;
    }

    public String getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(String cod_pro) {
        this.cod_pro = cod_pro;
    }

    public int getCant_pe() {
        return cant_pe;
    }

    public void setCant_pe(int cant_pe) {
        this.cant_pe = cant_pe;
    }

    public float getPrec_pro() {
        return prec_pro;
    }

    public void setPrec_pro(float prec_pro) {
        this.prec_pro = prec_pro;
    }
    
    
    
    
}
