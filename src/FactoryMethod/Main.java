package FactoryMethod;

public class Main {
    public static void main(String[] args) {
 FactoryMakeup f1 = new FactoryBlush(3);
 FactoryMakeup f2 = new FactoryLipstick("soft-pink");
 FactoryMakeup f3 = new FactoryMascara(false);

 f1.proceseazaComanda();//aici se face si createMakeup()
        f2.proceseazaComanda();
        f3.proceseazaComanda();


    }
}
