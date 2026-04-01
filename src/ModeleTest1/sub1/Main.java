package ModeleTest1.sub1;

public class Main {
    public static void main(String[] args) {
        Magazin m1 = new MagazinBuilder("cute pijamas", 75, 1).build();
        System.out.println(m1);

        Magazin m2 = new MagazinBuilder("sport and travel", 150, 2)
                .adPodeaSpeciala()
                .adMaterialDecoratiune("sticla")
                .build();
        System.out.println(m2);

     //   aici ar trb sa arunce exceptie:
        Magazin m3 = new MagazinBuilder("girly shit", 190, 1)
                .build();


    }
}
