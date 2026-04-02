package ModeleTest1;

public class UrmarireInteligenta extends AbstractModule{
    private int maxSpeed;
    public UrmarireInteligenta(String name, String description, float price, int maxSpeed) {
        super(name, description, price);
        this.maxSpeed=maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "UrmarireInteligenta{" +
                "maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
