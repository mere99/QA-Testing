package recapJava.polimorfismCuClasaAbstracta;

public class Cocktail extends Bautura {
    private boolean contineAlcool;

    public Cocktail(String nume, double pret, boolean contineAlcool) {
        super(nume, pret);
        this.contineAlcool = contineAlcool;
    }

    @Override
    public String ingredientPrincipal() {
        return "suc";
    }
}
