package Ukesoppgaver4;

public class GenericsTest {
    public static void main(String[] args) {
        Integer [] a = {1, 8, 9, 18, 98, 2, 3, 9}; // bytte fra int til Interger for T-metode (generic)

        Character [] b = {'A', 'K', 'B', 'D', 'L', 'Y', 'M'}; // bytte fra char til Character for T-metode (generic)

        String [] c = {"Ane", "Zulu", "Ola", "Eva", "Adam", "Zelda"};

        System.out.println("Generic maks sin indeks av int-array: " + maksGen(a));
        System.out.println("Generic maks sin indeks av char-array: " + maksGen(b));
        System.out.println("Generic maks sin indeks av String-array: " + maksGen(c));

        // Oppretter nye personer til Person-klassen
        Person[] d = {new Person("Petter", "Pettersen"), new Person("Kari", "Pettersen"),
                new Person("Nils", "Abrahamsen"), new Person("Tor", "Toresen")};

        System.out.println("Generic maks sin indeks av Person-klasse: " + maksGen(d));

    }

    // Finner indeksen til en generisk verdi. Skal fungere på alle datatyper.
    static
    <T extends Comparable < ? super T>> // T er den generiske typen og den har i tillegg comparable metode.
    int maksGen(T [] values) {
        T current_max = values[0];
        int current_index = 0;

        for (int i = 1; i < values.length; i++) {
            // if (values[i] > current_max) {
            if (values[i].compareTo(current_max) > 0) { // if-setningen vil se slik ut med Comparable interface.
                current_max = values[i];
                current_index = i;
            }
        }
        return current_index;
    }

    // Person-klasse
    public static class Person implements Comparable<Person> {
        String first_name;
        String last_name;

        Person(String first_name, String last_name) {
            this.first_name = first_name;
            this.last_name = last_name;
        }

        // Må lage en compareTo funksjon for at generics-metoden skal fungere.
        public int compareTo(Person other) {
            /**
             * Pseudo code:
             * if (this.last_name < other.last_name) {
             *      return -1;
             *      // returnerer negativ da dette etternavnet er 'mindre' enn det neste.
             *  } else if (this.last_name == other.last_name) {
             *      return 0;
             *      // returnerer dette etternavnet da etternavnene er like.
             *  } else {
             *      return 1;
             *      // returnerer dette etternavnet da det er 'størst'.
             *  }
             * }
             */
            int last_compare = this.last_name.compareTo(other.last_name);
            if (last_compare == 0) {
                return this.first_name.compareTo(other.first_name);
            } else {
                return last_compare;
            }
        }
    }
}
