package seminar2si3.taxare;

import java.util.HashMap;
import java.util.Map;

public class TaxareNormala implements ITaxare{
    //prin declararea variabilei ca Map(interfata) si nu ca HashMap(implementare), poti schimba ulterior
    //cu TreeMap sau LinkedHashMap , fara a modifica metodele care folos taxe
private static Map<String, Double> taxe;

static{
    taxe = new HashMap<>();
    taxe.put("CAS", 0.35);
    taxe.put("CASS", 0.20);
    taxe.put("Impozit", 0.1);

}

    @Override
    public double getSalariuNetDinBrut(double salariuBrut) {
     double salariuFaraCAS = salariuBrut * (1 - taxe.get("CAS")-taxe.get("CASS"));
     double salariuNet = salariuFaraCAS * (1 - taxe.get("Impozit"));
     return salariuNet;
    }
}
