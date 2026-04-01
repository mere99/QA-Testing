package ModeleTest1.sub2;

import java.util.HashSet;
import java.util.Set;

public class JucatorHandbal extends Jucator {
private static Set<String> MEDICAMENTE_HANDBAL = new HashSet<>(Set.of("PowerGrip", "JumpBoost", "Reflexion"));
private static Set<String> ANTRENAMENTE_HANDBAL = new HashSet<>(Set.of("forta brate", "sarituri", "aparare"));


    public JucatorHandbal() {
        super();
        this.antrenamente=new HashSet<>(ANTRENAMENTE_HANDBAL);
        this.medicamenteInterzise=new HashSet<>(MEDICAMENTE_HANDBAL);
    }

    public JucatorHandbal(Jucator j) {
        super(j);
    }

    @Override
    public IJucator clone() {
        return new JucatorHandbal(this);
    }
}
