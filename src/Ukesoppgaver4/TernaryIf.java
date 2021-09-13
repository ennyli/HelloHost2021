package Ukesoppgaver4;

public class TernaryIf {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int a = i;
            int b = myTernaryIfTest(a);
            System.out.println(b);
        }

        // If-test i main
        int a = 10;
        int b = (a < 5) ? 13:17;
        System.out.println(b);
    }

    // Ternary if-test metode
    static int myTernaryIfTest(int value) {
        return (value < 5) ? 0:98; // Returner (hvis value mindre enn 5) 0, ellers returner 98.
    }
}
