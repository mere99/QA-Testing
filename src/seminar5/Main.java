package seminar5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        APIDimensiuni api = APIDimensiuni.getInstance();
        api.init();

        //folosim api ca sa preluam dimensiunile in fct de marimea dorita:
        List<Integer> dim = api.getDimensiuni(38);
        System.out.println(dim);

        //prototip ex1
        Crocs crocs1 = new Crocs(38);
        Crocs crocs2 = (Crocs) crocs1.clone();
        Crocs crocs3 = new Crocs(41);
        System.out.println(crocs1);
        System.out.println(crocs2);
        System.out.println(crocs3);
        crocs1.setAccesorii("Charm stea");
        crocs1.setCuloare("Verde");
        System.out.println(crocs1);
        System.out.println(crocs2);
        System.out.println(crocs3);
    }
}
