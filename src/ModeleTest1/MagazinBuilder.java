package ModeleTest1;

import java.util.ArrayList;
import java.util.List;

public class MagazinBuilder {
    private final String denumire;
    private final double supraf;
    private final int nrIntrari;//standard e 1
    //optionale:
    private Podea podea = new Podea(TipPodea.STANDARD, 1.9);
    private List<String> materialeDecoratiuni= new ArrayList<>();

    public MagazinBuilder(String denumire, double supraf, int nrIntrari) {
        this.denumire = denumire;
        this.supraf = supraf;
        this.nrIntrari = nrIntrari;
    }

    public MagazinBuilder adPodeaSpeciala(){
        podea.setTip(TipPodea.SPECIALA);
        podea.setDuritate(2.5);
        return this;
    }

    public MagazinBuilder setDuritatePodea(int duritate){
        podea.setDuritate(duritate);
        return this;
    }

    public MagazinBuilder adMaterialDecoratiune(String material){
        materialeDecoratiuni.add(material);
        return this;
    }

    public Magazin build(){
        if (nrIntrari * 100 < supraf) {
            throw new IllegalArgumentException(
                    "Numar insuficient de intrari! Pentru " + supraf +
                            " mp sunt necesare minim 1 intrare per 100mp."
            );
        }
        int flag = 0;
        if(materialeDecoratiuni!=null){
            for(String m : materialeDecoratiuni){
                if(m.equalsIgnoreCase("sticla")){ flag =1; }
            }
        }

        if(podea.getDuritate()<2 && flag == 1){
            throw new IllegalArgumentException("NU este permis sa aveti duritatea podelei < 2 daca aveti decoratiuni de STICLA !!");
        }

        return new Magazin(denumire, supraf, nrIntrari, podea, materialeDecoratiuni);
    }
}
