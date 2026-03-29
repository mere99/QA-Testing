package Prototype.ex2;
/*
* Problema
Universitatea trebuie să trimită documentul cu cursurile din semestru tuturor studenților.
* Documentul se construiește greu — se citesc cursurile din baza de date, se calculează orarul,
*  se generează PDF-ul. Cum îl trimitem eficient la toți studenții?
* */
public interface IDocument {
    IDocument clone();
    void afiseaza(String student);
}
