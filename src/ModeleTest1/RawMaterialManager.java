package ModeleTest1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RawMaterialManager implements IRawMaterialControl{
    //singleton
private static RawMaterialManager instance = new RawMaterialManager();
public static RawMaterialManager getInstance(){return instance;}
    private int stoc;
    private Map<String, List<String>> istoric;//codAng - operatie
    private RawMaterialManager(){
        this.stoc=0;
        this.istoric=new HashMap<>();
    }

    @Override
    public void addRawMaterial(String codAngajat, float quantity) throws Exception {
       stoc+=quantity;
        if (!istoric.containsKey(codAngajat)) {
            istoric.put(codAngajat, new ArrayList<>());
        }
        istoric.get(codAngajat).add("IN: " + quantity + " | stoc curent: " + stoc);
    }

    @Override
    public void consumeRawMaterial(String codAngajat, String productName, float quantity) throws Exception {
        if(stoc<quantity){throw new RuntimeException("stoc insuficient!");}
        stoc-=quantity;
        if (!istoric.containsKey(codAngajat)) {
            istoric.put(codAngajat, new ArrayList<>());
        }
        istoric.get(codAngajat).add("OUT: s-a consumat "+quantity+"din produsul "+productName);
    }

    @Override
    public float getAvailableStock() {
        return 0;
    }

    @Override
    public void displayHistory() {

    }
}
