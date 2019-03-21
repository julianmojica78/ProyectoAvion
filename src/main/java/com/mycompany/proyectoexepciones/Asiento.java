package com.mycompany.proyectoexepciones;

/**
 *
 * @author David
 */
public class Asiento {
    /**
     * 
     */
    private int id;
    private int cantidad;
    private float precio;

    public Asiento(int id, int cantidad, float precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    /**
     * 
     * @return 
     */
    public float getPrecio() {
        return precio;
    }
    /**
     * 
     * @param precio 
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * 
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return 
     */
    public int getCantidad() {
        return cantidad;
    }
    /**
     * 
     * @param cantidad 
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
