
package lab3p2_miaelvir;


public class GrassType extends Pokemon{
    
    String habitat; 
    int dom_plantas; //0 al 100

    public GrassType(String habitat, int dom_plantas, String nombre, int entrada_pokedex, String naturaleza, boolean estado_atrapado, Pokebola pokeball) {
        super(nombre, entrada_pokedex, naturaleza, estado_atrapado, pokeball);
        this.habitat = habitat;
        this.dom_plantas = dom_plantas;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDom_plantas() {
        return dom_plantas;
    }

    public void setDom_plantas(int dom_plantas) {
        this.dom_plantas = dom_plantas;
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
    
    public static boolean dominioAdmitido(int dominio){
        if (dominio >= 0 && dominio < 101){
            return true; 
        }
        return false; 
    }
    
    
}
