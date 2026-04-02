package ModeleTest1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
   Versiune1 prototip1 = new Versiune1("1", true);
   Versiune2 prototip2 = new Versiune2("2", 19);
   Versiune3 prototip3 = new Versiune3("3", false);

   AutonomousDriving clona1 = (Versiune1) prototip1.clone();
   AutonomousDriving clona2 = (Versiune2) prototip2.clone();

   prototip1.applyRule(7, "munte");
   clona1.adDecisionRule("evita turturi");
   clona1.applyRule(12, "polul nord");



    }
}
