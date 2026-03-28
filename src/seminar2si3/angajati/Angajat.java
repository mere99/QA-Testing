package seminar2si3.angajati;

/*
* O clasă abstractă care implementează o interfață nu e obligată să implementeze toate metodele din interfață
*  — poate lăsa unele neimplementate, urmând ca subclasele concrete să le implementeze.
* */
public abstract class Angajat implements IAngajat {
    private String nume;
    private double salariuBaza;
    private String COR;

    public Angajat(String nume, double salariuBaza, String COR) {
        this.nume = nume;
        this.salariuBaza = salariuBaza;
        this.COR = COR;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getCOR() {
        return COR;
    }

    public double getSalariuBaza() {
        return salariuBaza;
    }

}
