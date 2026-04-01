package Builder.cupcake;

public class Main {
    public static void main(String[] args) {

        Cupcake c1= new CupcakeBuilder("default", "vanilla").build();
        System.out.println(c1);

        Cupcake c2 = new CupcakeBuilder("ciocolata", "vanilla")
                .adFilling("afine")
                .adTopping(TipToppings.CIOCOLATA)
                .build();
        System.out.println(c2);

        //incercam sa obtine err legata de baza cioco + frosting lemon
        Cupcake c3 = new CupcakeBuilder("ciocolata", "lemon")
                .adTopping(TipToppings.NUCI)
                .build();



    }
}
