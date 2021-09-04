public class Program {
    /**
     *  Opgpave 2 - avsnitt 1.2.2
     *  Kjør programmet i Programkode 1.2.2 b).
     */
    public static void main(String[] args) {     // hovedprogram

        int[] a = Tabell2.randPerm(5);              // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");  // skriver ut a

        int m = Tabell2.maks(a);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);

        Tabell2.skriv(a, 0, 4);
        // Tabell2.skriv(a);

    } // main

} // class Program
