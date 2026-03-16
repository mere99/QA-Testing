package recapJava.polimorfismCuClasaAbstracta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Bautura> bauturi = new ArrayList<>();
        bauturi.add(new Cafea("americano", 5.2,"arabica"));
        bauturi.add(new Ceai("earl grey", 7.0, "citrusy", false));
        bauturi.add(new Cocktail("flower power", 15.00, true));

        for (Bautura b : bauturi){
            System.out.println(b.descriere() + " " + b.ingredientPrincipal());
        }
    }
}
