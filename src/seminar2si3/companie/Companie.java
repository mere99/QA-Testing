package seminar2si3.companie;

import seminar2si3.angajati.Angajat;

import java.util.ArrayList;
import java.util.List;

public class Companie {
    //folosim interfata List in loc de ArrayList pt a decupla clasa de o implementare specifia
    private List<Angajat> angajati;
    private String nume;

    public Companie(String nume) {
        this.nume = nume;
        this.angajati = new ArrayList<>();
    }

    public void adAngajat(Angajat a){
        if(a== null) {
            throw new NullPointerException("angajat can't be null");
        }
        angajati.add(a);
    }

    public double totalSalariuNet(){
        double total = 0;
        for(Angajat a : this.angajati){
            total += a.calculSalariu();
        }

        return total;
    }
}
