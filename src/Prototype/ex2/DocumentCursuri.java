package Prototype.ex2;

import java.util.ArrayList;
import java.util.List;

public class DocumentCursuri implements IDocument{
    private List<String> cursuri;
    private String semestru;

    //constructor costisitor
    public DocumentCursuri(String semestru){
        System.out.println("se incarca cursurile din BD....");
        this.semestru=semestru;
        this.cursuri=new ArrayList<>();
        cursuri.add("CTS");
        cursuri.add("PSQL");
        cursuri.add("RETELE");
        cursuri.add("SIE");
    }

    //constructor privat folosit de clone()
    private  DocumentCursuri(String semestru, List<String> cursuri){
        this.cursuri= new ArrayList<>(cursuri);
        this.semestru = semestru;
    }

    @Override
    public IDocument clone() {
        System.out.println("se cloneaza rapid documentul..");
        return new DocumentCursuri(this.semestru, this.cursuri);
    }

    @Override
    public void afiseaza(String student) {
        System.out.println("destinatar: "+student);
        System.out.println(semestru);
        for(String c : cursuri){
            System.out.println(" -> "+c );
        }
    }
}

