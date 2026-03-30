package SimpleFactory;

public abstract class Skincare {
    protected String ingredientActiv;
    protected boolean areSpf;
    protected boolean esteAntiAging;

    public Skincare(String ingredientActiv, boolean areSpf, boolean esteAntiAging) {
        this.ingredientActiv = ingredientActiv;
        this.areSpf = areSpf;
        this.esteAntiAging = esteAntiAging;
    }
}
