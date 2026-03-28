package seminar2si3.angajati;

import seminar2si3.taxare.FactoryTaxare;
import seminar2si3.taxare.ITaxare;

public class Manager extends Angajat {
    private int nrProiecte;
    static final int NR_PROIECTE = 100;
    static final int TARIF_PER_PROIECT = 500;

    public Manager(String nume, double salariuBaza, String COR, int nrProiecte) {
        super(nume, salariuBaza, COR);
        if(nrProiecte > NR_PROIECTE){
            throw new IllegalArgumentException("nr prea mare de proiecte!");
        }
        this.nrProiecte = nrProiecte;
    }


    @Override
    public double calculSalariu() {
        double salariuBrut = this.getSalariuBaza() + this.nrProiecte * TARIF_PER_PROIECT;
        ITaxare tipTaxare = FactoryTaxare.getTaxareDupaCOR(this.getCOR());
        double salariuNet = tipTaxare.getSalariuNetDinBrut(salariuBrut);
        return salariuNet;
    }


}
