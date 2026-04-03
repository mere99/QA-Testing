package ModeleTest1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ProductionItem p1 = new ProductionItem("N1", "123", "LABEL1", "ROZ");
        ProductionItem clona = (ProductionItem) p1.clone();
        clona.setPackagingType("ALB");
        clona.displayInfo();
        System.out.println(clona);
        System.out.println(p1);

    }
}
