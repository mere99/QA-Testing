package ModeleTest1.sub2;

public interface IJucator {
    IJucator clone();
    void setNume(String nume);
    void setVarsta(int varsta);
    void adMedicamentInterzis(String medicament);
    void adAntrenament(String antrenament);
    void testareDoping();
    void efectuareAntrenamente();
}
