package SimpleFactory;

public class Main {
    public static void main(String[] args) {
        IProdusSkincare p1 = SkincareFactory.creeazaProdus(TipProdus.CREMA, "acid hial", true, false);
        IProdusSkincare p2 = SkincareFactory.creeazaProdus(TipProdus.TONER, "retinol", false, true);
        IProdusSkincare p3 = SkincareFactory.creeazaProdus(TipProdus.SER, "colagen", true, true);

        p1.descrie();
        p2.descrie();
        p3.descrie();


    }
}
