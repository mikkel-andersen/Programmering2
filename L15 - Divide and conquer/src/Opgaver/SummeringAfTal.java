package Opgaver;

import java.util.ArrayList;
import java.util.List;

public class SummeringAfTal {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 9, 10, 9));
        System.out.println(sum(list));
    }

    public static int sum(List<Integer> list) {
        return summeringAfListe(list, 0, list.size() - 1);
    }

    public static int summeringAfListe(List<Integer> list, int l, int h) {
        if (l == h) {
            return list.get(h);
        } else {
            int m = (l + h) / 2;
            int sum1 = summeringAfListe(list, l, m);
            int sum2 = summeringAfListe(list, m + 1, h);
            return sum1 + sum2;
        }


    }
}
