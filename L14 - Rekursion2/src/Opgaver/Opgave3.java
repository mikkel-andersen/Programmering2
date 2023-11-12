package Opgaver;

import java.util.ArrayList;
import java.util.List;

public class Opgave3 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println(tal(list, 12));
    }


    public static boolean tal(ArrayList<Integer> list, int n) {
        return talHelper(list, n, list.get(0), list.get(list.size() - 1), list.get(0) + ((list.get(list.size() - 1) - list.get(0)) / 2));
    }

    public static boolean talHelper(ArrayList<Integer> list, int n, int low, int high, int mid) {

        if (low == high) {
            return false;
        }

        if (list.get(mid) == n) {
            return true;
        } else if (list.get(mid) > n) {
            return talHelper(list, n, low, mid, low + ((mid - low) / 2));
        } else {
            return talHelper(list, n, mid, high, mid + ((high - mid) / 2));
        }


    }
}
