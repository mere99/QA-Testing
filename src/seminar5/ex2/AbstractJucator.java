package seminar5.ex2;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractJucator implements Cloneable {
    protected String nume;
    protected List<String> listaMedicamente;
    protected List<Exercitiu> antrenament;

    @Override
    public AbstractJucator clone() {
        try {
            AbstractJucator copie = (AbstractJucator) super.clone();
            //deep copy pt liste:
            copie.listaMedicamente = new ArrayList<>(this.listaMedicamente);
            copie.antrenament=new ArrayList<>();
            for(Exercitiu e : this.antrenament){
                copie.antrenament.add(new Exercitiu(e.getDenumire(), e.getNrRepetitii()));
            }
            return copie;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "AbstractJucator{" +
                "nume='" + nume + '\'' +
                ", listaMedicamente=" + listaMedicamente +
                ", antrenament=" + antrenament +
                '}';
    }
}
