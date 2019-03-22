package com.mycompany.proyectoexepciones;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Menu {
    public Menu() {
        agregarVipMixto();
        agregarEcoMixto();
        agregarEconomico();
        agregarVip();
        menuPrinipal();
        
        
    }
        AvionMixto mix;
        AvionVip vip;
        AvionEco eco;
        Scanner sn = new Scanner(System.in);
                
        public void menuPrinipal(){
        
      
        
        int opcion = 0; //Guardaremos la opcion del usuario
 
        do{
            System.out.println("\nBienvenidos");
            System.out.println("1. Avion Mixto");
            System.out.println("2. Avion Economico");
            System.out.println("3. Avion Vip");
            System.out.println("4. Despegar Avion");
            System.out.println("5. Salir");
 
            try {            
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                         menuMixto();
                        break;
                    case 2:
                        imprimirGeneral (vip);
                        break;
                    case 3:
                         imprimirGeneral (eco);
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
        public void menuMixto(){
        int opcion = 0; //Guardaremos la opcion del usuario
 
        do{
            System.out.println("\nBienvenidos");
            System.out.println("1. Asientos Vip");
            System.out.println("2. Asiento Economicos");
            System.out.println("3. Volver");
 
            try {            
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        imprimirVipMix();
                        generarCompraVipMix();
                       break;
                    case 2:
                        imprimirGeneral(mix);
                        generarCompra(mix);
                        break;
                    case 3:
                        menuPrinipal();
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch(Exception e){
                System.out.println("Debes insertar un número");
                sn.next();
            } 
        }while(opcion != 3);  
    }
         public void agregarVipMixto(){
           mix = new AvionMixto(new String [1][1],new String[2][2],100);
            for(int i=0;i<mix.getVip().length;i++ ){
            for(int j=0;j<mix.getVip()[i].length;j++){
                mix.getVip()[i][j]="0";
            }
        }      
    }
    
    public void agregarEcoMixto(){
   
        for(int i=0;i<mix.avion1.length;i++ ){
            for(int j=0;j<mix.avion1[i].length;j++){
                mix.avion1[i][j]="0";
            }
        }
     
    }
    public void agregarEconomico(){
     eco = new AvionEco(new String [1][1],new String[2][2],100);
        for(int i=0;i<eco.avion1.length;i++ ){
            for(int j=0;j<eco.avion1[i].length;j++){
                eco.avion1[i][j]="0";
            }
        }        
    }
     public void agregarVip(){
     vip = new AvionVip(new String [1][1],new String[2][2],100);
        for(int i=0;i<vip.avion1.length;i++ ){
            for(int j=0;j<vip.avion1[i].length;j++){
                vip.avion1[i][j]="0";
            }
        }        
    }
     
     public void imprimirVipMix(){
      System.out.println("Asientos VIP \n");
        for(int i=0;i<mix.getVip().length;i++ ){
            for(int j=0;j<mix.getVip()[i].length;j++){
            System.out.print(mix.getVip()[i][j]);
            }
        }
     }
     public void imprimirGeneral(Avion avion){
         System.out.println("Asientos   \n");
         for(int i=0; i<avion.avion1.length;i++){
             System.out.print("  "+(i+1)+" ");
         }
        for(int i=0;i<avion.avion1.length;i++ ){
            System.out.println();
            System.out.print((i+1)+" ");
            for(int j=0;j<avion.avion1[i].length;j++){
            System.out.print(avion.avion1[i][j]);
            }
        }
     }
     
     public void generarCompra(Avion avion2){
        try{
         System.out.println("Ingreser  la fila del asiento a reservar");
         int fila = sn.nextInt();
         System.out.println("Ingreser  la columna del asiento a reservar");
         int columna = sn.nextInt();
        
         for(int i = 0;i<avion2.avion1.length;i++){
             if(i == fila-1){
                    for(int j=0;j<avion2.avion1[i].length;j++){
                        if(j == columna-1){
                            if(avion2.avion1[i][j] == "0"){
                            avion2.avion1[i][j].equals("1");
                            } 
                        }
                      }                
             }
         }
          }
          catch(Exception e){
              System.out.println("Digite un dato valido");
              sn = new Scanner (System.in);
              generarCompra(avion2);
          }
     }
 public void generarCompraVipMix(){
        try{
         System.out.println("Ingreser  la fila del asiento a reservar");
         int fila = sn.nextInt();
         System.out.println("Ingreser  la columna del asiento a reservar");
         int columna = sn.nextInt();
         System.out.println("Ingrese Nombre de la Persona");
         String nombre = sn.next("");
         System.out.println("Ingrese Identificacion ");
         int identificacion = sn.nextInt();
         System.out.println("Ingrese Fecha de Nacimiento (DD/MM/YYY)");
         String fecha = sn.next("");
         for(int i = 0;i<mix.getVip().length;i++){
             if(i == fila-1){
                    for(int j=0;j<mix.getVip()[i].length;j++){
                        if(j == columna-1){
                            if(mix.getVip()[i][j] == "0"){
                            mix.getVip()[i][j].equals("1");
                            } 
                        }
                      }                
             }
         }
          }
          catch(Exception e){
              System.out.println("Digite un dato valido");
              sn = new Scanner (System.in);
              generarCompra(mix);
          }
     }
}
