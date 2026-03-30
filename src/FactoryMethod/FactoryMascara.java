package FactoryMethod;

public class FactoryMascara extends FactoryMakeup{
    private boolean isWaterproof;

    public FactoryMascara(boolean isWaterproof) {
        this.isWaterproof = isWaterproof;
    }

    @Override
    public IMakeup createMakeup() {
        return new Mascara(isWaterproof);
    }
}
