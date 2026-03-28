package seminar2si3.angajati;

import seminar2si3.calculator.CalculSalariuBazaLucrator;
import seminar2si3.calculator.ICalculSalariu;
import seminar2si3.taxare.FactoryTaxare;
import seminar2si3.taxare.ITaxare;

public class Lucrator extends Angajat {
private double coefRisc;
private static ICalculSalariu calculator = new CalculSalariuBazaLucrator();

    public Lucrator(String nume, double salariuBaza, String COR, double coefRisc) {
        super(nume, salariuBaza, COR);
        this.coefRisc= coefRisc;
    }

    @Override
    public double calculSalariu() {
        //calculez salariul brut cu ajut calculatorului
        double salariuBrut = calculator.calculSalariuBrut(this);
        //calculez net-ul cu logica din Taxare
        ITaxare tipTaxare = FactoryTaxare.getTaxareDupaCOR(this.getCOR());
        double salariuNet = tipTaxare.getSalariuNetDinBrut(salariuBrut);
        return salariuNet;

    }

    public double getCoefRisc() {
        return coefRisc;
    }
}
