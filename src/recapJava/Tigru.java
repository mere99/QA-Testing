package recapJava;
public class Tigru extends Felina implements IMananca{

    //COMPOZITIE: Tigrul ARE UN stil de atac, NU ESTE UN STIL DE ATAC(mostenire)
    private final StilDeAtac stil = new StilDeAtac();

    //Aici folosesc compozitia:
    public void executaAtac(){
        stil.ataca();
    }

    @Override
    void vaneaza() {
        System.out.println("Tigrul vaneaza");
    }

    @Override
    public void mananca() {
      System.out.println("Tigrul mananca");
    }

    //constructorii NU se mostenesc automat - ne trb constr pt atrib nume din Felina

    public Tigru(String numeDat) {
        this.nume = numeDat;
    }
}
