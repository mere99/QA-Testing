package ModeleTest1.sub5;

public class Main {
    public static void main(String[] args) {
        CasaMarcat casa = CasaMarcat.getInstance();
        AbstractAngajat a1 = new Angajat("lily");
        AbstractAngajat a2 = new Angajat("tom");

        //lily deschide comanda
        casa.deschideComanda(a1);
        casa.adaugaProdus(a1,"cereale");
        casa.adaugaProdus(a1,"bobite");
        casa.showInfoComanda();
//=====diverse exceptii====
        //tom incearca sa adauge prod in comanda lui lily
       // casa.adaugaProdus(a2,"eugenie");

        //tom incearca sa inchida comanda lui lily
       // casa.inchideComanda(a2);

        //tom incearca sa deschida o comanda in timp ce cea a lui lily nu e inchisa
        casa.deschideComanda(a2);
        //casa.inchideComanda(a1);
        casa.showInfoComanda();


    }
}
