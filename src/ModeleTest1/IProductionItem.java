package ModeleTest1;

public interface
IProductionItem {
    public IProductionItem clone();
    String getModelName();
    String getSerialCode();
    String getBatchLabel();
    String getPackagingType();
    void displayInfo();
}
