package seminar5.ex2;

import java.util.ArrayList;

public class JucatorBaschet extends AbstractJucator{
    JucatorBaschet(){
        System.out.println("proces consumator, preluare set exercitii pt BASCHET..");
        this.antrenament = new ArrayList<>();
        this.antrenament.add(new Exercitiu("flotari", 30));
        this.antrenament.add(new Exercitiu("ex gambe", 50));

    }
}
