package SimpleFactory;

public class Toner extends Skincare implements IProdusSkincare{

    public Toner(String ingredientActiv, boolean areSpf, boolean esteAntiAging) {
        super(ingredientActiv, areSpf, esteAntiAging);
    }

    @Override
    public void descrie() {
        System.out.println("toner-ul acesta e iluminator");
    }


}
