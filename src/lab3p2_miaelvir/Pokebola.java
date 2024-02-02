
package lab3p2_miaelvir;

public class Pokebola {
    
    String color; 
    int numSerie; 
    int eficiencia_a; // 1 al 3

    public Pokebola(String color, int numSerie, int eficiencia_a) {
        this.color = color;
        this.numSerie = numSerie;
        this.eficiencia_a = eficiencia_a;
    }

    public Pokebola() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getEficiencia_a() {
        return eficiencia_a;
    }

    public void setEficiencia_a(int eficiencia_a) {
        this.eficiencia_a = eficiencia_a;
    }
    
    
}
