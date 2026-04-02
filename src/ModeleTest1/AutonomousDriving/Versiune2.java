package ModeleTest1.AutonomousDriving;

import java.util.ArrayList;
import java.util.List;

public class Versiune2 extends AutonomousDriving {
    private double vitezaZbor;


    //CONSTR LENT
    public Versiune2(String version, double vitezaZbor) throws InterruptedException {
        super(version);
        this.vitezaZbor=vitezaZbor;
        this.decisionRules = new ArrayList<>(List.of(
                "Viteza curenta depaseste limita — reduce viteza",
                "Semnal GPS slab — activeaza modul conservare",
                "Temperatura motor ridicata — reduce viteza cu 30%"
        ));

    }

    //constr de copiere:
    public Versiune2(Versiune2 v) throws InterruptedException {
        super(v);
        this.vitezaZbor=v.vitezaZbor;
    }
    @Override
    void applyRule(int index, String context) {
        System.out.println("modulul AI versiunea 2 aplica regula....");
        if(index<10 && this.vitezaZbor<20){
            System.out.println("schimba contextul pt a imbunatati modului: "+context);
        }
        System.out.println("==deciziile de care s-au tinut cont===="+ decisionRules);

    }

    @Override
    public IAutonomousDriving clone() {
        try {
            return new Versiune2(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
