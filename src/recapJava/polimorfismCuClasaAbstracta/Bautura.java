package recapJava.polimorfismCuClasaAbstracta;

abstract class Bautura {
    private String nume;
    private double pret;

    public Bautura(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String descriere(){
        return nume + " are pretul " + pret;
    }

    public abstract String  ingredientPrincipal();
}

