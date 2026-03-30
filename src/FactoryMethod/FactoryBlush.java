package FactoryMethod;

public class FactoryBlush extends FactoryMakeup{
    private int intensitate;

    public FactoryBlush(int intensitate) {
        this.intensitate = intensitate;
    }

    @Override
    public IMakeup createMakeup() {
        return new Blush(intensitate);
    }
}
