package ModeleTest1.cafeneaFactoryProto;

public class Main {
    public static void main(String[] args) {
        Cafea b1 = (Cafea) FactoryBautura.createBautura(TipBautura.CAFEA, "latteMachiatto",240, 23);
        Ceai b2 = (Ceai)FactoryBautura.createBautura(TipBautura.CEAI, "earl grey", 210, 15);

        b1.setAreLapte(true);
        b2.setPlanta("citrus bergamia");

        CiocolataCalda b3 = (CiocolataCalda) FactoryBautura.createBautura(TipBautura.CIOCOLATA_CALDA, "babyChoco", 190, 14);
        b1.preparare();
        System.out.println(b1.getDetalii());
        System.out.println(b2.getDetalii());
        System.out.println(b3.getDetalii());


        BauturaPresetata sablon1 = new BauturaPresetata("Latte Caramel", 350, 18, "Ion");
        BauturaPresetata sablon2 = new BauturaPresetata("Ceai Citrus", 250, 12, "Maria");

        System.out.println("\n=== Sabloane initiale ===");
        System.out.println(sablon1.getDetalii());
        System.out.println(sablon2.getDetalii());
        System.out.println("\n=== Clone (ieftin) ===");
        BauturaPresetata comanda1 = (BauturaPresetata) sablon1.clone();
        BauturaPresetata comanda2 = (BauturaPresetata) sablon1.clone();

        // Modificari individuale
        comanda1.adaugaPersonalizare("extra caramel");
        comanda2.adaugaPersonalizare("fara frisca");

        System.out.println("\n=== Comenzi finale ===");
        System.out.println(comanda1.getDetalii());
        System.out.println(comanda2.getDetalii());

        // Sablon original neafectat
        System.out.println("\n=== Sablon original (nemodificat) ===");
        System.out.println(sablon1.getDetalii());


    }

}
