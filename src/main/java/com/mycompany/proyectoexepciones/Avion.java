package com.mycompany.proyectoexepciones;

import java.util.List;
import java.util.Map;

/**
 *
 * @author David
 */
public class Avion {
    protected String avion1 [][];
    protected float precio;
    protected float total;
    int bandera;

    public Avion(String[][] avion1, float precio) {
        this.avion1 = avion1;
        this.precio = precio;
    }

    public String[][] getAvion1() {
        return avion1;
    }

    public void setAvion1(String[][] avion1) {
        this.avion1 = avion1;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
   
    
}
