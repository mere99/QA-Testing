package recapJava.polimorfism;

public class Vaca implements IAnimal{
private double cantitateLapte;

    public Vaca(double cantitateLapte) {
        this.cantitateLapte = cantitateLapte;
    }

    @Override
    public String sunet() {
        return "Muuu";
    }

    @Override
    public String nume() {
        return "Sunt vacuta care produce" + cantitateLapte+"L de lapte";
    }
}
