package com.mycompany.proyectoexepciones;

/**
 * Clase asiento deonde se declaran sus metodos y atributos
 * @author David
 */
public class Asiento {
    /**
     * atributo para obtener el objeto persona
     */
    private Persona persona;
    /**
     * constructoe para inicializar las variables de asiento
     * @param persona 
     */
    public Asiento(Persona persona) {
        this.persona = persona;
    }
    /**
     * metodo get para retornar el objeto persona
     * @return persona
     */
    public Persona getPersona() {
        return persona;
    }
    /**
     * metodo set para modificar el objeto persona
     * @param persona 
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }  
}
