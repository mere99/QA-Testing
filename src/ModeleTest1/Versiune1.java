package ModeleTest1;

import java.util.ArrayList;
import java.util.List;

public class Versiune1 extends AutonomousDriving{
    private boolean evitareObstacole;


    //CONSTR LENT
    public Versiune1(String version, boolean evitareObstacole) throws InterruptedException {
        super(version);
        this.evitareObstacole=evitareObstacole;
        //initializam decision rules, dar putem modifica lista dupa
        this.decisionRules = new ArrayList<>(List.of(
                "Detecteaza obstacol in fata — opreste imediat",
                "Distanta fata de sol < 2m — urca automat"
        ));
    }

    //constr de copiere pt clone()
    public Versiune1(Versiune1 v) throws InterruptedException {
        super(v);
        this.evitareObstacole=v.evitareObstacole;
    }



    @Override
    void applyRule(int index, String context) {
        System.out.println("modulul AI versiunea 2 aplica regula....");
        if(index<10 || this.evitareObstacole==false){
            System.out.println("ai grija la context pt ca poate fi periculos pt drona ta: "+context);
        }
       System.out.println("==deciziile de care s-au tinut cont===="+ decisionRules);
    }

    @Override
    public IAutonomousDriving clone() {
        try {
            return new Versiune1(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
