package recapJava.generics;

import java.util.List;

//PECS (Producer Extends, Consumer Super)
public class TestGenerics {
    //1: ? extends(producer/citire)
    //metoda va accepta List<Medicament> sau List<Antibiotic>
    //accepta Medicament si orice copil al lui
    public static void afiseazaStoc(List<? extends Medicament> lista){
        for(Medicament m : lista){
            System.out.println(m);
        }
       //atentie: NU pot sa fac lista.add(new Medicament("Nurofen"));
    }

    //2: ? super(consumer/scriere)
    //accepta List<Medicament> sau List<Antibiotic> sau List<Object>
    //accepta Antibiotic si orice parinte al lui
    public static void adaugaAntibiotic(List<? super Antibiotic> lista, Antibiotic deAdaugat){
        lista.add(deAdaugat);
        System.out.println("Am adaugat " + deAdaugat.nume + " in lista.");
    }

}
