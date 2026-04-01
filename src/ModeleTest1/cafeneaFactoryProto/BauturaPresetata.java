package ModeleTest1.cafeneaFactoryProto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BauturaPresetata extends Bautura implements IBauturaPresetata {
private String numeClient;
private Map<String, List<String>> personalizari;
    private static final Map<String, List<String>> PERSONALIZARI_DEFAULT = new HashMap<>() {{
        put("Ion",    new ArrayList<>(List.of("caramel", "fara zahar")));
        put("Maria",  new ArrayList<>(List.of("extra spuma", "lapte de ovaz")));
        put("Andrei", new ArrayList<>(List.of("fara topping", "temperatura ridicata")));
        put("Elena",  new ArrayList<>(List.of("sirop vanilie", "extra zahar")));
        put("Radu",   new ArrayList<>(List.of("fara lapte", "gheata")));
    }};

//constr costisitor
    public BauturaPresetata(String nume, double volum, double pret, String numeClient) {
        super(nume, volum, pret);
        this.numeClient=numeClient;
        this.personalizari = new HashMap<>();
        PERSONALIZARI_DEFAULT.forEach((key, value) ->
                this.personalizari.put(key, new ArrayList<>(value))
        );
        System.out.println("Creare sablon costisitor pentru: " + numeClient);

    }

    //constr de copiere folosit de clone()
    private BauturaPresetata(BauturaPresetata original) {
        super(original.nume, original.volum, original.pret);
        this.numeClient = original.numeClient;
        // copiem intreaga mapa din original, deep copy
        this.personalizari = new HashMap<>();
        PERSONALIZARI_DEFAULT.forEach((key, value) ->
                this.personalizari.put(key, new ArrayList<>(value))
        );
    }


    @Override
    public void preparare() {
    }

    @Override
    public String getDetalii() {
        return "BauturaPresetata{client='" + numeClient + "'" +
                ", personalizari=" + personalizari.get(numeClient) +
                ", nume='" + nume + "', volum=" + volum + ", pret=" + pret + "}";
    }

    @Override
    public IBauturaPresetata clone() {
        return new BauturaPresetata(this);
    }
    public void adaugaPersonalizare(String personalizare) {
        personalizari.get(numeClient).add(personalizare);
    }
}
