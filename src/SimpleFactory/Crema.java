package SimpleFactory;

public class Crema extends Skincare implements IProdusSkincare{

    public Crema(String ingredientActiv, boolean areSpf, boolean esteAntiAging) {
        super(ingredientActiv, areSpf, esteAntiAging);
    }

    @Override
    public void descrie() {
        System.out.println("crema contine ingr activ: "+ingredientActiv + "si are spf: "+ areSpf);
    }


}
