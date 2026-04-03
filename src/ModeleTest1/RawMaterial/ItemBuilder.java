package ModeleTest1.RawMaterial;

public class ItemBuilder {
   private final String modelName;
   private final String serialCode;

    //optionale
   private String batchLabel;
   private String packagingType;
   private String tipMaterial;

    //constr doar cu obligatorii

    public ItemBuilder(String modelName, String serialCode) {
        this.modelName = modelName;
        this.serialCode = serialCode;
    }
public ItemBuilder adBatch(String b){
        this.batchLabel=b;
        return this;
}
    public ItemBuilder adPackage(String p){
        this.packagingType=p;
        return this;
    }
    public ItemBuilder adTipMaterial(String t){
        this.tipMaterial=t;
        return this;
    }
    public ProductionItem build(){
        return new ProductionItem(modelName, serialCode, batchLabel, packagingType, tipMaterial);
    }

}
