package recapJava.kindergarden;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
       Map<String, Copil> registru = new HashMap<>();
       Copil c1= new Copil("paul", 4, "0");
       Copil c2 = new Copil("rosie", 5, "A2");
       Copil c3 =  new Copil("stefi", 3, "B1");
       registru.put("paul",c1 );
       registru.put("rosie", c2);
       registru.put("stefi",c3);
       Copil gasit = registru.get("rosie");
       System.out.println("Gasit: " + gasit.getNume() + ", grupa sanguina: " + gasit.getGrupaSangv());


        List<Copil> copii= new ArrayList<>();
        copii.add(c1);
        copii.add(c2);
        copii.add(c3);
       Grupa<Copil> grupaMica = new Grupa<>("grupaMica",copii );
        System.out.println("Numar membri: " + grupaMica.numarMembri());
        System.out.println("Primul copil: " + grupaMica.getMembru(0).getNume());

    }
}
