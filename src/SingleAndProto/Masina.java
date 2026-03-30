package SingleAndProto;

import java.util.ArrayList;
import java.util.List;

public class Masina implements IMasina{
private String model;
private int autonomie;//valoarea luata din API lent
private int capacitBaterie;
private String culoare;
private List<String> optiuniSuplimentare;

//constructor lent care apel api
    public Masina(String model, int capacitBaterie){
        this.model=model;
        this.capacitBaterie=capacitBaterie;
        this.culoare="alb";
        this.optiuniSuplimentare=new ArrayList<>();
        this.autonomie = APICalculAutonomie.getInstance().getAutonomie(capacitBaterie);
    }

    //constr de copiere cu deep copy
    private Masina(Masina m){
        this.model = m.model;
        this.capacitBaterie=m.capacitBaterie;
        this.culoare=m.culoare;
        this.optiuniSuplimentare=new ArrayList<>(m.optiuniSuplimentare);
        this.autonomie=m.autonomie;
    }

    //constr gol
    private Masina(){}

    @Override
    public IMasina clone() {
        Masina copie = new Masina(this);
        return copie;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void adOptiune(String optiune){
        if(optiuniSuplimentare==null){
            optiuniSuplimentare=new ArrayList<>();
        }
        optiuniSuplimentare.add(optiune);
    }

    @Override
    public String toString() {
        return "Masina{" +
                "model='" + model + '\'' +
                ", autonomie=" + autonomie +
                ", capacitBaterie=" + capacitBaterie +
                ", culoare='" + culoare + '\'' +
                ", optiuniSuplimentare=" + optiuniSuplimentare +
                '}';
    }
}
