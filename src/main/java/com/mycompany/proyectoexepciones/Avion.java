package com.mycompany.proyectoexepciones;

import java.util.List;
import java.util.Map;

/**
 * Clase Padre Avion donde se declaran los metodos y atributps
 * @author David
 */
public class Avion {
    /**
     * atributo string para obtener la matriz
     */
    protected String avion1 [][];
    /**
     * atributo para obtener el atributo de precio
     */
    protected float precio;
    /**
     * atributo para obtener el total
     */
    protected float total;
    /**
     * atributo bandera
     */
    int bandera;
    /**
     * Constructor para iniializar las variables de Avion
     * @param avion1
     * @param precio 
     */
    public Avion(String[][] avion1, float precio) {
        this.avion1 = avion1;
        this.precio = precio;
    }
    /**
     * metodo get para retornar la matriz avion1
     * @return avion1
     */
    public String[][] getAvion1() {
        return avion1;
    }
    /**
     * metodo set para modificar la matriz avion
     * @param avion1 
     */
    public void setAvion1(String[][] avion1) {
        this.avion1 = avion1;
    }
    /**
     * metodo get para retornar el precio 
     * @return precio
     */
    public float getPrecio() {
        return precio;
    }
    /**
     * metodo set para modificar el precio
     * @param precio 
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    /**
     * metodo get para retornar el total 
     * @return total
     */
    public float getTotal() {
        return total;
    }
    /**
     * metodo set para modificar el total
     * @param total 
     */
    public void setTotal(float total) {
        this.total = total;
    }
}
