package com.mycompany.proyectoexepciones;

import java.util.List;

/**
 * Clase AvionMixto que hereda de avion,donde se declaran sus metodos y atributos
 * @author David
 */
public class AvionMixto extends Avion{
    /**
     *atributo vip donde se genera la matriz
     */
    private String vip[][];
    /**
     * atributo para obtener el precio de los asientos vip
     */
    private float precioVip;
    /**
     * Constructor para inicializar las varibles de avion mixto
     * @param vip
     * @param precioVip
     * @param avion1
     * @param precio 
     */
    public AvionMixto(String[][] vip, String[][] avion1, float precio,float precioVip) {
        super(avion1, precio);
        this.vip = vip;
        this.precioVip = precioVip;
    }
    /**
     * metodo get para retornar la matriz de vip
     * @return vip
     */
    public String[][] getVip() {
        return vip;
    }
    /**
     * metodo set para modificar la matriz de vip
     * @param vip
     */
    public void setVip(String[][] vip) {
        this.vip = vip;
    }
    /**
     * metodo get para retornar el precio vip
     * @return precioVip
     */
    public float getPrecioVip() {
        return precioVip;
    }
    /**
     * metodo set para modificar el precio vip
     * @param precioVip 
     */
    public void setPrecioVip(float precioVip) {
        this.precioVip = precioVip;
    }
    
}  