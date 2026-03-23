package recapJava.generics;

public class Medicament {
    String nume;

    public Medicament(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
