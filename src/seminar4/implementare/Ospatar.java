package seminar4.implementare;

public class Ospatar {
    private String nume;

    public Ospatar(String nume) {
        this.nume = nume;
    }

    public void preluareClient(String id){
        System.out.println("ospatarul " + this.nume + " preia clientul la masa cu id-ul "+ id);
        Restaurant.getInstance().ocupaMasa(id);
    }
    public void afisareMese(){
        Restaurant.getInstance().afisareMese();
    }
}
