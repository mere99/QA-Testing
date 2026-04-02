package ModeleTest1;

public class VedereNoapte extends AbstractModule{
    private boolean thermalSensitivity;
    private double maxRange;
    public VedereNoapte(String name, String description, float price, boolean thermalSensitivity, double maxRange) {
        super(name, description, price);
        this.thermalSensitivity=thermalSensitivity;
        this.maxRange=maxRange;
    }

    public void setThermalSensitivity(boolean thermalSensitivity) {
        this.thermalSensitivity = thermalSensitivity;
    }

    public void setMaxRange(double maxRange) {
        this.maxRange = maxRange;
    }

    @Override
    public String toString() {
        return "VedereNoapte{" +
                "thermalSensitivity=" + thermalSensitivity +
                ", maxRange=" + maxRange +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
