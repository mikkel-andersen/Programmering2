package Opgaver;

public class Product {

    public static void main(String[] args) {
        System.out.println(product(10, 4));
        System.out.println(productRus(2, 5));
    }

    public static int product(int a, int b) {
        int rizz;

        if (a * b == 0 ) {
            return 0;
        } else {
            rizz = product(a - 1, b) + b;
        }
        return rizz;
    }

    public static int productRus(int a, int b) {
        int rizz;

        if (a * b == 0) {
            return 0;
        } else if (a >= 1 && a % 2 != 0) {
            rizz = productRus(a - 1, b) + b;
        } else {
            rizz = productRus((a / 2), (b + b));
        }
        return rizz;
    }
}
