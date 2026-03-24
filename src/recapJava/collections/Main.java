package recapJava.collections;

public class Main {
    public static void main(String[] args) {

        Magazin magazin = new Magazin();

        magazin.adaugaProdus(new Produs("Retinol Serum", 89.99, "skincare"));
        magazin.adaugaProdus(new Produs("Vitamin C Serum", 74.50, "skincare"));
        magazin.adaugaProdus(new Produs("Mascara Volume", 45.00, "makeup"));
        magazin.adaugaProdus(new Produs("Foundation Matte", 120.00, "makeup"));
        magazin.adaugaProdus(new Produs("Hair Mask Keratin", 55.00, "haircare"));
        magazin.adaugaProdus(new Produs("Lip Gloss", 30.00, "makeup"));
        magazin.adaugaProdus(new Produs("Retinol Serum", 89.99, "skincare")); // duplicat in lista

        System.out.println();
        magazin.afiseazaStoc();         // ArrayList - apare si duplicatul

        System.out.println();
        magazin.afiseazaCategorii();    // HashSet - doar 3 categorii unice, fara duplicate

        System.out.println();
        magazin.afiseazaCatalogSortat(); // TreeMap - sortat alfabetic

        System.out.println();
        Produs gasit = magazin.cautaDupaNume("Mascara Volume"); // HashMap - cautare rapida
        System.out.println("Produs gasit: " + gasit);

        System.out.println();
        magazin.afiseazaProdusedinCategorie("skincare");
    }
}
