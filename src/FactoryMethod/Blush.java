package FactoryMethod;

public class Blush implements IMakeup{
    private int intensitate;

    public Blush(int intensitate) {
        this.intensitate = intensitate;
    }

    @Override
    public void aplica() {
        System.out.println("se aplica blush-ul..");
    }
}
