package FactoryMethod;

public abstract class FactoryMakeup {
    public abstract IMakeup createMakeup();

    public void proceseazaComanda(){
        IMakeup m = createMakeup();
        System.out.println("se pune in cutie...");
        m.aplica();
        System.out.println("===gata===");

    }

}
