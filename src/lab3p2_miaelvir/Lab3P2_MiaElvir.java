
package lab3p2_miaelvir;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Lab3P2_MiaElvir {

    static Scanner papoy = new Scanner(System.in);
    static Random ran = new Random(); 
    static ArrayList<Pokemon> pokemones = new ArrayList<>();
    static ArrayList<Pokebola> pokebolas = new ArrayList<>(); 
    
    public static void main(String[] args) {
        
        System.out.println("--- MENU PRINCIPAL---\n1. Crear Pokemon\n2. Crear Pokebola\n3. Listar Pokemon\n4. Eliminar Pokemon"
                + "\n5. Capturar pokemon\n6. Modificar Pokemon\n7. Salir\nIngrese la opcion que desee: ");
        int opcion = papoy.nextInt(); 
        
        while (opcion > 0 && opcion < 7){
            switch (opcion){
                case 1: 
                    boolean run = true; 
                    while (run == true){
                        System.out.println("¿Que pokemon desea agregar?\n--- Submenu Pokemones ---\n1. FireType\n2. WaterType\n3. GrassType\n4.Salir"
                            + "\nIngrese su eleccion: ");
                        int op = papoy.nextInt(); 
                        while (op < 1 || op > 5){
                            System.out.println("El numero que ingreso no esta permitido\n"
                                    + "Vuelva a Ingresarlo: ");
                            op = papoy.nextInt(); 
                        }
                        if (op == 4){
                            break; 
                        }
                            switch(op){
                                case 1: 
                                    System.out.println("- Agregar FireType");
                                    System.out.println("Ingrese el nombre: ");
                                    papoy.nextLine(); 
                                    String nombreFire = papoy.nextLine(); 
                                    System.out.println("Ingrese el numero de entrada de la pokedex: ");
                                    int entradaFire = papoy.nextInt(); 
                                    System.out.println("Ingrese su naturaleza (Timido, energetico o misterioso): ");
                                    papoy.nextLine(); 
                                    String naturalezaFire = papoy.nextLine(); 
                                    while (Pokemon.naturalezaAdmitida(naturalezaFire) == false){
                                        System.out.println("Naturaleza no aceptada\nVuelva a Ingresarla: ");
                                        naturalezaFire = papoy.nextLine(); 
                                    }
                                    System.out.println("Ingrese la potencia de sus llamas: ");
                                    int potenciaFire = papoy.nextInt(); 
                                    pokemones.add(new FireType(potenciaFire, nombreFire, entradaFire, naturalezaFire, false, null)); 
                                    
                                    break; 
                                case 2: 
                                    System.out.println("- Agregar WaterType");
                                    System.out.println("Ingrese el nombre: ");
                                    papoy.nextLine(); 
                                    String nombreWater = papoy.nextLine(); 
                                    System.out.println("Ingrese el numero de entrada de la pokedex: ");
                                    int entradaWater = papoy.nextInt(); 
                                    System.out.println("Ingrese su naturaleza (Timido, energetico o misterioso): ");
                                    papoy.nextLine(); 
                                    String naturalezaWater = papoy.nextLine(); 
                                    while (Pokemon.naturalezaAdmitida(naturalezaWater) == false){
                                        System.out.println("Naturaleza no aceptada\nVuelva a Ingresarla: ");
                                        naturalezaFire = papoy.nextLine(); 
                                    }
                                    System.out.println("Este pokemon puede vivir fuera del agua?\nSi o no");
                                    String vidaAgua = papoy.nextLine(); 
                                    boolean vidasi = false; 
                                    if (vidaAgua.equalsIgnoreCase("si")){
                                        vidasi = true; 
                                    }
                                    System.out.println("Ingrese el numero de la rapidez para nadar: ");
                                    int rapidezNadar = papoy.nextInt(); 
                                    pokemones.add(new WaterType(vidasi, rapidezNadar, nombreWater, entradaWater, naturalezaWater, false,null)); 
                                    
                                    break; 
                                case 3: 
                                    System.out.println("- Agregar GrassType");
                                    System.out.println("Ingrese el nombre: ");
                                    papoy.nextLine(); 
                                    String nombreGrass = papoy.nextLine(); 
                                    System.out.println("Ingrese el numero de entrada de la pokedex: ");
                                    int entradaGrass = papoy.nextInt(); 
                                    System.out.println("Ingrese su naturaleza (Timido, energetico o misterioso): ");
                                    papoy.nextLine(); 
                                    String naturalezaGrass = papoy.nextLine(); 
                                    while (Pokemon.naturalezaAdmitida(naturalezaGrass) == false){
                                        System.out.println("Naturaleza no aceptada\nVuelva a Ingresarla: ");
                                        naturalezaFire = papoy.nextLine(); 
                                    }
                                    System.out.println("Ingrese el habitat del pokemon: ");
                                    String habitat = papoy.nextLine(); 
                                    System.out.println("Ingrese su dominio entre las plantas del 0 al 100: ");
                                    int dominioPlantas = papoy.nextInt(); 
                                    while (GrassType.dominioAdmitido(dominioPlantas) == false){
                                        System.out.println("Dominio fuera de rango\nIngreselo de nuevo: ");
                                        dominioPlantas = papoy.nextInt(); 
                                    }
                                    pokemones.add(new GrassType(habitat, dominioPlantas, nombreGrass, entradaGrass, naturalezaGrass, false, null)); 
                                    break; 

                            }
                                System.out.println("Desea agregar otro pokemon? \n(Si o no)");
                                papoy.nextLine();
                                String siono = papoy.nextLine(); 
                                if (siono.equalsIgnoreCase("no")){
                                  run = false; 
                                }
                    
                    }//fin run 
                    break; 
                case 2: 
                    System.out.println("-Crear Pokebola");
                    System.out.println("Ingrese el color de la Pokebola: ");
                    papoy.nextLine(); 
                    String colorpoke = papoy.nextLine(); 
                    System.out.println("Ingrese el numero de serie de la pokebola: ");
                    int numSerie = papoy.nextInt(); 
                    while (numSerieencontrado(numSerie, pokebolas) == true){
                        System.out.println("Numero de serie ya existente\nIngrese otro: ");
                        numSerie = papoy.nextInt();
                    }
                    int efi_atrapado = ran.nextInt(1, 4); 
                    pokebolas.add(new Pokebola(colorpoke, numSerie, efi_atrapado)); 
                    System.out.println("Pokebola creada!");
                    
                    break; 
                case 3: 
                    if (pokemones.isEmpty() == true){
                        System.out.println("No se puede listar ya que la lista esta vacia");
                        break; 
                    }
                    System.out.println("-Listado Pokemones");
                    listar(pokemones); 
                    break; 
                case 4: 
                    break; 
                case 5: 
                    break; 
                case 6: 
                    break; 
                    
            
            }
        
            System.out.println("--- MENU PRINCIPAL---\n1. Crear Pokemon\n2. Crear Pokebola\n3. Listar Pokemon\n4. Eliminar Pokemon"
                + "\n5. Capturar pokemon\n6. Modificar Pokemon\n7. Salir\nIngrese la opcion que desee: ");
            opcion = papoy.nextInt(); 
        }//while menu principal
        
        
        
        
    }//fin main
    
   public static boolean numSerieencontrado(int numero, ArrayList<Pokebola> lista){
       if (lista.size() > 0){
        for (int i = 0; i < lista.size(); i++) {
            Pokebola pokecita = lista.get(i); 
            if (pokecita.getNumSerie() == numero){
                return true; 
            }
        }
       }
       return false; 
   
   }
   
   public static void listar(ArrayList<Pokemon> lista){
       System.out.println("Firetype ---");
       for (int i = 0; i < lista.size(); i++) {
           Object pokeci = lista.get(i); 
           if (pokeci instanceof FireType){
               System.out.println(pokeci.toString());
           }
       }
   }
}
