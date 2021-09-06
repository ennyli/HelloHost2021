package Ukesoppgaver2;

import java.util.Arrays;
import java.util.Random;

/**
 * Oppgave 1 - avsnitt 1.2.2
 */
public class Tabell2 { // Samleklasse for tabellmetoder
    private Tabell2() {}   // privat standardkonstruktør - hindrer instansiering

    // Metoden bytt(int[] a, int i, int j)       Programkode 1.1.8 d)
    public static void bytt(int[] a, int i, int j) {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    // Metoden randPerm(int n)                   Programkode 1.1.8 e)
    public static int[] randPerm(int n) { // en effektiv versjon

        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
        {
            int i = r.nextInt(k+1);        // en tilfeldig tall fra 0 til k
            bytt(a,k,i);                   // bytter om
        }
        return a;                        // permutasjonen returneres
    }

    // Metoden randPerm(int[] a)                 Programkode 1.1.8 f)
    public static void randPerm(int[] a) { // stokker om a

        Random r = new Random();     // en randomgenerator

        for (int k = a.length - 1; k > 0; k--)
        {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a,k,i);
        }
    }

    // Metoden maks(int[] a, int fra, int til)   Programkode 1.2.1 b)
    public static int maks(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til) {
            throw new IllegalArgumentException("Illegal interval!");
        }

        int m = fra;             // indeks til største verdi i a[fra:til)
        int maksverdi = a[fra];  // største verdi i a[fra:til)

        for (int i = fra + 1; i < til; i++) if (a[i] > maksverdi)
        {
            m = i;               // indeks til største verdi oppdateres
            maksverdi = a[m];    // største verdi oppdateres
        }
        return m;  // posisjonen til største verdi i a[fra:til>
    }

    // Metoden maks(int[] a)                     Programkode 1.2.1 c)
    public static int maks(int[] a) { // bruker hele tabellen

        return maks(a,0,a.length);  // kaller metoden over
    }
    public static int min(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til)
            throw new IllegalArgumentException("Illegalt intervall!");

        int m = fra;             // indeks til minste verdi i a[fra:til>
        int minverdi = a[fra];  // minste verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++) if (a[i] < minverdi) {
            m = i;               // indeks til minste verdi oppdateres
            minverdi = a[m];    // minste verdi oppdateres
        }

        return m;  // posisjonen til minste verdi i a[fra:til>
    }

    // min-metodene - se Oppgave 1 i Avsnitt 1.2.1
    public static int min(int[] a)  // bruker hele tabellen
    {
        return min(a,0,a.length);  // kaller metoden over
    }

    /**
     *  Oppgave 2 - avsnitt 1.2.2
     *  Lag metoden public static void bytt(char[] c, int i, int j). Den skal bytte om innholdet i posisjon
     *  i og j  i char-tabellen c. Legg metoden i samleklassen Ukesoppgaver2.Tabell2.
     */
    public static void bytt(char[] c, int i, int j) {
        char temp = c[i]; c[i] = c[j]; c[j] = temp;
    }

    /**
     *  Oppgave 4 - avsnitt 1.2.2
     * 	Lag metoden public static void skriv(int[] a, int fra, int til). Den skal skrive ut tallene i
     * 	intervallet a[fra:til) til konsollet - alle på én linje og et mellomrom mellom hvert tall.
     * 	Ikke mellomrom og ikke linjeskift etter siste verdi.
     *
     * 	Lag så metoden public static void skriv(int[] a).
     * 	Den skal skrive ut hele tabellen - alle på én linje, en blank mellom hvert tall.
     * 	Ikke mellomrom og ikke linjeskift etter siste verdi. Legg begge metodene i samleklassen Ukesoppgaver2.Tabell.
     */
    public static void skriv(int[] a, int fra, int til) { // ** fungerer ikke som den skal ***
        for (int i = fra + 1; i < til; ++i) {
            if (til - fra < 0) {
                System.out.print(" " + a[i]);
            } else if (til - fra > 0) {
                System.out.print(a[fra] + "\n");
            }
        }
    }

    public static void skriv(int[] a) {
        skriv(a, 0, a.length);
    }

    /**
     *  Oppgave 5 - avsnitt 1.2.2
     *  Lag to skrivln-metoder. De skal ha samme signatur og fungere på samme måte som de to
     *  skriv-metodene i Oppgave 4 , men utskriften skal avsluttes med et linjeskift.
     *  Legg begge metodene i samleklassen Ukesoppgaver2.Tabell.
     */
    public static void skrivln(int[] a, int fra, int til) {
        if (til - fra > 0) {
            System.out.println(a[fra]);
        }
    }

} // class Ukesoppgaver2.Tabell2
