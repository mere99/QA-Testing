package ModeleTest1.sub5;

public class Angajat implements AbstractAngajat {
private String nume;

    public Angajat(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return nume;
    }
}
