package Ukesoppagver3;

import java.util.Arrays;

public class ulikeSort {
    public static void main(String[] args) {
        int[] value = {5, 6, 9, 2, 8, 3, 1, 10, 32, 4, 7, 14, 17, 18, 13};

        bubbleSort(value);
        // System.out.println(Arrays.toString(value));

        int index1 = bianarySort(value, 9);
        System.out.println("Fant tallet 9 på index: " + index1);

    } // main

    //INTERVALLER
    // Halvåpent intervall --> [8,10) => 8,9 || (8, 10] => 9,10 --> vanlig for-løkke
    // Lukekt intervall --> [8,10] => 8,9,10


    /**
     * BINARY SEARCH
     * Sammenlikner to-og-to verdier i et sortert array, mindre verdier er alltid til venstre og
     *  større verdier til venstre.
     *  + Veldig effektivt søk på sorterte lister.
     */

    public static int bianarySort(int[] value, int search_value) {
        // Søker etter 6
        // [ a b c d e f g h i j ]
        // value.length = 10 ||| midten = (values.length - 1) / 2 --> left + right / 2
        // --> svaret rundes nedover om det er heltall, svaret blir i dette tilfelle 'd'

        // søk i intervallet left, right
        int l = 0;
        int r = value.length -1;
        int m = l + r / 2;

        while (l < r) {
            // sørger for at 'm' oppdateres etter hvert søk
            m = l + r / 2;

            // hvia midt er større gå til venstre
            if (value[m] > search_value) {
                r = m - 1;
            } else if (value[m] < search_value) {
                l = m + 1;
            } else if ( value[m] == search_value){
                // eller NaN (not a number)
                return m;
            } else {
                System.out.println("Something went wrong!");
            }
        }

        // fant ikke verdien
        return -1;

    } // bianarySort




    /**
     * QIUCKSORT
     * Sorterer på et tilfeldig tall i starten (gjerne det siste tallet i rekken).
     *  Deretter iterer vi til hele listen er sortert.
     * >> Rekursiv algoritme.
     * + fffektivt sortering.
     *
     * eks. hvis 7 er skillet (Pivot), så er alle tall før mindre, og alle tall etter større eller lik 7.
     */



    /**
     * INSERTION SORT
     * Sorterer fra første tallet og setter det inn i rekken slik at tallene før er mindre og tallene etter er større.
     *  Tallene før blir på plassen sin, mens tallene etter "gir plass" for Pivot-tallet.
     */



    /**
     * MERGE SORT
     * Deler opp lister i mindre lister og fletter to tabeller sammen mens de sorteres.
     *  Deretter iterer vi til hele listen er sortert.
     * >> Rekursiv algoritme.
     * + effektivt sortering.
     */



    /**
     * BOUBBLE SORT
     * Sorterer fra "bunnen og oppover" som luftbobler i vann som blir større og bobler til overflaten.
     *  Tallet over bytter plass under hvis det er mindre. Deretter iterer vi til hele listen er sortert.
     * >> Rekursiv algoritme.
     *  + effektivt sortering.
     *  Obs values blir endret. Sorterer in-place
     */

    public static void bubbleSort(int[] value) {
        // To for-løkker:
        // Ytre løkke --> sorterer ett tall per gjennomgang

        /** for (int i = 0; i < value.length - 1; i++) { // skal sammenlikne med i + 1

            System.out.println("viser først sortering av index i");
            System.out.println(Arrays.toString(value));
            System.out.println();

            // Indre løkke --> bobler opp tall til riktig posisjon
            for (int j = value.length -1; j > i ; j--) {

                System.out.println("viser bytte av plass mellom j og i");
                System.out.println(Arrays.toString(value));

                // sjekk om tall og posisjon j og j - 1 er sorteret riktig
                if (value[j] < value[j-1]){
                    int tmp = value[j];
                    value[j] = value[j-1];
                    value[j-1] = tmp;
                }
            } // for j-løkke
        } // for i-løkke */
    } // bubbleSort
}
