package recapJava.collections;

public class Produs {
    private String nume;
    private double pret;
    private String categorie; // ex: "skincare", "makeup", "haircare"

    public Produs(String nume, double pret, String categorie) {
        if (nume == null || nume.isBlank()) throw new IllegalArgumentException("Numele nu poate fi gol");
        if (pret < 0) throw new IllegalArgumentException("Pretul nu poate fi negativ");
        this.nume = nume;
        this.pret = pret;
        this.categorie = categorie;
    }

    public String getNume() { return nume; }
    public double getPret() { return pret; }
    public String getCategorie() { return categorie; }

    @Override
    public String toString() {
        return nume + " (" + categorie + ") - " + pret + " lei";
    }
}