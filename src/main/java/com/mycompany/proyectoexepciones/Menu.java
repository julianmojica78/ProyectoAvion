package com.mycompany.proyectoexepciones;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Menu {

    public Menu() {
        menuPrinipal();
    }
    
        public void menuPrinipal(){
        Scanner sn = new Scanner(System.in);
        int opcion = 0; //Guardaremos la opcion del usuario
 
        do{
            System.out.println("Bienvenidos");
            System.out.println("1. Avion Mixto");
            System.out.println("2. Avion Economico");
            System.out.println("3. Avion Vip");
            System.out.println("4. Despegar Avion");
            System.out.println("5. Salir");
 
            try {            
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;                        
                    case 4:
                        break;
                    case 5:
                        System.out.println("Salir...");
                        System.exit(opcion);
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch(Exception e){
                System.out.println("Debes insertar un número");
                sn.next();
            } 
        }while(opcion != 5);  
    }
}
