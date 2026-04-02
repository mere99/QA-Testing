package ModeleTest1.Drone;

public class Drone {
    //obligatorii
    private String model;
    private String softwareVersion;

    //optionale
    private float maxSpeed;
    private AbstractModule extraBattery;

    public Drone(String model, String softwareVersion, float maxSpeed, AbstractModule extraBattery) {
        this.model = model;
        this.softwareVersion = softwareVersion;
        this.maxSpeed = maxSpeed;
        this.extraBattery = extraBattery;
    }

    @Override
    public String toString() {
        return "Drone{" +
                "model='" + model + '\'' +
                ", softwareVersion='" + softwareVersion + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", extraBattery=" + extraBattery +
                '}';
    }
}
