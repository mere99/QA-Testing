package ModeleTest1;

public class Main {
    public static void main(String[] args) {

        //cream PROTOTIPURILE cu constructorul lent
        Jucator prototipFotbal = new JucatorFotbal();
        Jucator prototipTenis = new JucatorTenis();
        // 2. Înregistrăm jucători prin CLONARE (proces rapid)

        // Jucător 1 - Fotbal
        Jucator f1 = (Jucator) prototipFotbal.clone();
        f1.setNume("Popescu");
        f1.setVarsta(22);

        // Jucător 2 - Fotbal (Același tip)
        Jucator f2 = (Jucator) prototipFotbal.clone();
        f2.setNume("Ionescu");
        f2.setVarsta(25);

        // Jucător 3 - Tenis
        Jucator t1 = (Jucator) prototipTenis.clone();
        t1.setNume("Simona");
        t1.setVarsta(30);

        // 3. Simulare procese
        System.out.println("\n--- Stare Inițială ---");
        f1.testareDoping();
        f2.testareDoping();

        // 4. Modificare medicament interzis (Depistat de un jucător)
        System.out.println("\n--- Popescu depistează 'SubstantaX' ---");
        f1.adMedicamentInterzis("SubstantaX");

        // Verificăm dacă și Ionescu știe de ea (cerința: toți trebuie să cunoască)
        f2.testareDoping();

        // 5. Actualizare antrenamente personale
        System.out.println("\n--- Actualizare Antrenamente ---");
        f1.adAntrenament("Antrenament Special Portar");
        f1.efectuareAntrenamente();
        f2.efectuareAntrenamente(); // f2 rămâne cu cele standard



    }
}
