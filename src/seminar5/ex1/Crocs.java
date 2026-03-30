package seminar5.ex1;

import java.util.ArrayList;
import java.util.List;

public class Crocs implements ICrocs {
private int marime;
private String culoare;
private String accesorii;
private List<Integer> dimensiuni;

//constructorul COSTISITOR care apeleaza API si e lent
    public Crocs(int marime) {
        this.marime = marime;
        this.culoare = "gri";
        this.accesorii = "-";
        this.dimensiuni = new ArrayList<>(APIDimensiuni.getInstance().getDimensiuni(marime));
    }

    //constr de copiere, e folosit doar de clone()
    private Crocs(Crocs crocs){
        this.marime=crocs.marime;
        this.dimensiuni= new ArrayList<>(crocs.dimensiuni);//deep copy
        this.culoare=crocs.culoare;
        this.accesorii=crocs.accesorii;
    }

    //constructorul gol
    private Crocs(){};

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setAccesorii(String accesorii) {
        this.accesorii = accesorii;
    }

    public void setDimensiuni(List<Integer> dimensiuni) {
        this.dimensiuni = dimensiuni;
    }

    @Override
    public String toString() {
        return "Crocs{" +
                "marime=" + marime +
                ", culoare='" + culoare + '\'' +
                ", accesorii='" + accesorii + '\'' +
                ", dimensiuni=" + dimensiuni +
                '}';
    }

    @Override
    public ICrocs clone() {
        //returnam un obiect nou prin deep copy plecand de la this
        Crocs clona = new Crocs(this);//aici nu apelam API
        return clona;
    }
}
