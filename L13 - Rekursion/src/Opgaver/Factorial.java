package Opgaver;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(8));
    }

    public static long factorial(int n) {
        long rizz = 0;

        if (n == 0) {
            return 1;
        } else {
            rizz = n * factorial(n - 1);
        }
        return rizz;
    }
}
