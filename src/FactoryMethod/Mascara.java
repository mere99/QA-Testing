package FactoryMethod;

public class Mascara implements IMakeup{
    private boolean isWaterproof;

    public Mascara(boolean isWaterproof) {
        this.isWaterproof = isWaterproof;
    }

    @Override
    public void aplica() {
        System.out.println("se aplica mascara "+ (isWaterproof ? " rezistentă la apă" : ""));
    }
}
