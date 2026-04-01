package ModeleTest1;

public class Cafea extends Bautura{
    private boolean areLapte;


    public Cafea(String nume, double volum, double pret, boolean areLapte) {
        super(nume, volum, pret);
        this.areLapte=areLapte;
    }

    //in factory setez cafeaua default areLapte=false, dar cu setterul pot sa schimb
    public void setAreLapte(boolean areLapte) {
        this.areLapte = areLapte;
    }

    @Override
    public void preparare() {
        System.out.println("se prepara cafeau "+nume+"....");

    }

    @Override
    public String toString() {
        return "Cafea{" +
                "areLapte=" + areLapte +
                ", nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                ", areTopping=" + areTopping +
                '}';
    }

    @Override
    public String getDetalii() {
        return this.toString();
    }


}
