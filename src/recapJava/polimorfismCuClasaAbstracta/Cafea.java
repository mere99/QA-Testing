package recapJava.polimorfismCuClasaAbstracta;

public class Cafea extends Bautura {
    private String tipBoabe;

    public Cafea(String nume, double pret, String tipBoabe) {
        super(nume, pret);
        this.tipBoabe=tipBoabe;
    }



    @Override
    public String ingredientPrincipal() {
        return "cofeina";
    }
}
