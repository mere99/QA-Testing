package ModeleTest1.sub5;

public interface AbstractCasaMarcat {
    //la adaugaProdus ar trb adaugat ca param Angajatul, ca sa verificam ca el e cel care se ocupa de comanda
    void deschideComanda(AbstractAngajat angajat);
    void inchideComanda(AbstractAngajat angajat);
    void adaugaProdus(String denumireProdus);
    void showInfoComanda();
}
