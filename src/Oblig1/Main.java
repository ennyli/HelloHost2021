package Oblig1;

import static Oblig1.Oppgave2.antallUlikeSortert;

public class Main {
    public static void main(String[] args) {
        int [] tabellOppg2 = {5, 3, 7, 4, 3, 5, 7, 8, 6, 7};

        int ulikeTall = Oppgave3.antallUlikeUsortert2(tabellOppg2);
        System.out.println("Det er " + ulikeTall + " ulike tall i tabellen.");
    }
}

