package SimpleFactory;

public class Ser extends Skincare implements IProdusSkincare{


    public Ser(String ingredientActiv, boolean areSpf, boolean esteAntiAging) {
        super(ingredientActiv, areSpf, esteAntiAging);
    }

    @Override
    public void descrie() {
        if(esteAntiAging) {
            System.out.println("acest ser este antiaging");
        }
        else{System.out.println("acest ser NU este antiaging");}
    }
}
