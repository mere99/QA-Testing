package ModeleTest1.RawMaterial;

public class ProductionItem implements IProductionItem {
   private String modelName;
   private String serialCode;
   private String batchLabel;
   private String packagingType;
   private String tipMaterial;



    public ProductionItem(String modelName, String serialCode, String batchLabel, String packagingType, String tipMaterial)  {
        this.modelName = modelName;
        this.serialCode = serialCode;
        this.batchLabel = batchLabel;
        this.packagingType = packagingType;
        this.tipMaterial=tipMaterial;
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
    public String getMaterialType() {
        return this.tipMaterial;
    }

    @Override
    public String getBatchLabel() {
        return this.batchLabel;
    }

    @Override
    public String getPackagingType() {
        return this.packagingType;
    }


    @Override
    public String toString() {
        return "ProductionItem{" +
                "modelName='" + modelName + '\'' +
                ", serialCode='" + serialCode + '\'' +
                ", batchLabel='" + batchLabel + '\'' +
                ", packagingType='" + packagingType + '\'' +
                ", tipMaterial='" + tipMaterial + '\'' +
                '}';
    }

    @Override
    public void displayInfo() {
      this.toString();
    }
}
