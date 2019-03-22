package com.mycompany.proyectoexepciones;

import java.util.List;

/**
 *
 * @author David
 */
public class AvionMixto extends Avion{
    /**
     *
     */
    private String vip[][];
    /**
     *
     */
   
    public AvionMixto(String[][] avion1,String[][] vip, float precio) {
        super(avion1, precio);
        this.vip = vip;
    }
    /**
     *
     * @param asiento
     */
    
    
    
   
    /**
     *
     * @return
     */
    public String[][] getVip() {
        return vip;
    }
    /**
     *
     * @param vip
     */
    public void setVip(String[][] vip) {
        this.vip = vip;
    }
}  