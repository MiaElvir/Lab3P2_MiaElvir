
package lab3p2_miaelvir;

public class WaterType extends Pokemon{
    
    boolean vida_posible;
    int rapidez; 

    public WaterType(boolean vida_posible, int rapidez, String nombre, int entrada_pokedex, String naturaleza, boolean estado_atrapado, Pokebola pokeball) {
        super(nombre, entrada_pokedex, naturaleza, estado_atrapado, pokeball);
        this.vida_posible = vida_posible;
        this.rapidez = rapidez;
    }

    public boolean isVida_posible() {
        return vida_posible;
    }

    public void setVida_posible(boolean vida_posible) {
        this.vida_posible = vida_posible;
    }

    public int getRapidez() {
        return rapidez;
    }

    public void setRapidez(int rapidez) {
        this.rapidez = rapidez;
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
