package recapJava.kindergarden;

import java.util.ArrayList;
import java.util.List;

public class Grupa<T>{
    private String numeGrupa;
    private List<T>  membri = new ArrayList<>();

    public Grupa(String numeGrupa, List<T> membri) {
        this.numeGrupa = numeGrupa;
        this.membri = membri;
    }

    public void adaugaMmebru(T membru){
        membri.add(membru);
    }

    public T getMembru(int index){
        return membri.get(index);
    }
    public String getNumeGrupa() {
        return numeGrupa;
    }

    public List<T> getMembri() {
        return membri;
    }

    public int numarMembri() {
        return membri.size();
    }

    @Override
    public String toString() {
        return "Grupa{" +
                "numeGrupa='" + numeGrupa + '\'' +
                ", membri=" + membri +
                '}';
    }
}
