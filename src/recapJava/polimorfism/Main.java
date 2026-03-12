package recapJava.polimorfism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<IAnimal> animale = new ArrayList<>();
        animale.add(new Caine("Labrador", false));
        animale.add(new Pisica("alba"));
        animale.add(new Vaca(19.8));

        //asta e dynamic dispatch: Java decide la runtime ce metoda sa apeleze
        for (IAnimal a : animale){
            System.out.println(a.nume() + " face "+a.sunet());
        }
    }
}
