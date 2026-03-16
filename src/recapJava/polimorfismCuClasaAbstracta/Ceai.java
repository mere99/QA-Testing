package recapJava.polimorfismCuClasaAbstracta;

public class Ceai extends Bautura{
    private String aroma;
    private boolean miere;

    public Ceai(String nume, double pret, String aroma, boolean miere) {
        super(nume, pret);
        this.aroma=aroma;
        this.miere=miere;
    }
//poti suprascrie descriere() in subclase si sa adaugi detaliile proprii, folosind tot super:
    public String descriere() {
        String baza = super.descriere(); // "earl grey are pretul 7.0"
        return baza + ", aroma: " + aroma + (miere ? ", cu miere" : "");
    }
    @Override
    public String ingredientPrincipal() {
        return "frunze de ceai";
    }
}
