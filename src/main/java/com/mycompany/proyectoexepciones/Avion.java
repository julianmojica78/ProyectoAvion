package com.mycompany.proyectoexepciones;

import java.util.List;
import java.util.Map;

/**
 *
 * @author David
 */
public class Avion {
    private List<Asiento> asiento;

    public Avion(List<Asiento> asiento) {
        this.asiento = asiento;
    }

    public List<Asiento> getAsiento() {
        return asiento;
    }

    public void setAsiento(List<Asiento> asiento) {
        this.asiento = asiento;
    }
    
    
}
