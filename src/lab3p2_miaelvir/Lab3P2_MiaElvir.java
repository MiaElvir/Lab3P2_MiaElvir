
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
                    System.out.println("Ingrese la eficiencia de atrapado: ");
                    int efi_atrapado = papoy.nextInt(); 
                    while (efi_atrapado < 0 || efi_atrapado > 4){
                        System.out.println("Debe estar en el rango 1 a 3\nVuelvalo a ingresar: ");
                        efi_atrapado = papoy.nextInt(); 
                    }
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
                    if (pokemones.isEmpty() == true){
                        System.out.println("No se puede eliminar porque la lista esta vacia");
                        break; 
                    }
                    System.out.println("¿Que tipo de pokemon desea eliminar?\n1. FireType\n2. WaterType\n3. GrassType\nIngrese la opcion: ");
                    int eliminar = papoy.nextInt(); 
                    if (eliminar < 0 || eliminar > 4){
                        System.out.println("Vuelva a ingresarlo: ");
                        eliminar = papoy.nextInt(); 
                    }
                    switch (eliminar){
                        case 1: 
                            System.out.println("-Listado FireType");
                            System.out.println("Firetype ---");
                            ArrayList<Integer> indices = new ArrayList<Integer>(); 
                            for (int i = 0; i < pokemones.size(); i++) {
                                Object pokeci = pokemones.get(i); 
                                if (pokeci instanceof FireType){
                                    System.out.println(i+". "+pokeci.toString());
                                    indices.add(i); 
                                }
                            }
                            System.out.println("Ingrese el indice del pokemon que desea eliminar: ");
                            int elim_fire = papoy.nextInt(); 
                            while (existe(indices, elim_fire) == false){
                                System.out.println("El indice no es correcto\nIngreselo de nuevo: ");
                                elim_fire = papoy.nextInt(); 
                            }
                            pokemones.remove(elim_fire); 
                            break; 
                        case 2: 
                            System.out.println("-Listado WaterType");
                            System.out.println("Watertype ---");
                            ArrayList<Integer> indices_water = new ArrayList<Integer>(); 
                            for (int i = 0; i < pokemones.size(); i++) {
                                Object pokeci = pokemones.get(i); 
                                if (pokeci instanceof WaterType){
                                    System.out.println(i+". "+pokeci.toString());
                                    indices_water.add(i); 
                                }
                            }
                            System.out.println("Ingrese el indice del pokemon que desea eliminar: ");
                            int elim_water = papoy.nextInt(); 
                            while (existe(indices_water, elim_water) == false){
                                System.out.println("El indice no es correcto\nIngreselo de nuevo: ");
                                elim_water = papoy.nextInt(); 
                            }
                            pokemones.remove(elim_water); 
                            break; 
                        case 3: 
                            System.out.println("-Listado FireType");
                            System.out.println("Grasstype ---");
                            ArrayList<Integer> indices_g = new ArrayList<Integer>(); 
                            for (int i = 0; i < pokemones.size(); i++) {
                                Object pokeci = pokemones.get(i); 
                                if (pokeci instanceof GrassType){
                                    System.out.println(i+". "+pokeci.toString());
                                    indices_g.add(i); 
                                }
                            }
                            System.out.println("Ingrese el indice del pokemon que desea eliminar: ");
                            int elim_g = papoy.nextInt(); 
                            while (existe(indices_g, elim_g) == false){
                                System.out.println("El indice no es correcto\nIngreselo de nuevo: ");
                                elim_g = papoy.nextInt(); 
                            }
                            pokemones.remove(elim_g); 
                            break; 
                    }
                    System.out.println("Pokemon eliminado!");
                    break; 
                case 5: 
                    if (pokebolas.isEmpty() == true || pokemones.isEmpty() == true){
                        System.out.println("no se puede realizar la simulacion");
                        break; 
                    }
                    System.out.println("Simulacion--");
                    for (int i = 0; i < pokebolas.size(); i++) {
                        Pokebola poke = pokebolas.get(i); 
                        System.out.println(i+". "+poke.toString());
                    }
                    System.out.println("Ingrese el indice de la Pokebola que desea utilizar: ");
                    int pokecita = papoy.nextInt(); 
                    while (pokecita < 0 || pokecita > pokebolas.size()-1){
                        System.out.println("Indice fuera de rango\nIngreselo de nuevo: ");
                        pokecita = papoy.nextInt(); 
                    }
                    Pokebola poke_elegida = pokebolas.get(pokecita); 
                    Pokemon pokemon_ele = pokemones.get(elegirPokemon(pokemones)); 
                    System.out.println("El pokemon "+pokemon_ele.getNombre()+" ha aparecido!\nQue desea hacer?\n1. Utilizar la pokebola para atraparlo"
                            + "\n2. huir del encuentro");
                    int hui = papoy.nextInt(); 
                    while (hui < 1 || hui > 2){
                        System.out.println("Numero no aceptado vuelva a Ingresarlo: ");
                        hui = papoy.nextInt(); 
                    }
                    switch (hui){
                        case 1: 
                            System.out.println("--- usar la pokebola ---");
                            int rani = ran.nextInt(1, 4); 
                            System.out.println(rani);
                            if (rani == poke_elegida.getEficiencia_a()){
                                System.out.println("Se ha capturado al pokemon");
                                pokemon_ele.setPokeball(poke_elegida);
                                pokemon_ele.setEstado_atrapado(true);
                                pokebolas.remove(poke_elegida); 
                            }else if (rani < poke_elegida.getEficiencia_a()){
                                System.out.println("Se ha capturado al pokemon");
                                pokemon_ele.setPokeball(poke_elegida);
                                pokemon_ele.setEstado_atrapado(true);
                                pokebolas.remove(poke_elegida); 
                            }else{
                                System.out.println("Pokemon no capturado");
                                pokebolas.remove(poke_elegida); 
                            }
                            break; 
                        case 2: 
                            System.out.println("Huyendo del encuentro");
                            break; 
                        
                    }
                    break; 
                case 6: 
                    System.out.println("Modificar--\n1. FireType\n2. WaterType\n3. GrassType\nIngrese el tipo que quiere modificar: ");
                    int modi = papoy.nextInt(); 
                    while (modi < 1 || modi > 3){
                        System.out.println("Numero fuera de rango\nVuelvalo a Ingresar: ");
                        modi = papoy.nextInt(); 
                    }
                    switch (modi) {
                        case 1:
                            System.out.println("--FireType");
                            
                            break;
                        case 2:
                            System.out.println("--WaterType");
                            break;
                        case 3:
                            System.out.println("--GrassType");
                            
                            break;
                        
                    }
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
       System.out.println("Watertype ---");
       for (int i = 0; i < lista.size(); i++) {
           Object pokeci = lista.get(i); 
           if (pokeci instanceof WaterType){
               System.out.println(pokeci.toString());
           }
       }
       System.out.println("Grasstype ---");
       for (int i = 0; i < lista.size(); i++) {
           Object pokeci = lista.get(i); 
           if (pokeci instanceof GrassType){
               System.out.println(pokeci.toString());
           }
       }
   }
   
   public static boolean existe(ArrayList<Integer> lista, int num){
       for (int i = 0; i < lista.size(); i++) {
           if (lista.get(i) == num){
               return true; 
           }
       }
       return false; // si el numero de eficiencia es 2 tien probabilidad de 2 /3 que pase y si es 1 seria 1/3
   }
   
   public static int elegirPokemon(ArrayList<Pokemon> pokes){
       int randi = ran.nextInt(0, pokes.size()-1); 
       Pokemon poke = pokemones.get(randi); 
       while (poke.isEstado_atrapado() == true){
            randi = ran.nextInt(0, pokes.size()-1); 
            poke = pokemones.get(randi); 
       }
       return randi;    
   }
   
   public static ArrayList<Integer>  imprimirModifire(ArrayList<Pokemon> lista){
       ArrayList<Integer> indice = new ArrayList(); 
       for (int i = 0; i < lista.size(); i++) {
           Object poke = lista.get(i); 
           if (poke instanceof FireType) {
               FireType poki = (FireType)poke; 
               if (poki.isEstado_atrapado() == true){
                   System.out.println(i+". "+poki.toString());
                   indice.add(i); 
               }
           }
       }
       return indice; 
   
   }
   public static ArrayList<Integer>  imprimirModiwater(ArrayList<Pokemon> lista){
       ArrayList<Integer> indice = new ArrayList(); 
       for (int i = 0; i < lista.size(); i++) {
           Object poke = lista.get(i); 
           if (poke instanceof WaterType) {
               WaterType poki = (WaterType)poke; 
               if (poki.isEstado_atrapado() == true){
                   System.out.println(i+". "+poki.toString());
                    indice.add(i); 
               }
           }
       }
       return indice; 
   
   }
   public static ArrayList<Integer> imprimirModiGrass(ArrayList<Pokemon> lista){
       ArrayList<Integer> indice = new ArrayList(); 
       for (int i = 0; i < lista.size(); i++) {
           Object poke = lista.get(i); 
           if (poke instanceof GrassType) {
               GrassType poki = (GrassType)poke; 
               if (poki.isEstado_atrapado() == true){
                   System.out.println(i+". "+poki.toString());
                   indice.add(i); 
               }
           }
       }
       return indice;
   
   }
}
