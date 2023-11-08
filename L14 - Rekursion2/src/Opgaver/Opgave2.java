package Opgaver;

public class Opgave2 {
    public static void main(String[] args) {
        String s1 = "ABBA";
        String s2 = "radar";
        System.out.println(palindrom(s1));
        System.out.println(palindrom(s2));
    }

    public static boolean palindrom(String tekst) {
        return palindrom(tekst.toCharArray(), 0,tekst.length() - 1);
    }

    public static boolean palindrom(char[] tekst, int start, int slut) {
        if (slut - start < 1) {
            return true;
        } else if (tekst[start] == tekst[slut]) {
            return palindrom(tekst, start + 1, slut - 1);
        }
        return false;
    }
}
