package ModeleTest1.RawMaterial;

public interface IProductionItem {
    String getModelName();
    String getSerialCode();
    String getMaterialType();
    String getBatchLabel();
    String getPackagingType();
    void displayInfo();
}
