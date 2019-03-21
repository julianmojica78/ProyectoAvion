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
    /**
     * 
     * @param asiento 
     */
    public AvionEco(List<Asiento> asiento) {
        super(asiento);
        this.eco = new String [2][3];
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
