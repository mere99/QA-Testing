package ModeleTest1.Drone;

public class Main {
    public static void main(String[] args){
        Drone d1 = new DroneBuilder(String.valueOf(TipModel.DEFAULT), "1").build();
        Drone d2 = new DroneBuilder(String.valueOf(TipModel.DELIVERY) ,"3")
                .adMaxSpeed(40)
                .build();
        Drone d3 = new DroneBuilder(String.valueOf(TipModel.PREMIUM) ,"5")
                .adMaxSpeed(50)
                .adAbstractModuleBattery()
                .build();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        ExtraBattery e1 = (ExtraBattery) FactoryAbstractModule.createModule(TipModul.EXTRA_BATTERY, "baterie1", "descr2", 101);
        e1.setPayloadCapacity(90);
        System.out.println(e1);
        UrmarireInteligenta u1 = (UrmarireInteligenta) FactoryAbstractModule.createModule(TipModul.URMARIRE, "UX03", "NIGHT-owl", 450);
        u1.setMaxSpeed(60);
        System.out.println(u1);

    }
}
