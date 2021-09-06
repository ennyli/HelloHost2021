package Ukesoppgaver1;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Ukeoppgaver1Test {

    @org.junit.jupiter.api.Test
    void min() {
        int [] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19}; // kopiert fra main-metode

        int minumum = Ukeoppgaver1.min(a); // forteller at fasit er minimum

        assertEquals(6, minumum);// finner ut om det svaret vi vil ha (det "riktige") er det svaret vi får
        // ^ tester index ^

        assertEquals(1, a[minumum]); // finner ut om value er riktig

        // Tester coner cases ("Spesialtilfellene")
        int[] b = {1, 4, 17, 10, 6, 20, 8};
        Assertions.assertEquals(0, Ukeoppgaver1.min(b));

        int[] c = {8, 4, 17, 10, 6, 20, 1};
        Assertions.assertEquals(6, Ukeoppgaver1.min(c));

    }
}