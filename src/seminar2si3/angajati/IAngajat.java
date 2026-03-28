package seminar2si3.angajati;

public interface IAngajat {
    double calculSalariu();

    String getNume();

    // implementare implicita:
    default String getCor(){
        return null;
    }

    String getCOR();
}
