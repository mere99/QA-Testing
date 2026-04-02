package ModeleTest1;

public class ExtraBattery extends AbstractModule{
    private double payloadCapacity;

    public ExtraBattery(String name, String description, float price, double payloadCapacity) {
        super(name, description, price);
        this.payloadCapacity=payloadCapacity;
    }

    @Override
    public String toString() {
        return "ExtraBattery{" +
                "payloadCapacity=" + payloadCapacity +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }
}
