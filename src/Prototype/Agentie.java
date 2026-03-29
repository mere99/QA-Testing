package Prototype;

import java.util.List;

public class Agentie {
    public static void main(String[] args) {
        List<String> clienti = List.of("ioana", "nini", "thomas", "francois");

        //CREAM UN SINGUR OBIECT COSTISITOR O SINGURA DATA!
        IListaOferte prototip = new ListaOferte();
        System.out.println();

        //fiecare client primeste clona
        for(String c: clienti){
            IListaOferte l = prototip.clone();
            System.out.println("trimis catre clientul " + c +": "+l.getOferte());
        }
    }
}
