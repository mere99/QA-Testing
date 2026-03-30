package SingleAndProto;

import seminar5.ex1.APIDimensiuni;

import java.util.HashMap;
import java.util.Map;

//CLASA SINGLETON
public class APICalculAutonomie {
    private static APICalculAutonomie instance = new APICalculAutonomie();
    private APICalculAutonomie(){};
    public static APICalculAutonomie getInstance(){
        return instance;
    }
    private Map<Integer, Integer> mapa = null;

    //obtinem autonomia dand ca param capacit baterie
    public Integer getAutonomie(int capacitBaterie){
      if(capacitBaterie<0 || capacitBaterie >100){
          throw new IllegalArgumentException("capcit bateriei TREBUIE sa fie intre 0 si 100!");
      }
      int autonomie = mapa.get(capacitBaterie);
      //simulam asteptarea raspunsului de la API
      try{
          Thread.sleep(1000);
      }
      catch (InterruptedException e){
          Thread.currentThread().interrupt();
          throw new RuntimeException(e);
      }
      return autonomie;
    }

    //initializam mapa capacit-autonomie in main prin apelarea acestei metode o singura data
    public void init(){
        if(mapa != null){
            throw new RuntimeException("mapa a fost deja initializata!");
        }
        mapa = new HashMap<>();
        for(int capacit = 0;capacit<100;capacit++){
            int autonomie = capacit*5;
            mapa.put(capacit, autonomie);
        }
    }
}
