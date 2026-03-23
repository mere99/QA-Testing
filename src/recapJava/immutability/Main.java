package recapJava.immutability;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        List<String> listaImutabila = new ArrayList<>();
        listaImutabila.add("brufen 400mg");
        listaImutabila.add("vitamina K");
        RetetaMedicala retetaImutabila = new RetetaMedicala("dolores", listaImutabila);

        //incercam sa modificam lista de medicamente din afara
        listaImutabila.add("antibiotic");
        System.out.println("nume pacient: " + retetaImutabila.getNumePacient());
        System.out.println("lista medicamente: "+ retetaImutabila.getMedicamente());

        //incercam sa modificam lista prin getteri:
        try{
           retetaImutabila.getMedicamente().add("paracetamol");
        }catch (UnsupportedOperationException e){
            System.out.println("ERR: NU poti modifica lista deja creata");
        }

 //equals si hashCode:
        //1 - compararea logica a 2 obiecte
        List<String> meds = List.of("magneziu", "cicaplast");
        RetetaMedicala r1 = new RetetaMedicala("tania", meds);
        RetetaMedicala r2 = new RetetaMedicala("tania", meds);
        if(r1.equals(r2)){
            System.out.println("r1 si r2 sunt aceleasi retete!");
        }

        //2 - folosirea in Set-uri:
        Set<RetetaMedicala> reteteUnice = new HashSet<>();
        reteteUnice.add(r1);
        reteteUnice.add(r2);//NU va fi adaugata, pt ca Set e o lista cu elemente unice
        reteteUnice.add(retetaImutabila);
        System.out.println(reteteUnice);

        //3 - cautarea in liste cu .contains()
        List<RetetaMedicala> arhiva = new ArrayList<>();
        arhiva.add(r1);
        arhiva.add(retetaImutabila);
        //verificam daca noua reteta(r2) se afla deja in arhiva:
        if(arhiva.contains(r2)){
            System.out.println("reteta exista deja in arhiva!");
        }

    }
}
