public class Ukeoppgaver1 {
    public static void main(String[] args) {
        System.out.println("Oppgaver til avsnitt 1.1.2 fra pensum");
        /**
         * 	Oppgave 1
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

        System.out.println(min_index);

        // Programkode 1.1.2
    }
    /**
     * Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs.
     * en metode som finner (og returnerer) posisjonen til den minste verdien i en tabell.
     */

    static int min(int[] a) {
        int min_value = a[0]; // miste verdi ligger på index 0 i listen.
        int min_index = 0; // verdien ligger på idex 0.

        return min_index; // returnerer index til minste verdien.
    }
}
