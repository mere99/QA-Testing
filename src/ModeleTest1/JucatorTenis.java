package ModeleTest1;

import java.util.HashSet;
import java.util.Set;

public class JucatorTenis extends Jucator{

    private static Set<String> MEDICAMENTE_TENIS = new HashSet<>(Set.of("ServeX", "StaminaPlus"));
    private static Set<String> ANTRENAMENTE_TENIS = new HashSet<>(Set.of("forehand", "cardio", "coordonare"));


    public JucatorTenis() {
        super();
        this.antrenamente=new HashSet<>(ANTRENAMENTE_TENIS);
        this.medicamenteInterzise=new HashSet<>(MEDICAMENTE_TENIS);
    }

    public JucatorTenis(Jucator j) {
        super(j);
    }

    @Override
    public IJucator clone() {
        return new JucatorTenis(this);
    }
}
