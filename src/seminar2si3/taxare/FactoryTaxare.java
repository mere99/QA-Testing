package seminar2si3.taxare;

import java.util.HashMap;
import java.util.Map;

//aici va fi logica care decide ce taxare se aplica in functie de COR-ul angajatului
public class FactoryTaxare {
    private static Map<String, ITaxare> mapa;

    static{
        mapa = new HashMap<String, ITaxare>();
        ITaxare taxareP = new TaxarePreferentiala();
        ITaxare taxareN = new TaxareNormala();
        mapa.put("1111", taxareP);
        mapa.put("2222", taxareN);
        mapa.put("3333", taxareN);
        mapa.put("4444", taxareN);
    }

    public static ITaxare getTaxareDupaCOR(String COR){
        return mapa.getOrDefault(COR, new TaxareNormala());
    }
}
