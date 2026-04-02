package ModeleTest1.Drone;

import java.util.Objects;

public class DroneBuilder {
    //obligatorii
    private final String model;
    private final String softwareVersion;

    //optionale
    private float maxSpeed;
    private AbstractModule extraBattery;

    //constr doar cu cele obligatorii
    public DroneBuilder(String model, String softwareVersion) {
        this.model = model;
        this.softwareVersion = softwareVersion;
    }
public DroneBuilder adMaxSpeed(float maxSpeed){
        this.maxSpeed=maxSpeed;
        return this;
}

public DroneBuilder adAbstractModuleBattery(){
        this.extraBattery=new ExtraBattery("EXTRA_BATTERY", "descr1", 100, 30);
        return this;
}

public Drone build(){
        //restrictii
    if (Objects.equals(this.model, String.valueOf(TipModel.DEFAULT)) && this.maxSpeed>30) {
        throw new IllegalArgumentException("NU poti avea modelul DEAFULT de drona iar viteza sa depaseasca 30km/h!");
    }
    if(Objects.equals(this.model, String.valueOf(TipModel.PREMIUM)) && Objects.equals(this.softwareVersion, "1")){
        throw new IllegalStateException("TREBUIE sa va actualizati software-ul !");
    }
    return new Drone(model, softwareVersion, maxSpeed, extraBattery);
}
}
