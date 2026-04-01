package ModeleTest1;

public abstract class Bautura implements IBautura{
    protected String nume;
    protected double volum;
    protected double pret;
    protected boolean areTopping=false;

    public Bautura(String nume, double volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }


    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public void adaugaTopping() {
        System.out.println("se adauga topping...");
        this.areTopping=true;
    }
}
