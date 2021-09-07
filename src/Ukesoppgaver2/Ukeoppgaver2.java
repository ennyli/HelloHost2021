package Ukesoppgaver2;

import java.util.Arrays;
public class Ukeoppgaver2 {

    public static void main(String[] args) {

        /**
         *  Oppgave 5 - avsnitt 1.2.1
         *  5.	I Java 1.5 ble det innført en ny type for-løkke - en såkalt for-alle-løkke.
         *  Se Programkode 1.2.1 d). Den må du lære deg hvis du ikke allerede kan den.
         *  Se f.eks. Vedlegg E.
         */

        System.out.println("\nOppg 5 - 1.2.1");
        int [] forAlle = {1,2,3,4,5,6,7};
        for (int tall : forAlle) System.out.print(tall + " ");
        System.out.println();

        // Oppgave 4 - avsnitt 1.2.2
        int [] aa = {2,4,6,8,0,9};
        System.out.println("\nOppg 4 1.2.2");
        Tabell2.skriv(aa);
        System.out.println();

        /**
         * * Oppgave 2 - avsnitt 1.2.2
         *  * Kjør programmet i Programkode 1.2.2 b).
         */
        System.out.println("\nOppg 2 - 1.2.2");
        int[] a = Tabell2.randPerm(20);              // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");  // skriver ut a

        int m = Tabell2.maks(a);   // finner posisjonen til største verdi
        System.out.println("Største verdi ligger på plass " + m);
    }
} // class Ukesoppgaver2