package recapJava.polimorfismCuInterfata;

import java.util.ArrayList;
import java.util.List;
/**
 * Polimorfism inseamna ca acelasi apel de metoda se comporta diferit in functie de obiectul real din spate.
 * Scrii a.sunet() si nu stii si nu te intereseaza daca a e Caine, Pisica sau Vaca. Fiecare raspunde altfel.
 */
/**
 * La compilare, Java stie doar ca a este de tip Animal. Nu stie ca e Caine. Abia cand programul ruleaza,
 * Java se uita la tipul real al obiectului si alege metoda corecta. Asta e dynamic dispatch.
 */

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
