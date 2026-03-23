package recapJava.kindergarden;

public class Copil {
    private String nume;
    private int varsta;
    private String grupaSangv;

    public Copil(String nume, int varsta, String grupaSangv) {
        this.nume = nume;
        this.varsta = varsta;
        this.grupaSangv = grupaSangv;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getGrupaSangv() {
        return grupaSangv;
    }
}
