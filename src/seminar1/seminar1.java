package seminar1;

/**
 * caută numerele pare dintr-un șir, identifică unde apare primul și unde apare
 *ultimul, iar apoi calculează media aritmetică a tuturor numerelor aflate între
 *  aceste două poziții (inclusiv ele).
 *
 */


public class seminar1 {
    public static void main(String[] args) throws Exception {
        int[] setDate = {3, 5, 4, 8, 9, 10, 12, 5, 7, 8, 10, 23, 27};
        //  int[] setDate = {3, 5, 7, 11, 9};
        //  int[] setDate = {};
        double rezultat = calculeazaMedia(setDate);

        if (rezultat != -1) {
            System.out.println(rezultat);
        }
    }

    public static double calculeazaMedia(int[] vector) throws Exception {
        if (vector==null || vector.length == 0)
            throw new Exception("vector gol");

        int primaPoz = -1;
        int ultimaPoz = -1;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                if (primaPoz == -1) {
                    primaPoz = i;
                }
                ultimaPoz = i;
            }
        }

        if (primaPoz == -1)
            throw new Exception("nu exista numere pare");

        double suma = 0;
        int k = 0;
        for (int i = primaPoz; i <= ultimaPoz; i++) {
            suma += vector[i];
            k++;
        }

        return suma / k;
    }
}