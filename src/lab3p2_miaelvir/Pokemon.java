
package lab3p2_miaelvir;


public class Pokemon {
    
    String nombre; 
    int entrada_pokedex;
    String naturaleza; //Timido, energetico, misterioso
    boolean estado_atrapado; 
    Pokebola pokeball; 

    public Pokemon(String nombre, int entrada_pokedex, String naturaleza, boolean estado_atrapado, Pokebola pokeball) {
        this.nombre = nombre;
        this.entrada_pokedex = entrada_pokedex;
        this.naturaleza = naturaleza;
        this.estado_atrapado = estado_atrapado;
        this.pokeball = pokeball;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEntrada_pokedex() {
        return entrada_pokedex;
    }

    public void setEntrada_pokedex(int entrada_pokedex) {
        this.entrada_pokedex = entrada_pokedex;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isEstado_atrapado() {
        return estado_atrapado;
    }

    public void setEstado_atrapado(boolean estado_atrapado) {
        this.estado_atrapado = estado_atrapado;
    }

    public Pokebola getPokeball() {
        return pokeball;
    }

    public void setPokeball(Pokebola pokeball) {
        this.pokeball = pokeball;
    }
    
    public static boolean naturalezaAdmitida(String natu){
        boolean si = false; 
            if (natu.equalsIgnoreCase("timido") ||
                    natu.equalsIgnoreCase("energetico") || natu.equalsIgnoreCase("misterioso")){
                si = true; 
            }
        return si; 
    }

    @Override
    public String toString() {
        return "Pokemon:" + " nombre:" + nombre + " || entrada_pokedex: " + entrada_pokedex + " ||  naturaleza: " + naturaleza + " || estado_atrapado: " + estado_atrapado + " || pokeball: " + pokeball;
    }
    
    
    
    
}
