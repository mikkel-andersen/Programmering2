/*
 *
 */
package Helper;

/**
 * @author mad
 */
public class Hanoi {
    static int counter = 0;

    public static void flyt(int n, int fra, int til) {
        if (n == 1) {
            System.out.println("Flyt fra " + fra + " til " + til);
            counter++;

        } else {
            int temp = 6 - fra - til;
            flyt(n - 1, fra, temp);
            System.out.println("Flyt fra " + fra + " til " + til);
            flyt(n - 1, temp, til);
            counter++;
        }
    }

    public static void main(String[] args) {
        flyt(10, 1, 3);
        System.out.println(counter); //Antal træk er 2^n - 1

    }
}
