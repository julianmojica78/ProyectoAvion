package com.mycompany.proyectoexepciones;

import java.util.List;

/**
 *
 * @author David
 */
public class AvionVip extends Avion{
     /**
     * 
     */
    private String vip[][];

    public AvionVip(String[][] vip, String[][] avion1, float precio) {
        super(avion1, precio);
        this.vip = vip;
    }  
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
