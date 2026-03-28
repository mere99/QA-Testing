package seminar2si3.calculator;
import seminar2si3.angajati.IAngajat;
import seminar2si3.angajati.Lucrator;


public class CalculSalariuBazaLucrator implements ICalculSalariu {


    @Override
    public double calculSalariuBrut(IAngajat angajat) {
        Lucrator l = (Lucrator)angajat;
        double salariuBrut = l.getSalariuBaza() * (1 + l.getCoefRisc());
        return salariuBrut;
    }
}
