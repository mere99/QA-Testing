package Builder.rezervare;

public class Main {
    public static void main(String[] args) {
    Rezervare pachetLux = new RezervareBuilder("Marriott")
            .adMicDejun(true)
            .adTransport(true)
            .adVedereMare(true)
            .adWiFi(true)
            .build();

    Rezervare pachetBuget = new RezervareBuilder("Hotel Central")
            .adWiFi(true)
            .build();

    System.out.println(pachetLux);
        System.out.println(pachetBuget);

    }
}
