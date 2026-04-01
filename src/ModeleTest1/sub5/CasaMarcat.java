package ModeleTest1.sub5;

import java.util.ArrayList;
import java.util.List;

//SINGLETON
public class CasaMarcat implements AbstractCasaMarcat {
    private static CasaMarcat instance = new CasaMarcat();
    private CasaMarcat(){};
    public static CasaMarcat getInstance(){
        if(instance==null){instance = new CasaMarcat();}
        return instance;
    }

    private AbstractAngajat angCurent;
    private List<String> produse;
    private StareComanda stareComanda;

    @Override
    public void deschideComanda(AbstractAngajat angajat) {
        System.out.println("angajatul "+ angajat.getNume() +" a deschis comanda ");
        this.stareComanda=StareComanda.DESCHISA;
        this.angCurent=angajat;
        this.produse = new ArrayList<>();
    }

    @Override
    public void inchideComanda(AbstractAngajat angajat) {
        System.out.println("angajatul "+ angajat.getNume() +" a inchis comanda cu produsele: "+produse);
        this.stareComanda=StareComanda.INCHISA;
        this.angCurent=null;
        this.produse=new ArrayList<>();
    }

    @Override
    public void adaugaProdus(String denumireProdus) {
      this.produse.add(denumireProdus);
    }

    @Override
    public void showInfoComanda() {
        if(stareComanda.equals(StareComanda.INCHISA)){
            throw new IllegalArgumentException("NU exista nicio comanda deschisa!");
        }
        System.out.println("Angajat: " + angCurent.getNume() + " Produse: " + produse);
    }
    //comanda poate fi modif doar de ang care a adaugat-o
    public void verificaAngajat(AbstractAngajat a){
        if(stareComanda.equals(StareComanda.INCHISA)){
            throw new IllegalArgumentException("NU exista nicio comanda deschisa!");
        }

        if(!a.getNume().equalsIgnoreCase(angCurent.getNume())){
            throw new IllegalArgumentException(
                    a.getNume() + " nu poate modifica comanda lui " + a.getNume() + "!");
        }


    }
}
