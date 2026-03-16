package recapJava.polimorfismCuInterfata;

public class Pisica implements IAnimal{
    private String culoare;

    public Pisica(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String sunet() {
        return "Miau!";
    }

    @Override
    public String nume() {
        return "Pisica "+culoare;
    }
}
