package ModeleTest1;

import java.util.Set;

public interface IJucator {
    IJucator clone();
    void setNume(String nume);
    void setVarsta(int varsta);
    void adMedicamentInterzis(String medicament);
    void adAntrenament(String antrenament);
    void testareDoping();
    void efectuareAntrenamente();
}
