package recapJava;

public class MainApp {
    public static void main(String[] args){
        Tigru t1 = new Tigru("billie");
        Tigru t2 = new Tigru("johnas");

        t1.executaAtac();
        t2.mananca();
        System.out.println(t1.nume);
    }
}
