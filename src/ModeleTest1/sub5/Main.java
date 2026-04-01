package ModeleTest1.sub5;

public class Main {
    public static void main(String[] args) {
        CasaMarcat casa = CasaMarcat.getInstance();
        AbstractAngajat a1 = new Angajat("lily");
        AbstractAngajat a2 = new Angajat("tom");

        //lily deschide comanda
        casa.deschideComanda(a1);
        casa.adaugaProdus("cereale");
        casa.adaugaProdus("bobite");
        casa.showInfoComanda();

        //casa.deschideComanda(a1);
        casa.inchideComanda(a2);
        casa.showInfoComanda();


    }
}
