package Opgaver;

public class SFD {

    public static void main(String[] args) {
        System.out.println(SFD(100, 900));
    }

    public static int SFD(int a, int b) {
        int rizz = 0;

        if (a == 0) {
            return b;
        }

        return SFD(b % a, a);
    }
}
