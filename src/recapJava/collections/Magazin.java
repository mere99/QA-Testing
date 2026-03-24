/**
 * HashMap este cea mai rapidă opțiune, oferind performanță constantă pentru inserare și căutare,
 * însă nu garantează nicio ordine a elementelor, acestea fiind stocate în „sertare” bazate pe codul
 * lor hash, ceea ce face ca la afișare ordinea să pară aleatorie.
 *
 * În schimb, LinkedHashMap păstrează o listă dublu înlănțuită peste tabela de hash, ceea ce îi permite
 * să rețină exact ordinea în care ai adăugat elementele (Insertion Order), fiind ideal pentru sisteme
 * de tip cache sau istorice unde succesiunea contează.
 *
 *TreeMap nu se bazează pe hashing, ci pe o structură de arbore roșu-negru care menține elementele
 *  sortate automat conform ordinii lor naturale sau a unui comparator custom, fiind mai lent decât
 *  variantele precedente din cauza efortului de reordonare la fiecare inserare, dar indispensabil
 *  atunci când ai nevoie de un catalog mereu ordonat alfabetic sau numeric.
 */


package recapJava.collections;

import java.util.*;

public class Magazin {
    //LIST va contine produsele in ordinea in care au fost adaugate, duplicate permise
    private List<Produs> stoc = new ArrayList<>();

    //SET va contine categoriile unice din magazin, fara duplicate
    private Set<String> categorii = new HashSet<>();

    //MAP va contine nume prod ca si key si produsul ca si value
    private Map<String, Produs> catalog = new HashMap<>();

    //MAP sortat - acelasi catalog , dar afisat alfabetic dupa nume
    private Map<String, Produs> catalogSortat = new TreeMap<>();

    public void adaugaProdus(Produs p){
        stoc.add(p);
        categorii.add(p.getCategorie());
        catalog.put(p.getNume(), p);
        catalogSortat.put(p.getNume(), p);
    }

    public void afiseazaStoc(){
        System.out.println("===stoc in ordinea adaugarii====");
        for(Produs p : stoc){
            System.out.println(" "+p);
        }
    }

    public void afiseazaCategorii(){
        System.out.println("====categorii unice=====");
        for(String c : categorii){
        System.out.println(" "+ c);
        }
    }

    public void afiseazaCatalog(){
        System.out.println("====catalog nesortat=====");
        catalog.forEach((nume, produs) -> System.out.println(nume + " -> " + produs));
    }

    public void afiseazaCatalogSortat(){
        System.out.println("====catalog sortat alfabetic=====");
        catalogSortat.forEach((nume, produs) -> System.out.println(nume + " -> " + produs));
    }

    public Produs cautaDupaNume(String nume){
        return catalog.get(nume);
    }

    public void afiseazaProdusedinCategorie(String categorie) {
        System.out.println("=== produse din categoria: " + categorie + " ===");
        for (Produs p : stoc) {
            if (p.getCategorie().equals(categorie)) {
                System.out.println("  " + p);
            }
        }
    }


}