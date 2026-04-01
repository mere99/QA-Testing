package ModeleTest1.sub1;

import java.util.List;

public class Magazin {
    private String denumire;
    private double supraf;
    private int nrIntrari;
    private Podea podea;
    private List<String> materialeDecoratiuni;

    public Magazin(String denumire, double supraf, int nrIntrari, Podea podea, List<String> materialeDecoratiuni) {
        this.denumire = denumire;
        this.supraf = supraf;
        this.nrIntrari = nrIntrari;
        this.podea = podea;
        this.materialeDecoratiuni = materialeDecoratiuni;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", supraf=" + supraf +
                ", nrIntrari=" + nrIntrari +
                ", podea=" + podea +
                '}';
    }

    public double calculGradIncendiu(){
        double grad = 0;
        if(podea.getDuritate()<1){
            grad+=10;
        } else if (podea.getDuritate()>1 && podea.getDuritate()<7) {
            grad+=5;
        }
        else{
            grad+=1;
        }
        for(String material : materialeDecoratiuni){
            if(material.equalsIgnoreCase("carton")||material.equalsIgnoreCase("textil")){
                grad+=7;
            }
        }
        return grad;
    }
}
