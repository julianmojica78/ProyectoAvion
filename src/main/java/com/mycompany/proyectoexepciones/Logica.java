/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoexepciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Logica {
     Scanner sn = new Scanner(System.in);
    public Logica() {
    }
    
    /**
     * metodo para validar la fecha capturada 
     * @param fech
     * @return Date
     */
       public Date fecha(String fech){
       SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/mm/yyyy");
       Date fecha = null;
       String contenedor = "";
       try {
           contenedor = contenedor.concat(fech);
           fecha = formatoDelTexto.parse(fech);
       }catch (ParseException ex){
       System.out.println("\n fecha incorrecta  debe de llevar el formato valido por favor ");
       System.out.println("\nIngrese Fecha de Nacimiento (DD/MM/YYY)");
       String date = sn.next();
       fecha(date);
       }return fecha;
   }
   public boolean bandera (int recibe) {
   if(recibe == 1){
         return true;
   }else{
        return false;
   }
   }
   public boolean compararFila(int fila , int fila1){
       if(fila > fila1-1){
           return true;
       }else{
           return false;
       }
    
   }
   public boolean calcularTotalVip(String mix){
       if(mix == "x"){
           return true;
       }else{
           return false;
       }
   }
}
   
