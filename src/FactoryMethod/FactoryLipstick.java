package FactoryMethod;

public class FactoryLipstick implements IFactoryMakeup{
    @Override
    public IMakeup createMakeup() {
        return new Lipstick();
    }
}
