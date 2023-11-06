package Opgaver;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("lekkim"));
    }

    public static String reverse(String s) {
        String rizz;
        if ((s == null) || (s.length() <= 1)) {
            return s;
        }
        rizz = reverse(s.substring(1)) + s.charAt(0);
        return rizz;
    }
}
