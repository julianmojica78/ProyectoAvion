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
    private String eco[][];
    /**
     * 
     * @param asiento 
     */
    public AvionMixto(List<Asiento> asiento) {
        super(asiento);
        this.vip = new String [2][3];
        this.eco = new String [6][6];
    }
    public void agregarMixto(){
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
