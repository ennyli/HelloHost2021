import java.util.Arrays;

public class Ukeoppgaver1 {
    public static void main(String[] args) {
        System.out.println("Oppgaver fra nettbasert pensumbok\n");

        /**
         *  Oppgave 1 - avsnitt 1.1.2
         * 	Anta at vi har en min-metode, dvs. en metode som finner (og returnerer) posisjonen
         * 	til den minste verdien i en tabell. Hva ville metodekallet min(a) returnere med
         * 	hvis 'a' er tabellen i Figur 1.1.2?
         *
         * 	svar:
         * 	Den ville returnert med index[6], fordi det laveste tallet er 1.
         */

        // figur 1.1.2: liste a
        int [] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};

        int min_index = min(a);
        System.out.println("Minste verdi: " + a[min_index] + "\nog index'en: " + min_index + "\n");

        // svar til avsnitt 1.1.3
        int [] b = minmaks(a);
        System.out.println("Tabell b består av: " + Arrays.toString(b));

        /**
         * Oppgave 6 - avsnitt 1.1.3
         * Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 . Lag en metode
         * long fak(int n) som regner ut n!. Hvor mange multiplikasjoner utføres i metoden?
         */
        // svar:
        int n = 10;
        System.out.println("Fakultet blir: " + fak(n) + ".");
    }
    static long fak(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fak(n -1);
        }
    }


    // Programkode 1.1.2
    // (justert fra læreboken for å kunne kjøres i dette prosjektet)
    static int max(int[] b) {
        if (b.length < 1) throw new java.util.NoSuchElementException("Tabellen er tom!");
        int max = b[0];

        for (int i = 1; i < b.length; ++i) {
            if (b[i] > b[max]) max = i;
        }
        return max;
    }

    /**
     * Oppgave 2 - avsnitt 1.1.2
     * Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs.
     * en metode som finner (og returnerer) posisjonen til den minste verdien i en tabell.
     */

    static int min(int[] a) {
        // initialiserer første element.
        int min_value = a[0]; // finner verdien.
        int min_index = 0; // finner index.

        // looper over alle resterende elementer og sjekker om vi finner
        // et mindre tall.
        for (int i = 1; i < a.length; ++i) { // index 0 er initiert, vi starte rett på index 1 som skal sammenlikne.
            int value = a[i]; // verdien man står på.
            int index = i; // index'en man står på.
            if (value <= min_value) {
                min_value = value;
                min_index = index;
            }
        }
        return min_index; // returnerer index til den minste verdien.
    }

    /**
     * Oppgave 3 - avsnitt 1.1.2
     * Inni if-settningen kan man stedenfor å skrive '(value < min_value)' kan skrive '(value <= min_value)'. Da sier
     * man value er den minste hvis den er mindre eller like liten som forrige min_value.
     */

    /**
     * Oppgave 5 - avsnitt 1.1.3
     * Lag en metode public static int[] minmaks(int[] a). Den skal ved hjelp av en int-tabell med lengde
     * 2 returnere posisjonene til minste og største verdi i tabellen a. Hvis du har funnet at m1 er
     * posisjonen til den minste og m2 til den største, kan du returnere tabellen b definert ved:
     *
     * int[] b = {m1, m2};
     *
     * Hvor mange sammenligninger bruker metoden din?
     */

    // int [] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
    public static int[] minmaks(int[] a) {
        int m1_verdi = a[0];
        int m1 = 0;
        int m2_verdi = a[0];
        int m2 = 0;
        int teller = 0;

        for (int y = 1; y < a.length; ++y) {
            int verdi = a[y];
            int indeks = y;

            if (verdi < m1_verdi) {
                m1_verdi = verdi;
                m1 = indeks;
            } else if (verdi > m2_verdi) {
                m2_verdi = verdi;
                m2 = indeks;
            }
            teller ++;
        }
        System.out.println("\nDen bruker " + teller +
                " sammenlikninger for å finne minste og største verdien.");
        return new int[]{m1, m2};
    }
} // class Ukeoppgaver1
