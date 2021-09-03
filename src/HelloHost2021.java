import java.util.Arrays;

public class HelloHost2021 {
    /**
     * Windows: [alt] + [enter] mens du holder på klassen for å lage tester.
     */

    // forkortelse 'main' autofyller main-metoden.
    public static void main(String[] args) {

        //forkortelse 'sout' autofyller system-out-print-line.
        System.out.println("Hei AlgDat!");

        int [] values = {1,7,2,4,6,9};
        System.out.println("Arrayet før sortering: " + Arrays.toString(values) + "\n");

        myFirstSort(values);
    }

    public static int findMax(int[] values, int fra, int til) {
        // initialiserer ved å se på første kort og sett det som foreløpig størst.
        int index = fra;
        int max_value = values[fra];

        // forkortelse 'fori' autofyller for-loop med i som index.
        // loopen må oppdateres for egendefinert loop.
        // halvåpent intervall >> [begin, end) - inkluderer ikke sistnevnte verdi.
        for (int i = fra + 1; i < til; ++i)
            if (values[i] > max_value) {
                max_value = values[i];
                index = i;
            }
        return index;
    }

    public static void myFirstSort(int[] values) {
        for (int k = 0; k < values.length-1; ++k) {

            int max_index = findMax(values, k, values.length);

            // bytter plass på tall på plass 0 og max_index
            int temp = values[k];
            values[k] = values[max_index];
            values[max_index] = temp;
        }

        // printer ut arrayet etter sortering
        System.out.print("Arrayet etter sortering: ");
        for (int i = 0; i < values.length; ++i) {
            System.out.print(values[i] + ", \n");
        }
    }
    // lukket intervall >> [left, right] - inkluderer sistnevnte verdi.
}
