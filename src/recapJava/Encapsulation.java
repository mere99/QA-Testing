package recapJava;
//Encapsulation- campuri private, acces prin getters/setters
//Vizibilitate default: dacă nu pui public/private, e vizibil doar
// în același pachet (package-private)
//Validare la intrare: verificăm datele în setteri sau constructori
//private: in aceeasi clasa
//protected: in acelasi pachet si in subclase
//public: peste tot
//Interfața: Definește un comportament (ce poate face)
//Clasa Abstractă: Definește o identitate (ce este) și poate avea stare (câmpuri)
public class Encapsulation
{
    private String nume;
    private int numar;//invariant=nr trb sa fie intre 1 si 100

    //validari in constructor:
    public Encapsulation(String nume, int numar) {
        if(nume!=null && nume.length()<100){
            this.nume = nume;
        }
        else{
            throw new IllegalArgumentException("Numele trb sa aibe sub 100 caractere!");
        }
        if(numar>=1 && numar<=100){
            this.numar = numar;
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumar() {
        return numar;
    }

    //validare in setter:
    public void setNumar(int numar) {
        if(numar>=1 && numar<=100){
            this.numar = numar;
        }
        else{
            throw new IllegalArgumentException("Nr trb sa fie intre 1 si 100!!");
        }
    }
}
