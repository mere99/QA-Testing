package ModeleTest1.cafeneaFactoryProto;

public class Ceai extends Bautura {
    private String planta;

    public Ceai(String nume, double volum, double pret, String planta) {
        super(nume, volum, pret);
        this.planta=planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    @Override
    public void preparare() {
       System.out.println("se prepara ceaiul "+nume+"....");
    }

    @Override
    public String toString() {
        return "Ceai{" +
                "planta='" + planta + '\'' +
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
