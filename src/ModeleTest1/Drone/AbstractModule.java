package ModeleTest1.Drone;

public abstract class AbstractModule {
    protected String name;
    protected String description;
    protected float price;

    public AbstractModule(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
