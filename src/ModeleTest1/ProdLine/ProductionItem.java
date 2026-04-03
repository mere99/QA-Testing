package ModeleTest1.ProdLine;

public class ProductionItem implements IProductionItem{
    String modelName;
    String serialCode;
    String batchLabel;
    String packagingType;

    //copia trb sa poata fi personalizata -> setters
    //constr lentr


    public ProductionItem(String modelName, String serialCode, String batchLabel, String packagingType) throws InterruptedException {
        System.out.println("Start creating prod item...");
        Thread.sleep(1000);
        this.modelName = modelName;
        this.serialCode = serialCode;
        this.batchLabel = batchLabel;
        this.packagingType = packagingType;
    }

    public ProductionItem(ProductionItem p){
        this.modelName=p.modelName;
        this.serialCode=p.serialCode;
        this.batchLabel=p.batchLabel;
        this.packagingType=p.packagingType;
    }
    @Override
    public IProductionItem clone() {
        return new ProductionItem(this);
    }

    @Override
    public String getModelName() {
        return this.modelName;
    }

    @Override
    public String getSerialCode() {
        return this.serialCode;
    }

    @Override
    public String getBatchLabel() {
        return this.batchLabel;
    }

    @Override
    public String getPackagingType() {
        return this.packagingType;
    }

    //personalizare ulterioara
    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    @Override
    public String toString() {
        return "ProductionItem{" +
                "modelName='" + modelName + '\'' +
                ", serialCode='" + serialCode + '\'' +
                ", batchLabel='" + batchLabel + '\'' +
                ", packagingType='" + packagingType + '\'' +
                '}';
    }

    @Override
    public void displayInfo() {
      this.toString();
    }
}
