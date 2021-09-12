package Oblig1;

public class Oppgave2 {
    public static int antallUlikeSortert(int[] a) {
        int teller = 0;

        for (int i = 0; i < a.length -1; ++i) {
            if (a.length == 0) {
                teller = 0;
            } else if (a[i] > a[i+1]) {
                throw new IllegalStateException("Tabelllen er ikke sortert stigende.");
            } else if (a[i] < a[i+1]){
                teller ++;
            }
        }
        return teller;
    }
}
