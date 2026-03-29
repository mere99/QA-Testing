package Prototype.ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> studenti = List.of(
                "lili",
                "nina",
                "tudor",
                "keyla"
        );

        IDocument prototip = new DocumentCursuri("sem 2 an 3");
        System.out.println();

        //trimitem clonele catre studenti
        for(String s : studenti){
            IDocument docStud = prototip.clone();
            docStud.afiseaza(s);
        }

    }
}
