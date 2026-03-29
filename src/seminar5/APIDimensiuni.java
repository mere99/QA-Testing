package seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class APIDimensiuni {
    private static APIDimensiuni instance = new APIDimensiuni();

    //mapa care contine legatura marime crocs-> dimensiuni(2)
    private Map<Integer, List<Integer>> standardDim = null;

    private APIDimensiuni(){};

    public static APIDimensiuni getInstance(){
        return instance;
    }

   //metoda de initializare a mapei
    public void init(){
        if(standardDim != null) {
            throw new RuntimeException("S-a initializat deja colectia de dimensiuni");
        }
        standardDim = new HashMap<>();
        for(int marime = 20; marime<=50;marime++){
            List<Integer> dimensiuni = new ArrayList<>();
            dimensiuni.add(marime-15);
            dimensiuni.add(marime/4);
            standardDim.put(marime, dimensiuni);
        }
    }

    //metoda care imi da dimensiunile daca eu ii dau marimea
    public List<Integer> getDimensiuni(int marime){
        if(marime<20 || marime >50){
            throw new IllegalArgumentException("Marime invalida. Marimea trb sa fie >=20 si <=50");
        }
        List<Integer> dim = new ArrayList<>(standardDim.get(marime));
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        return dim;
    }

}
