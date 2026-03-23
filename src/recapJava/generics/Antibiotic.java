package recapJava.generics;

public class Antibiotic extends Medicament{

    public Antibiotic(String nume) {
        super(nume);
    }
    public void instructiuniSpecifice(){
        System.out.println("se ia doar cu prescriptie!");
    }


}
