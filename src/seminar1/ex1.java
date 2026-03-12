/*
* Scrie o metodă care primește un vector de numere întregi și calculează suma
*  elementelor aflate între prima apariție a cifrei 5 și ultima apariție a cifrei
*  5 (inclusiv ele). Dacă cifra 5 apare o singură dată, rezultatul va fi 5. Dacă nu
* apare deloc, ar trebui să arunci o excepție.
*
* */
package seminar1;

public class ex1 {

    public static void main(String[] args){
        int vector1[] = {9, 0, 28, 5, 8, 90, 5, 10, 0, 19};
        int vector2[] = {5, 0, 34, 99, 89, 17};
        int vector3[] = {49, 50, 51};

      try{
          System.out.println("rez 1:"+calculeazaSuma(vector1));
          System.out.println("rez 2:"+calculeazaSuma(vector2));
          System.out.println("rez 3:"+calculeazaSuma(vector3));

      } catch (Exception e) {
          throw new RuntimeException(e);
      }
    }

    public static int calculeazaSuma(int[] v) throws Exception{
       if (v==null || v.length==0)
           throw new Exception("vector gol! introduceti date");
       int primaAparitie = -1;
       int ultimaAparitie = -1;
       for(int i=0;i<v.length;i++){
           if(v[i]==5){
               if(primaAparitie==-1){
                   primaAparitie=i;
               }
               ultimaAparitie=i;
           }
       }

       int suma = 0;
       if(primaAparitie==-1){
           throw new Exception("nr 5 NU apare in sir!");
       }
        else if(primaAparitie==ultimaAparitie){
           suma=5;
       }
        else {
          for(int i=primaAparitie;i<=ultimaAparitie;i++){
              suma+=v[i];
          }
       }

        return suma;
    }

}
