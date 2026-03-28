package seminar2si3.main;

import seminar2si3.angajati.Lucrator;
import seminar2si3.angajati.Manager;
import seminar2si3.companie.Companie;

public class Main {
    //regula: metoda main NU trb sa contina operatii complexe
    //rolul ei e de a orchestra si de a servi ca punct de intrare
    public static void main(String[] args){
        Companie companie = new Companie("COMP1");

        companie.adAngajat(new Manager("m1", 1000, "2222", 7));
        companie.adAngajat(new Manager("m1", 1900, "1111", 30));
        companie.adAngajat(new Lucrator("l1", 840, "3333", 0.3));

        System.out.println("total salariu net companie: " + companie.totalSalariuNet());

    }
}
