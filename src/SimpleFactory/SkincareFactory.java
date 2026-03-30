package SimpleFactory;

public class SkincareFactory {
    public static IProdusSkincare creeazaProdus(TipProdus tip, String ingred, boolean areSpf, boolean eAntiAging){
        switch(tip){
            case CREMA: return new Crema(ingred, areSpf, eAntiAging);
            case SER: return new Ser(ingred, areSpf, eAntiAging);
            case TONER: return new Toner(ingred, areSpf, eAntiAging);
            default: throw new IllegalArgumentException("produs necunoscut "+tip);
        }
    }
}
