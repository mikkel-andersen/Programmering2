package Opgaver;

import java.util.ArrayList;
import java.util.List;

public class Opgave3 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println(tal(list, 7));
    }


    public static boolean tal(ArrayList<Integer> list, int n) {
        return talHelper(list, n, list.get(0), list.get(list.size() - 1), list.get(0) + ((list.get(list.size() - 1) - list.get(0)) / 2));
    }

    public static boolean talHelper(ArrayList<Integer> list, int n, int low, int high, int mid) {
        int mLow = low;
        int mhigh = high;
        int mmid = mid;
        if (list.get(mid) == n) {
            return true;
        } else if (list.get(mid) > n) {
            mhigh = mid;
            mmid = low + (high - low) / 2;
            return talHelper(list, n, mLow, mhigh, mmid);
        } else {
            mLow = mid;
            mmid = low + (high - low) / 2;
            return talHelper(list, n, mLow, mmid, mhigh);
        }
    }
}
