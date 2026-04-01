package Builder.rezervare;

public class Rezervare {
    private String hotel;
    private boolean areTransport;
    private boolean areMicDejun;
    private boolean areWifi;
    private boolean areVedereMare;

    Rezervare(String hotel, boolean areTransport, boolean areMicDejun, boolean areWifi, boolean areVedereMare) {
        this.hotel = hotel;
        this.areTransport = areTransport;
        this.areMicDejun = areMicDejun;
        this.areWifi = areWifi;
        this.areVedereMare = areVedereMare;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "hotel='" + hotel + '\'' +
                ", areTransport=" + areTransport +
                ", areMicDejun=" + areMicDejun +
                ", areWifi=" + areWifi +
                ", areVedereMare=" + areVedereMare +
                '}';
    }
}
