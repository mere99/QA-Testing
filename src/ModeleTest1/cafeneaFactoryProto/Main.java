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


    }

}
