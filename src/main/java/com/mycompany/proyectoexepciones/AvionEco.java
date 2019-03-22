package com.mycompany.proyectoexepciones;

import java.util.List;

/**
 *
 * @author David
 */
public class AvionEco extends Avion{
     /**
     * 
     */
    private String eco[][];

    public AvionEco(String[][] eco, String[][] avion1, float precio) {
        super(avion1, precio);
        this.eco = eco;
    }
    /**
     * 
     * @return 
     */
    public String[][] getEco() {
        return eco;
    }
    /**
     * 
     * @param eco 
     */
    public void setEco(String[][] eco) {
        this.eco = eco;
    }
    
    
}
