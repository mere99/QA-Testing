package Prototype.ex1;
/*
* cerinta:
* Agenția AgeTur dorește să trimită lista de oferte existentă în baza de date tuturor clienților.
*  Trimiterea durează foarte mult deoarece la fiecare client se creează un obiect nou de tipul
* ListaOferte, iar la creare se citesc din fișier toate ofertele.
* Să se găsească o soluție eficientă prin care listele de oferte să fie încărcate mai repede.
* */

import java.util.List;
//PROTOTYPE
public interface IListaOferte {
    IListaOferte clone();//metoda custom, nu mai e nevoie sa implementa Cloneable
    List<String> getOferte();
}
