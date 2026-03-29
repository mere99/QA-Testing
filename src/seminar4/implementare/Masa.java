package seminar4.implementare;

public class Masa {
    private String id;
    private boolean eDisp;

    public Masa(String id, boolean eDisp) {
        this.id = id;
        this.eDisp = eDisp;
    }

    public String getId() {
        return id;
    }

    public boolean iseDisp() {
        return eDisp;
    }

    public void seteDisp(boolean eDisp) {
        this.eDisp = eDisp;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "id='" + id + '\'' +
                ", eDisp=" + eDisp +
                '}';
    }
}
