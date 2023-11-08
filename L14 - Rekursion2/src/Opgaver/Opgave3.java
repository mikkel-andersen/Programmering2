package Opgaver;

import java.util.ArrayList;

public class Opgave3 {

    public static void main(String[] args) {

    }


    public static boolean tal(ArrayList<Integer> list, int n) {
        return talHelper(list, n, list.get(0), list.get(list.size() - 1), list.get(0) + ((list.get(list.size() - 1) - list.get(0)) / 2));
    }

    public static boolean talHelper(ArrayList<Integer> list, int n, int low, int high, int mid) {

    }
}
