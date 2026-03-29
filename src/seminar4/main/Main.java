package seminar4.main;

import seminar4.implementare.Masa;
import seminar4.implementare.Ospatar;
import seminar4.implementare.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant r = Restaurant.getInstance();
        r.adMasa(new Masa("001", true));
        r.adMasa(new Masa("002", true));
        r.adMasa(new Masa("003", true));
        r.adMasa(new Masa("004", true));

        Ospatar o1 = new Ospatar("daniel");
        Ospatar o2 = new Ospatar("nina");

        o1.preluareClient("001");
        o2.afisareMese();
        o2.preluareClient("002");
        // incearca sa ocupe masa 001 din nou si trateaza exceptia
        try {
            r.ocupaMasa("001");
        } catch (RuntimeException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
