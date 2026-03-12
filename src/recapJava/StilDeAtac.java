package recapJava;
/*
* În Java, cuvântul cheie final înseamnă "fără modificări", dar efectul său diferă în funcție de unde îl pui:
1)Pe o variabilă/câmp: Înseamnă că variabila poate fi
inițializată o singură dată. Odată ce i-ai dat o valoare, nu mai poți scrie
motor = new Motor(); a doua oară. Este ideal pentru compoziție, deoarece garantează
că mașina nu rămâne fără motor la jumătatea execuției.
2)Pe o metodă: Înseamnă că metoda nu poate fi suprascrisă (@Override) de subclase.
3)Pe o clasă: Înseamnă că clasa nu poate fi moștenită (nu poți face extends din ea).
* */
public class StilDeAtac {
    void ataca() { System.out.println("Tigrul ataca prin ambuscada!"); }

}
