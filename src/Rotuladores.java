import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Rotuladores {
//Subido a git hub
    private ArrayList<Rotulador> rotuladores;

    public Rotuladores(){
        rotuladores = new ArrayList<>();
    }

    public void addRotulador(Rotulador r){

        rotuladores.add(r);

    }

    public void ordenaRotuladores(){
        Collections.sort(rotuladores);
    }

    @Override
    public String toString(){

        String salida = "Colección de rotuladores\n\n";
        for(Rotulador r:rotuladores)
            salida += r;
        return salida;

    }

}
