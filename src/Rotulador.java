
public class Rotulador implements Comparable<Rotulador>{

    private String marca;
    private String color;
    private int peso;

    public Rotulador(String marca, String color, int peso){
        this.marca = marca;
        this.color = color;
        this.peso = peso;
    }


    @Override
    public int compareTo(Rotulador o) {
       return this.peso-o.peso;
    }

    @Override
    public String toString(){

        return String.format("Color: %s, peso: %d, %s\n", color,peso, marca);
    }
}
