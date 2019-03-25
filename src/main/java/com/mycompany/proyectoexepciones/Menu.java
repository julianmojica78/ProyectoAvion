package com.mycompany.proyectoexepciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Clase Menu donde tenemos los atributos los menus y los metodos del proyecto
 * @author David
 */
public class Menu {
    
    int bandera = 1;
    /**
     * constructor para inicializar los metodos
     */
    public Menu() {
        agregarVipMixto();
        agregarEcoMixto();
        agregarEconomico();
        agregarVip();
        menuPrinipal(); 
    }
    /**
     * atributo global de avionMixto
     */
        AvionMixto mix;
    /**
     * atributo global de avionVip
     */
        AvionVip vip;
    /**
     * atributo global de AvionEco
     */  
        AvionEco eco;
     /**
      * atributo para capturardatos de consola
      */
        Scanner sn = new Scanner(System.in);
    /**
     * metodo donde tenemos el menu principal
     */    
    public void menuPrinipal(){
        int opcion = 0; //Guardaremos la opcion del usuario
 
        do{
            System.out.println("\nBienvenidos");
            System.out.println("1. Avion Mixto");
            System.out.println("2. Avion Economico");
            System.out.println("3. Avion Vip");
            System.out.println("4. Salir");
 
            try {            
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                         menuMixto();
                        break;
                    case 2:
                         menuEco();                       
                        break;
                    case 3:
                         menuVip();
                        break;           
                    case 4:
                        System.out.println("Salir...");
                        System.exit(opcion);
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch(InputMismatchException e){
                System.out.println("Debes insertar un número");
                sn.next();
            } 
        }while(opcion != 5);  
    }
     /**
     * metodo donde tenemos el menu para el avion mixto
     */ 
    public void menuMixto(){
        int opcion = 0; //Guardaremos la opcion del usuario
 
        do{
            System.out.println("\nBienvenidos");
            System.out.println("1. Asientos Vip");
            System.out.println("2. Asiento Economicos");
            System.out.println("3. Despegar Avion!!");
            System.out.println("4. Volver");
 
            try {            
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        Logica log = new Logica ();
                        if(log.bandera(mix.bandera)){
                        imprimirVipMix();
                        generarCompraVipMix();
                        }else{
                            System.out.println("El avion no esta disponible en este momento!!");
                        }
                       break;
                    case 2:
                        imprimirGeneral(mix);
                        generarCompra(mix);
                        break;
                    case 3:
                        despegar(mix);
                        calcularTotalVipMix();
                        break;
                    case 4:
                        menuPrinipal();
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch(InputMismatchException e){
                System.out.println("Debes insertar un número");
                sn.next();
            } 
        }while(opcion != 4);  
    }
    /**
     * metodo donde tenemos el menu para el avion Vip
     */ 
    public void menuVip(){
        int opcion = 0; //Guardaremos la opcion del usuario
 
        do{
            System.out.println("\nBienvenidos");
            System.out.println("1. Asientos Vip");
            System.out.println("2. Despegar Avion!!");
            System.out.println("3. Volver");
 
            try {            
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        Logica log = new Logica();
                        if(log.bandera(vip.bandera)){
                            imprimirGeneral(vip);
                            generarCompra(vip);
                        }else{
                            System.out.println("El avion no esta disponible en este momento!!");
                        }
                       break;
                    
                    case 2:
                        despegar(vip);
                        calcularTotal(vip);
                        break;
                    case 3:
                        menuPrinipal();
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch(InputMismatchException e){
                System.out.println("Debes insertar un número");
                sn.next();
            } 
        }while(opcion != 3);  
    }
     /**
     * metodo donde tenemos el menu para el avion eonomico
     */ 
    public void menuEco(){
        int opcion = 0; //Guardaremos la opcion del usuario
 
        do{
            System.out.println("\nBienvenidos");
            System.out.println("1. Asientos Economicos");
            System.out.println("2. Despegar Avion!!");
            System.out.println("3. Volver");
 
            try {            
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        Logica log = new Logica ();
                        if(log.bandera(eco.bandera)){
                            imprimirGeneral(eco);
                            generarCompra(eco);
                        }else{
                            System.out.println("El avion no esta disponible en este momento!!");
                        }
                       break;
                    
                    case 2:
                        despegar(eco);
                         calcularTotal(eco);
                        break;
                    case 3:
                        menuPrinipal();
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch(InputMismatchException e){
                System.out.println("Debes insertar un número");
                sn.next();
            } 
        }while(opcion != 3);  
    }
    /**
     * metodo que nos genera el despegar desde una bandera
     * @param avion
     * @return avion
     */
    public Avion despegar(Avion avion){
        if(avion.bandera ==1){
            avion.bandera = -1;
            System.out.println("\nEl avion despego");
        }else{
            System.out.println("el avion no esta disponible");
        }
        
        return avion;
    }
    /**
     * metodo para generar la matriz de los asientos vip del avion mixto
     */ 
    public void agregarVipMixto(){
           mix = new AvionMixto(new String [3][4],new String[5][6],100,200);
           mix.bandera=1;
            for(int i=0;i<mix.getVip().length;i++ ){
            for(int j=0;j<mix.getVip()[i].length;j++){
                mix.getVip()[i][j]="0";
            }
        }      
    }
     /**
     * metodo para generar la matriz de los asientos economicos del avion mixto
     */ 
    public void agregarEcoMixto(){
   
        for(int i=0;i<mix.avion1.length;i++ ){
            for(int j=0;j<mix.avion1[i].length;j++){
                mix.avion1[i][j]="0";
            }
        }
     
    }
    /**
     * metodo para generar la matriz del avion economico
     */ 
    public void agregarEconomico(){
     eco = new AvionEco(new String [1][1],new String[3][3],100);
     eco.bandera=1;
        for(int i=0;i<eco.avion1.length;i++ ){
            for(int j=0;j<eco.avion1[i].length;j++){
                eco.avion1[i][j]="0";
            }
        }
    }
    /**
     * metodo para generar la matriz del avion vip
     */ 
    public void agregarVip(){
     vip = new AvionVip(new String [1][1],new String[5][6],200);
     vip.bandera=1;
        for(int i=0;i<vip.avion1.length;i++ ){
            for(int j=0;j<vip.avion1[i].length;j++){
                vip.avion1[i][j]="0";
            }
        }        
    }
    /**
     * metodo para imprimir la matriz de los asientos vip del avion mix
     */
    public void imprimirVipMix(){
         System.out.println("Asientos VIP  \n");
         for(int i=0; i<mix.getVip().length;i++){
             System.out.print("  "+(i+1)+" ");
         }
        for(int i=0;i<mix.getVip().length;i++ ){
            System.out.println();
            System.out.print((i+1)+" ");
            for(int j=0;j<mix.getVip()[i].length;j++){
            System.out.print(mix.getVip()[i][j]+"   ");
            }
        }
     }
    /**
     * metodo para imprimir la matriz de los asientos de los aviones
     */
    public void imprimirGeneral(Avion avion){
        String length =String.valueOf(avion.avion1.length);
        //String contenedor[] = new String[length];
        
         System.out.println("Asientos   \n");
         for(int i=0; i<avion.avion1.length;i++){
             System.out.print("  "+(i+1)+" ");
         }
        for(int i=0;i<avion.avion1.length;i++ ){
            System.out.println();
            System.out.print((i+1)+" ");
            for(int j=0;j<avion.avion1[i].length;j++){
            //contenedor[i][j] = avion.avion1[i][j]+1;
            System.out.print(avion.avion1[i][j]+"   ");
            }
        }
     }
    /**
     * metodo para generar la compra de los aviones
     * @param avion2 
     */
    public void generarCompra(Avion avion2){
        try{
         Logica logica1 = new Logica();
         System.out.println("\nIngreser  la fila del asiento a reservar");
         int fila = sn.nextInt();
         for(int k = 0;k < avion2.avion1.length;k++){
             if(logica1.compararFila(avion2.avion1.length, fila)){
                          System.out.println("Ingreser  la columna del asiento a reservar");
                          int columna = sn.nextInt();
            for(int l=0;l<avion2.avion1[k].length;l++){
                if(logica1.compararFila(avion2.avion1[k].length , columna)){
                                System.out.println("Ingrese Nombre de la Persona");
                                String nombre = sn.next();
                                System.out.println("Ingrese Identificacion ");
                                int identificacion = sn.nextInt();
                                System.out.println("Ingrese Fecha de Nacimiento (DD/MM/YYY)");
                                String fech = sn.next();
                                Date fecha = logica1.fecha(fech);
                                Persona persona1 = new Persona(identificacion, nombre, fecha);

                                for(int i = 0;i < avion2.avion1.length;i++){
                                    if(i == fila-1){
                                           for(int j=0;j<avion2.avion1[i].length;j++){
                                                   if(j == columna-1){
                                                   if(avion2.avion1[i][j] == "0"){
                                                      avion2.avion1[i][j] = "x";                             
                                                   } 
                                               }   
                                             }                
                                    }
                                }
                System.out.println("Reserva Creada Correctamente");
                }
                else{
                    System.out.println("Numero de columna no existe");
                    generarCompra(avion2);
                }
            break;
            }
            }else{
                    System.out.println("Numero de fila no existe");
                    generarCompra(avion2);
             }
            break;
         }
         }
             catch(InputMismatchException e){
             System.out.println("Digite un dato valido");
              sn = new Scanner (System.in);
              generarCompra(avion2);
          }
     }
    /**
     * metodo para generar la compra de los asientos Vip del avion mixto
     * @param avion2 
     */
    public void generarCompraVipMix(){
        try{
         Logica logica1 = new Logica();
         System.out.println("\nIngreser  la fila del asiento a reservar");
         int fila = sn.nextInt();
         for(int k = 0;k <mix.getVip().length;k++){
             if(mix.getVip().length > fila-1){
                          System.out.println("Ingreser  la columna del asiento a reservar");
                          int columna = sn.nextInt();
            for(int l=0;l<mix.getVip()[k].length;l++){
                if(mix.getVip()[k].length > columna-1){
                                System.out.println("Ingrese Nombre de la Persona");
                                String nombre = sn.next();
                                System.out.println("Ingrese Identificacion ");
                                int identificacion = sn.nextInt();
                                System.out.println("Ingrese Fecha de Nacimiento (DD/MM/YYY)");
                                String fech = sn.next();
                                Date fecha = logica1.fecha(fech);
                                Persona persona1 = new Persona(identificacion, nombre, fecha);
                                for(int i = 0;i<mix.getVip().length;i++){
                                    if(i == fila-1){
                                           for(int j=0;j<mix.getVip()[i].length;j++){
                                               if(j == columna-1){
                                                   if(mix.getVip()[i][j] == "0"){
                                                      mix.getVip()[i][j] = "x";
                                                   } 
                                               }
                                             }                
                                       }
                                }
                System.out.println("Reserva Creada Correctamente");
                }
                else{
                    System.out.println("Numero de columna no existe");
                    generarCompraVipMix();
                }
            break;
            }
            }else{
                    System.out.println("Numero de fila no existe");
                    generarCompraVipMix();
             }
            break;
         }
         }
             catch(InputMismatchException e){
             System.out.println("Digite un dato valido");
              sn = new Scanner (System.in);
              generarCompraVipMix();
          }
     }
    /**
     * metodo para calcular el precio total del avion 
     */
    public void calcularTotalVipMix(){
        Logica logica1 = new Logica();
            for(int i = 0;i<mix.getVip().length;i++){
                        for(int j=0;j<mix.getVip()[i].length;j++){
                                if(logica1.calcularTotalVip(mix.getVip()[i][j])){
                                mix.total = mix.precio + mix.total +mix.getPrecioVip() ;                            
                                } 
                          }
             }
            System.out.println("precio Total: "+mix.total);

        }
     /**
     * metodo para calcular el precio total del avion mixto
     */
    public void calcularTotal(Avion avion2){
         for(int i = 0;i < avion2.avion1.length;i++){
                    for(int j=0;j<avion2.avion1[i].length;j++){
                            if(avion2.avion1[i][j] == "x"){
                                avion2.total= avion2.precio + avion2.total;
                            } 
                    }    
         }
        System.out.println("precio Total: "+avion2.total);
        }
}

