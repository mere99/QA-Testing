package seminar4.implementare;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private String denumire;
    private Map<String, Masa> mapa;
    private static Restaurant instance = new Restaurant("italianFood");

    private Restaurant(String denumire) {
        this.denumire = denumire;
        mapa = new HashMap<>();
    }

    public static Restaurant getInstance(){
        return instance;
    }

    public void adMasa(Masa m){
        if(m == null){
            throw new RuntimeException();
        }
        mapa.put(m.getId(), m);
    }

    public void ocupaMasa(String id){
        if(mapa.get(id)==null){
            throw new RuntimeException("masa nu exista");
        }
        if(!mapa.get(id).iseDisp()){
            throw new RuntimeException("masa e deja ocupata");
        }
        mapa.get(id).seteDisp(false);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "denumire='" + denumire + '\'' +
                ", mapa=" + mapa +
                '}';
    }

    public void afisareMese(){
        System.out.println(this);
    }
}
