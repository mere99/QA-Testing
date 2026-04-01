package ModeleTest1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Jucator implements IJucator {
    protected String nume;
    protected int varsta;
    private TipJucator tip;

    // SET PARTAJAT per tip de jucator (static in subclase)
    // fiecare jucator are propriile antrenamente (pot fi modificate individual)
    protected Set<String> antrenamente;

    protected Set<String> medicamenteInterzise;

//constructor costisitor!!
public Jucator() {
    System.out.println("Se incarca date costisitoare de la server/DB...");
    this.antrenamente = new HashSet<>();
    this.medicamenteInterzise = new HashSet<>();
}

    // Constructor pentru clonare
    public Jucator(Jucator j) {
        this.nume = j.nume;
        this.varsta = j.varsta;
        this.tip = j.tip;
        //partajam lista de medicamente (shallow copy)
        // daca unul adauga un medicament, toti il vad
        this.medicamenteInterzise = j.medicamenteInterzise;

        //deep copy, NU e partajata intre jucatori
        this.antrenamente = new HashSet<>(j.antrenamente);
    }


    @Override
    public void adAntrenament(String a) {
        antrenamente.add(a);
    }

    @Override
    public void adMedicamentInterzis(String m) {
        medicamenteInterzise.add(m);
    }
    @Override
    public void efectuareAntrenamente() {
        System.out.println("JUCATORUL "+ nume + " efectueaza: "+antrenamente);
    }

    @Override
    public void testareDoping() {
        System.out.println("JUCATORUL "+ nume + " a fost testat ANTI-DOPING. "
                +" LISTA MEDICAMNETE INTERZISE ESTE: "+medicamenteInterzise);

    }

    @Override
    public void setNume(String nume) { this.nume = nume; }
    @Override
    public void setVarsta(int varsta) { this.varsta = varsta; }
    @Override
    public abstract IJucator clone();

}
