package Builder.cupcake;

import java.util.List;
/**
 Restrictii de implementare:

 -nu pot exista mai mult de 3 toppings fara sa existe si un filling;
 -daca baza este "chocolate", atunci frosting-ul nu poate fi "lemon";
 -calculCalories() returneaza o valoare dupa o regula de calcul care tine cont de tipul bazei,
 al frosting-ului, al filling-ului si de numarul si tipul toppings-urilor;
 -orice restrictie de implementare arunca o exceptie custom cu mesajul aferent situatiei respective.
 *
 */


public class Cupcake {
private String baza;//obligatoriu
private String frosting;//obligatoriu
private String filling;//optional
private List<Topping> toppings;//optional

    //constructorul e package-private , doar Builder poate crea instante
    public Cupcake(String baza, String frosting, String filling, List<Topping> toppings) {
        this.baza = baza;
        this.frosting = frosting;
        this.filling = filling;
        this.toppings = toppings;
    }

    public int calculCalories(){
       int cal = 100;//baza standard

        switch (frosting.toLowerCase()) {
            case "vanilla"   -> cal += 30;
            case "chocolate" -> cal += 40;
            case "lemon"     -> cal += 20;
            default -> cal+=10;
        }

       switch(baza.toLowerCase()){
           case "ciocolata" ->cal +=50;
           case "vanilie" ->cal+=30;
           case "carrot" ->cal+=42;
       }

       if (filling != null) cal += 40;
       if(toppings!=null){
           for(Topping t: toppings){
               cal+=t.getCalories();
           }
       }

        return cal;

    }

    @Override
    public String toString() {
        return "Cupcake{" +
                "baza='" + baza + '\'' +
                ", frosting='" + frosting + '\'' +
                ", filling='" + (filling != null ? filling : "fara filling") + '\'' +
                ", toppings=" + toppings +
                ", calorii=" + calculCalories() +
                '}';
    }
}
