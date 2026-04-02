package ModeleTest1;

public class FactoryAbstractModule {
    public static AbstractModule createModule(TipModul t, String name, String description, float price){
        switch (t){
            //avand in vedere ca avem si atribute specifice, trb sa le setam cu settes
            case EXTRA_BATTERY -> {return new ExtraBattery(name, description, price, 5);}
            case VEDERE_NOAPTE -> {return new VedereNoapte(name, description, price, false, 10);}
            case URMARIRE -> {return new UrmarireInteligenta(name, description, price, 25);}
            default -> {
                throw new IllegalStateException("NU exista acest tip de modul!");
            }
        }
    }
}
