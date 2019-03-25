package com.mycompany.proyectoexepciones;

import java.util.List;

/**
 * Clase AvionVip que hereda de avion,donde se declaran sus metodos y atributos
 * @author David
 */
public class AvionVip extends Avion{
     /**
     * atributo vip donde se genera la matriz
     */
    private String vip[][];

    public AvionVip(String[][] vip, String[][] avion1, float precio) {
        super(avion1, precio);
        this.vip = vip;
    }  
    /**
     * metodo get para retornar la matriz vip
     * @return vip
     */
    public String[][] getVip() {
        return vip;
    }
    /**
     * metodo set para modificar la matriz vip
     * @param vip 
     */
    public void setVip(String[][] vip) {
        this.vip = vip;
    }
}
