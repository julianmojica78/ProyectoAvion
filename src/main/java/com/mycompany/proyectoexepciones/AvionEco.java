package com.mycompany.proyectoexepciones;

import java.util.List;

/**
 * Clase AvionEco que hereda de avion,donde se declaran sus metodos y atributos
 * @author David
 */
public class AvionEco extends Avion{
     /**
     * atributo eco donde se genera la matriz
     */
    private String eco[][];
    /**
     * Constructor para inicializar las variables 
     * @param eco
     * @param avion1
     * @param precio 
     */
    public AvionEco(String[][] eco, String[][] avion1, float precio) {
        super(avion1, precio);
        this.eco = eco;
    }
    /**
     * metodo get para retornar la matriz eco
     * @return eco
     */
    public String[][] getEco() {
        return eco;
    }
    /**
     * metfodo set para modificar la matriz eco
     * @param eco 
     */
    public void setEco(String[][] eco) {
        this.eco = eco;
    }
    
    
}
