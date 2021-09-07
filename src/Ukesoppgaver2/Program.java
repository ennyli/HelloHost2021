package Ukesoppgaver2;

public class Program {
    /**
     *  Opgpave 2 - avsnitt 1.2.2
     *  Kjør programmet i Programkode 1.2.2 b).
     */
    public static void main(String[] args) {     // hovedprogram

        System.out.println("ListeA med tilfeldige tall:");
        int[] listeA = Tabell2.randPerm(6);              // en tilfeldig tabell
        for (int k : listeA) System.out.print(k + " ");  // skriver ut listeA

        int maskverdi = Tabell2.maks(listeA);   // finner posisjonen til største verdi
        System.out.println("\nStørste verdi ligger på plass " + maskverdi);
        Tabell2.skriv(listeA, 1, 4); // skriver ut verdiene som ligger på index 1 til 5
        System.out.println();

        int [] aa = {2,4,6,8,0,9};
        System.out.println("\nOppg 4 - 1.2.2");
        Tabell2.skriv(aa);
        System.out.println();

        // Oppgave 3 - avsnitt 1.2.3
        System.out.println("Oppg 3 - 1.2.3");
        int [] feilListe = {1,2,3,45,6,7};
        int maks = Tabell2.maks(feilListe); // skal slå ut feilmeldingriktig
        // int maksFail1 = Tabell2.maks(feilListe,3,1); // skal slå ut feilmelding
        // int maksFail2 = Tabell2.maks(feilListe, 0,7); // skal slå ut feilmelding
        // int maksFail3 = Tabell2.maks(feilListe, -1,0); // skal slå ut feilmelding
        // int maksFail4 = Tabell2.maks(feilListe, 0,0); // skal slå ut feilmelding
        System.out.println("Søste tallet i 'feilListe' er: " + maks);

    } // main

} // class Ukesoppgaver2.Program
