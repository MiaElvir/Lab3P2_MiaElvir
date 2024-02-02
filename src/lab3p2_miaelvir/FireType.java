
package lab3p2_miaelvir;


public class FireType extends Pokemon{
    
    
    int poten_llamas; 

    public FireType(int poten_llamas, String nombre, int entrada_pokedex, String naturaleza, boolean estado_atrapado, Pokebola pokeball) {
        super(nombre, entrada_pokedex, naturaleza, estado_atrapado, pokeball);
        this.poten_llamas = poten_llamas;
    }

    public int getPoten_llamas() {
        return poten_llamas;
    }

    public void setPoten_llamas(int poten_llamas) {
        this.poten_llamas = poten_llamas;
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
    
    
    

   
    
    
    
}
