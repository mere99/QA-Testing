package FactoryMethod;

public class FactoryMascara implements IFactoryMakeup{
    @Override
    public IMakeup createMakeup() {
        return new Mascara();
    }
}
