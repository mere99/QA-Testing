package recapJava.polimorfism;

public class Caine implements IAnimal{
private String rasa;
private boolean esteAgresiv;

    public Caine(String rasa, boolean esteAgresiv) {
        this.rasa = rasa;
        this.esteAgresiv = esteAgresiv;
    }

    @Override
    public String sunet() {
        return esteAgresiv ? "HAM HAM!!!" : "Ham..";
    }

    @Override
    public String nume() {
        return "Caine "+rasa;
    }
}
