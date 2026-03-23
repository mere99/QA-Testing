package recapJava.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Cream o lista specifica de ANTIBIOTICE
        List<Antibiotic> listaAntibiotice = new ArrayList<>();
        listaAntibiotice.add(new Antibiotic("Zinnat"));
        listaAntibiotice.add(new Antibiotic("Amoxi"));


        // 2. Cream o lista generala de MEDICAMENTE
        List<Medicament> listaGenerala = new ArrayList<>();
        listaGenerala.add(new Medicament("Paracetamol"));
        listaGenerala.add(new Medicament("spirulina"));

        TestGenerics.afiseazaStoc(listaGenerala);
        TestGenerics.afiseazaStoc(listaAntibiotice);
        System.out.println("=====testam metoda de adugare antibiotic======");
        TestGenerics.adaugaAntibiotic(listaGenerala, new Antibiotic("Y3"));
        System.out.println("am acutalizat lista de medicamente adaugand un antibiotic: ");
        TestGenerics.afiseazaStoc(listaGenerala);



    }
}
