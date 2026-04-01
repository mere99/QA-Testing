package Builder.rezervare;

public class RezervareBuilder {
    private String hotel;
    private boolean areTransport;
    private boolean areMicDejun;
    private boolean areWifi;
    private boolean areVedereMare;

    //doar hotelul e obligatoriu
    public RezervareBuilder(String hotel){
        this.hotel=hotel;
    }

    //atribute optionale - facem metode de adaugare:
    public RezervareBuilder adTransport(boolean areTransport){
        this.areTransport=areTransport;
        return this;
    }

    public RezervareBuilder adMicDejun(boolean areMicDejun){
        this.areMicDejun = areMicDejun;
        return this;
    }

    public RezervareBuilder adWiFi(boolean areWifi){
        this.areWifi = areWifi;
        return this;
    }

    public RezervareBuilder adVedereMare(boolean areVedereMare){
        this.areVedereMare = areVedereMare;
        return this;
    }

    //metoda finala care asambleaza obiectul
    public Rezervare build() {
        return new Rezervare( hotel,  areTransport,  areMicDejun,  areWifi,  areVedereMare);
    }
}
