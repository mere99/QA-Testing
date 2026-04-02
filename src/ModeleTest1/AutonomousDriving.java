package ModeleTest1;

import java.util.List;

public abstract class AutonomousDriving implements IAutonomousDriving {
    protected String version;           // versiunea AI
    protected List<String> decisionRules; // regulile de decizie

    //constr lent:
    public AutonomousDriving(String version) throws InterruptedException {
        this.version = version;
        System.out.println("Start AI module...");
        Thread.sleep(5000); // costisitor!
        System.out.println("Init AI module...learning done!");

    }
    private AutonomousDriving(){};
    abstract void applyRule(int index, String context);

    public void adDecisionRule(String decision){
        decisionRules.add(decision);
    }

    @Override
    public IAutonomousDriving clone() {
        return null;
    }
}
