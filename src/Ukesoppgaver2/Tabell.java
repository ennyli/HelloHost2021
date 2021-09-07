package Ukesoppgaver2;

public class Tabell {

    private Tabell() {
    } // privat standardkontruktør som hindrer instansiering

    /**
     * Oppgave 1 - avsnitt 1.2.1
     * Lag to min-metoder (metoder som finner posisjonen til den minste verdien) tilsvarende
     * de to maks-metodene i Programkode 1.2.1 b) og 1.2.1 c). Legg dem i samleklassen Tabell.
     */
    public static int min(int[] a, int fra, int til) {
        int minst = fra;
        int minstverdi = a[fra];

        for (int i = fra + 1; i < til; ++i) {
            if (a[i] < minstverdi) {
                minstverdi = a[i];
                minst = i;
            }
        }
        return minst; // returnerer [fra:til)
    }

    public static int min(int[] a) {
        return min(a, 0, a.length); // kaller på metoden over og returnerer hele listen
    } // class Ukesoppgaver2
}
