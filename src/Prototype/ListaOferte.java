package Prototype;

import java.util.ArrayList;
import java.util.List;

//CONCRETE PROTOTYPE
public class ListaOferte implements IListaOferte{

    private List<String> oferte;
    //constructor COSTISITOR - simulam citirea din BD
    public ListaOferte() {
        System.out.println("[ListaOferte] se citeste din BD....");
        oferte = new ArrayList<>();
        oferte.add("of1: vacanta grecia 200 euro");
        oferte.add("of2: vacanta italia 230 euro");
    }

    //constructor PRIVATE folosit de clone()
    private ListaOferte(List<String> oferte) {
        this.oferte = new ArrayList<>(oferte);//deep copy
    }

    @Override
    public IListaOferte clone() {
        System.out.println("se cloneaza rapid [ListaOferte]..");
        return new ListaOferte(this.oferte);
    }

    @Override
    public List<String> getOferte() {
        return oferte;
    }
}
