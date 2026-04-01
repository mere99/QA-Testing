package Builder.cupcake;

import java.util.ArrayList;
import java.util.List;

public class CupcakeBuilder {
    //obligatroii:
private final String baza;
private final String frosting;

//optionale:
private String filling = null;
    private List<Topping> toppings = new ArrayList<>();


    //CONSTR PRIMESTE DOAR CAMP OBLIGATORII!!!
    public CupcakeBuilder(String baza, String frosting) {
        this.baza = baza;
        this.frosting = frosting;
    }

    public CupcakeBuilder adFilling(String filling){
        this.filling=filling;
        return this;
    }

    public CupcakeBuilder adTopping(TipToppings t){
        toppings.add(new Topping(t));
        return this;
    }

    public Cupcake build(){
        //aici pun restrictiile - baza ciocolata nu merge cu frosting lemon
        if(baza.equalsIgnoreCase("ciocolata") && frosting.equalsIgnoreCase("lemon")){
            throw new IllegalArgumentException("baza de cioco NU e compatibila cu frosting LEMON!!!");
        }

        if(toppings!=null && toppings.size()>3 && filling==null){
            throw new IllegalArgumentException("mai mult de 3 toppings necesita obligatoriu un filling!");
        }

        return new Cupcake(baza, frosting, filling, toppings);


    }
}
