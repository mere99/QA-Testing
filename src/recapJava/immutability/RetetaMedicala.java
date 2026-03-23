package recapJava.immutability;
//Immutability inseamna ca un obiect, dupa ce a fost creat, nu mai poate fi modificat niciodata
//ex: String e imutabil. Orice operatie pe el returneaza un obiect nou, nu il modifica pe cel existent
/*
Cele 5 Reguli pentru o clasă Imuabilă:
1)Clasa să fie final: Ca să nu poată fi moștenită (cineva ar putea face override la metode
și să strice imuabilitatea).

2)Câmpuri private și final: Să nu poată fi accesate direct și să poată fi setate o singură dată.

3)Fără Setteri: Nu oferi nicio metodă care să permită schimbarea stării.

4)Deep Copy în Constructor: Dacă ai câmpuri care sunt obiecte mutabile (ex: un ArrayList sau Date),
 nu salva referința primită, ci fă o copie a datelor.

5)Deep Copy la Getteri: Când returnezi un obiect mutabil, returnează o copie, nu obiectul original.
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class RetetaMedicala {
    private final String numePacient;
    private final List<String> medicamente;


    public RetetaMedicala(String numePacient, List<String> medicamentePrimite) {
        this.numePacient = numePacient;
        //facem deep copy listei!
        this.medicamente = new ArrayList<>(medicamentePrimite);
    }
//fara setteri, doar getteri
    public String getNumePacient() {
        return numePacient;
    }


   // Dacă am fi avut
    // public List<String> getMedicamente() { return this.medicamente; },
    //clasa NU ar mai fi fost imutabila pt ca
   // cineva ar putea face reteta.getMedicamente().add("Alt medicament") și
   // ar modifica lista internă a obiectului tău "imuabil"
    public List<String> getMedicamente() {
        //returnam o lista nemodificabila
        return Collections.unmodifiableList(medicamente);
    }

    @Override
    public String toString() {
        return "RetetaMedicala{" +
                "numePacient='" + numePacient + '\'' +
                ", medicamente=" + medicamente +
                '}';
    }

    /**
     * Contractul equals() și hashCode():
     * Dacă două obiecte sunt egale conform equals(), ele TREBUIE să aibă același hashCode()
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RetetaMedicala that)) return false;
        return Objects.equals(numePacient, that.numePacient) && Objects.equals(medicamente, that.medicamente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numePacient, medicamente);
    }
}














