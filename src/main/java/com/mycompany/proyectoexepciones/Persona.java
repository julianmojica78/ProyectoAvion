package com.mycompany.proyectoexepciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author David
 */
public class Persona {
    /**
     * Atributo  de la identificacion de las personas
     */
    private int identificacion;
    /**
     * Atributo nombre de las personas
     */
    private String nombre;
    /**
     * atributo fecha de nacimiento de las personas
     */
    private Date fechaNacimiento;

    /**
     * constructor que inicializa las variables de la clase persona
     * @param identificacion
     * @param nombre
     * @param fechaNacimiento 
     */
    public Persona(int identificacion, String nombre, Date fechaNacimiento) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * retorna la identificacion de las personas
     * @return identificacion
     */
    public int getIdentificacion() {
        return identificacion;
    }
    /**
     * modifica la identificacion de las personas
     * @param identificacion 
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    /**
     * retorna el nombre de la persona
     * @return 
     */
    public String getNombre() {
        return nombre;
    }   
    /**
     * modifica el nombre de las personas
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * retorna la fecha de nacimiento de la persona
     * @return fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    /**
     * modifica la fecha de nacimiento de la persona
     * @param fechaNacimiento 
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
        public Date getFechaNac(){
        return fechaNacimiento;
    }   
    
    
}
