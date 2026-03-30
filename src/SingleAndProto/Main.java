package SingleAndProto;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        APICalculAutonomie.getInstance().init();
        Masina m1 = new Masina("XS3", 34);
        Masina m2 = new Masina("RP-7", 72);

        Masina m3 =(Masina) m1.clone();
        Masina m4 = (Masina)m2.clone();

        m3.setCuloare("silver");
        m1.adOptiune("incalzire Scaun");
        System.out.println(m1);
        System.out.println(m3);

    }
}
