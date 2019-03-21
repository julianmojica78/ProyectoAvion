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
    /**
     * 
     * @param asiento 
     */
    public AvionVip(List<Asiento> asiento) {
        super(asiento);
        this.vip = new String [2][3];
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
