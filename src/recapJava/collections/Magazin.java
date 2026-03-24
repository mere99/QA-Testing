package recapJava.collections;


import java.util.*;

public class Magazin {

    // LIST - produsele in ordinea in care au fost adaugate, duplicatele permise
    private List<Produs> stoc = new ArrayList<>();

    // SET - categoriile unice din magazin, fara duplicate
    private Set<String> categorii = new HashSet<>();

    // MAP - cauti rapid un produs dupa nume
    private Map<String, Produs> catalog = new HashMap<>();

    // MAP sortat - acelasi catalog, dar afisat alfabetic dupa nume
    private Map<String, Produs> catalogSortat = new TreeMap<>();

    public void adaugaProdus(Produs p) {
        stoc.add(p);                      // adaugat in lista
        categorii.add(p.getCategorie());  // daca categoria exista deja, ignorata
        catalog.put(p.getNume(), p);      // adaugat in HashMap
        catalogSortat.put(p.getNume(), p); // adaugat in TreeMap
    }

    public void afiseazaStoc() {
        System.out.println("=== Stoc (ordinea adaugarii) ===");
        for (Produs p : stoc) {
            System.out.println("  " + p);
        }
    }

    public void afiseazaCategorii() {
        System.out.println("=== Categorii unice ===");
        for (String cat : categorii) {
            System.out.println("  " + cat);
        }
    }

    public void afiseazaCatalogSortat() {
        System.out.println("=== Catalog sortat alfabetic ===");
        for (Map.Entry<String, Produs> intrare : catalogSortat.entrySet()) {
            System.out.println("  " + intrare.getValue());
        }
    }

    public Produs cautaDupaNume(String nume) {
        return catalog.get(nume); // O(1), direct
    }

    public void afiseazaProdusedinCategorie(String categorie) {
        System.out.println("=== Produse din categoria: " + categorie + " ===");
        for (Produs p : stoc) {
            if (p.getCategorie().equals(categorie)) {
                System.out.println("  " + p);
            }
        }
    }
}