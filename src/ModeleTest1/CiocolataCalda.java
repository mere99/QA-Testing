package ModeleTest1;

public class CiocolataCalda extends Bautura{

    public CiocolataCalda(String nume, double volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("se prepara ciocolata calda "+nume+"....");

    }

    @Override
    public String toString() {
        return "CiocolataCalda{" +
                "nume='" + nume + '\'' +
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
