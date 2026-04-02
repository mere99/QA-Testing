package ModeleTest1.AutonomousDriving;

import java.util.ArrayList;
import java.util.List;

public class Versiune3 extends AutonomousDriving {
    private boolean invatareAutomata;

    //CONSTR LENT
    public Versiune3(String version, boolean invatareAutomata) throws InterruptedException {
        super(version);
        this.invatareAutomata=invatareAutomata;
        this.decisionRules = new ArrayList<>(List.of(
                "Pattern zbor anormal detectat — recalibrare automata",
                "Model nou invatat — actualizeaza regulile de zbor",
                "Conditii meteo nefavorabile — aplica model adaptiv"
        ));
    }

    //constr copiere
    public Versiune3(Versiune3 v) throws InterruptedException {
        super(v);
        this.invatareAutomata=v.invatareAutomata;
    }

    @Override
    void applyRule(int index, String context) {
        System.out.println("modulul AI versiunea 3 aplica regula....");
        if(index>5 && this.invatareAutomata==true){
            System.out.println("modulul AI e f performant!! iar contextul este "+ context);
        }else{
            System.out.println("mai lucreaza la imbunatatirea modulului!");
        }
        System.out.println("==deciziile de care s-au tinut cont===="+ decisionRules);


    }

    @Override
    public IAutonomousDriving clone() {
        try {
            return new Versiune3(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
