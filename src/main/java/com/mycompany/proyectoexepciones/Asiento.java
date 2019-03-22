package com.mycompany.proyectoexepciones;

/**
 *
 * @author David
 */
public class Asiento {
    private Persona persona;

    public Asiento(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }  
}
