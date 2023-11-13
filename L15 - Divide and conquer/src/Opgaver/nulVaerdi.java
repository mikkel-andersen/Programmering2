package Opgaver;

import java.util.List;

public class nulVaerdi {

    public static void main(String[] args) {

    }

    public static int nulVaerdi(List<Integer> list) {
        return nulVaerdi(list, 0, list.size() - 1);
    }

    public static int nulVaerdi(List<Integer> list, int l, int h) {
        int count = 0;
        if (l == h) {
            if (list.get(h) == 0) {
                count++;
            }
        } else {
            int m = (l + h) / 2;

            int sum1 = nulVaerdi(list, l, m);
            int sum2 = nulVaerdi(list, m + 1, h);
            count = sum1 + sum2;
        }
        return count;
    }
}
