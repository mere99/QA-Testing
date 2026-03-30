package FactoryMethod;

public class FactoryLipstick extends FactoryMakeup{
    private String nuanta;

    public FactoryLipstick(String nuanta) {
        this.nuanta = nuanta;
    }

    @Override
    public IMakeup createMakeup() {
        return new Lipstick(nuanta);
    }
}
