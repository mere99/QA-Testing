package ModeleTest1.sub1;

public class Podea {
    private TipPodea tip;
    private double duritate;

    public Podea(TipPodea tip, double duritate) {
        this.tip = tip;
        this.duritate = duritate;
    }

    public TipPodea getTip() {
        return tip;
    }

    public double getDuritate() {
        return duritate;
    }

    public void setTip(TipPodea tip) {
        this.tip = tip;
    }

    public void setDuritate(double duritate) {
        this.duritate = duritate;
    }

    @Override
    public String toString() {
        return "Podea{" +
                "tip=" + tip +
                ", duritate=" + duritate +
                '}';
    }
}
