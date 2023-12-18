public class PruebaRotuladores {

    public static void main(String[] args) {

        Rotuladores misRotuladores = new Rotuladores();

        misRotuladores.addRotulador(new Rotulador("Staedler", "Azul",193));
        misRotuladores.addRotulador(new Rotulador("Bic", "Azul",113));
        misRotuladores.addRotulador(new Rotulador("Alpino", "Rojo",33));

        System.out.println(misRotuladores);

        misRotuladores.addRotulador(new Rotulador("Staedler", "Verde",33));
        misRotuladores.addRotulador(new Rotulador("Staedler", "Negro",223));

        System.out.println(misRotuladores);
    }
}
