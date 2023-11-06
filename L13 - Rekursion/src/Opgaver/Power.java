package Opgaver;

public class Power {

    public static void main(String[] args) {
        System.out.println(power(10, 3));
        System.out.println(power2(3, 3));
    }

    public static int power(int n, int p) {
        int rizz;

        if (p != 0) {
            rizz = n * power(n, p - 1);
        } else {
            return 1;
        }
        return rizz;
    }

    public static int power2(int n, int p) {
        int rizz;
        if (p == 0) {
            return 1;
        } else if (p % 2 != 0) {
            rizz = n * power2(n, p - 1);
        } else {
            rizz = power2(n * n, p / 2);
        }

        return rizz;
    }
}
