package recapJava.immutability;

import java.util.ArrayList;
import java.util.List;

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


    }
}
