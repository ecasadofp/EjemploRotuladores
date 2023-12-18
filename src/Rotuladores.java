import java.util.TreeSet;

public class Rotuladores {
//Subido a git hub
    private TreeSet<Rotulador> rotuladores;

    public Rotuladores(){
        rotuladores = new TreeSet<>();
    }

    public void addRotulador(Rotulador r){

        rotuladores.add(r);

    }

    @Override
    public String toString(){

        String salida = "Colección de rotuladores\n\n";
        for(Rotulador r:rotuladores)
            salida += r;
        return salida;

    }

}
