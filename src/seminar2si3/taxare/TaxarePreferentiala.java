package seminar2si3.taxare;

import java.util.HashMap;
import java.util.Map;

public class TaxarePreferentiala implements ITaxare{
private static Map<String, Double> taxe;
static{
    taxe = new HashMap<>();
    taxe.put("CAS", 0.25);
    taxe.put("CASS", 0.15);
    taxe.put("Impozit", 0.09);
}


    @Override
    public double getSalariuNetDinBrut(double salariuBrut) {
        double salariuFaraCAS = salariuBrut * (1 - taxe.get("CAS")-taxe.get("CASS"));
        double salariuNet = salariuFaraCAS * (1 - taxe.get("Impozit"));
        return salariuNet;
    }
}
