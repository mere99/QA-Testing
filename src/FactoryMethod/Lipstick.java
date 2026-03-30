package FactoryMethod;

public class Lipstick implements IMakeup{
    private String nuanta;

    public Lipstick(String nuanta) {
        this.nuanta = nuanta;
    }

    @Override
    public void aplica() {
        System.out.println("se aplica lipstick nuanta "+nuanta);
    }
}
