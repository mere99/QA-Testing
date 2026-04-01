package ModeleTest1.sub2;

import java.util.HashSet;
import java.util.Set;

public class JucatorFotbal extends Jucator {

private static Set<String> MEDICAMENTE_FOTBAL = new HashSet<>(Set.of("SprintexForte", "EnduroMax","FocusKick"));
private static Set<String> ANTRENAMENTE_FOTBAL = new HashSet<>(Set.of("HIIT", "sprint", "dribling"));

    public JucatorFotbal() {
        super();
        this.antrenamente=new HashSet<>(ANTRENAMENTE_FOTBAL);
        this.medicamenteInterzise=new HashSet<>(MEDICAMENTE_FOTBAL);
    }

    public JucatorFotbal(Jucator j) {
        super(j);
    }

    @Override
    public IJucator clone() {
        return new JucatorFotbal(this);
    }
}
