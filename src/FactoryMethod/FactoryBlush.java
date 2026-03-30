package FactoryMethod;

public class FactoryBlush implements IFactoryMakeup{
    @Override
    public IMakeup createMakeup() {
        return new Blush();
    }
}
