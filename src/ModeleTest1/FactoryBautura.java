package ModeleTest1;

public class FactoryBautura {
    public static Bautura createBautura(TipBautura t, String nume, double volum, double pret){
        switch (t){
            case CEAI ->{ return
                new Ceai(nume, volum , pret, "greenTea");
            }
            case CAFEA -> { return
                new Cafea(nume, volum, pret, false);
            }
            case CIOCOLATA_CALDA -> {return
                new CiocolataCalda(nume, volum, pret);
            }
            default -> {return null;
            }
        }

    }
}
