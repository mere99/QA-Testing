package ModeleTest1.cafeneaFactoryProto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BauturaPresetata extends Bautura implements IBauturaPresetata {
private String numeClient;
    private Map<String, List<String>> personalizari;

//constr costisitor
    public BauturaPresetata(String nume, double volum, double pret, String numeClient, List<String>personalizariClient) {
        super(nume, volum, pret);
        this.numeClient=numeClient;
        this.personalizari.put(numeClient, new ArrayList<>(personalizariClient));
        System.out.println("Creare sablon costisitor pentru: " + numeClient);

    }

    //constr de copiere folosit de clone()
    private BauturaPresetata(BauturaPresetata original) {
        super(original.nume, original.volum, original.pret);
        this.numeClient = original.numeClient;
        // copiem intreaga mapa din original
        this.personalizari = new HashMap<>(original.personalizari);
    }


    @Override
    public void preparare() {
    }

    @Override
    public String getDetalii() {
        return "";
    }

    @Override
    public IBauturaPresetata clone() {
        return new BauturaPresetata(this);
    }

    public void adaugaPersonalizare(String personalizare) {
        personalizari.get(numeClient).add(personalizare);
    }
}
