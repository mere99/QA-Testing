package Builder.cupcake;

import seminar2si3.taxare.ITaxare;
import seminar2si3.taxare.TaxareNormala;
import seminar2si3.taxare.TaxarePreferentiala;

import java.util.HashMap;
import java.util.Map;

public class Topping {
    private TipToppings tip; // fiecare topping stie ce tip este
    private static Map<TipToppings, Integer> mapa;

    public Topping(TipToppings tip) {
        this.tip = tip;
    }

    static{
        mapa = new HashMap<TipToppings, Integer>();
        mapa.put(TipToppings.CIOCOLATA, 75);
        mapa.put(TipToppings.FRUCTE, 40);
        mapa.put(TipToppings.NUCI, 55);
        mapa.put(TipToppings.OREO, 83);
        mapa.put(TipToppings.SPRINKLES, 90);
    }
    public int getCalories(){
        return mapa.get(tip);
    }

}
