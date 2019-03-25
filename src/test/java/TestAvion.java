/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.proyectoexepciones.Avion;
import com.mycompany.proyectoexepciones.AvionEco;
import com.mycompany.proyectoexepciones.AvionMixto;
import com.mycompany.proyectoexepciones.AvionVip;
import com.mycompany.proyectoexepciones.Logica;
import com.mycompany.proyectoexepciones.Menu;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class TestAvion {

    public TestAvion() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        //agregarEconomico();
        //agregarEcoMixto();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    // prueba de retorno de un booleano en positivo
    /**
     * metodo en el cual se prueba si el avion ya despego evaluando lo que trae de la bandera 
     * 
     */
     @Test
     public void bandera () 
     {
        Logica log =  new Logica ();
        boolean bo = log.bandera(1) ;
         assertTrue(bo);
     }
     /**
      * metodo que donde comparando que un numero sea mayor que otro
      */     
     @Test
     public void compararFila() 
     {
        Logica log =  new Logica ();
        boolean bo = log.compararFila(4,1) ;
        assertTrue(bo);
     }
     /**
      * metodo que donde comparamos don la matriz contenga x
      */
     @Test
     public void calcularTotalVip() 
     {
        Logica log =  new Logica ();
        boolean bo = log.calcularTotalVip("0");
        assertFalse(bo);
     }
}
