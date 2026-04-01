package ModeleTest1;

import java.util.List;

public class MagazinBuilder {
    private final String denumire;
    private final double supraf;
    private final int nrIntrari;//standard e 1
    //optionale:
    private Podea podea = new Podea(TipPodea.STANDARD, 1.9);
    private List<String> materialeDecoratiuni= null;

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
        double x = supraf/100;
        if(nrIntrari<x+1){
            throw new IllegalArgumentException("NU este permis sa aveti <1 intrare / 100mp !!!");
        }

        int flag = 0;
        for(String m : materialeDecoratiuni){
            if(m.equalsIgnoreCase("sticla")){ flag =1; }
        }
        if(podea.getDuritate()<2 && flag == 1){
            throw new IllegalArgumentException("NU este permis sa aveti duritatea podelei < 2 daca aveti decoratiuni de STICLA !!");
        }

        return new Magazin(denumire, supraf, nrIntrari, podea, materialeDecoratiuni);
    }
}
