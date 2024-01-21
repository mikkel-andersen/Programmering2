package Opgaver;

import java.util.ArrayList;

public class FletteSorteringHul {

    // den metode der saetter fletningen i gang
    public void fletteSort(ArrayList<Integer> list) {
        mergesort(list, 0, list.size() - 1);
    }

    // den rekursive metode der implementere del-loes og kombiner skabelonen
    private void mergesort(ArrayList<Integer> list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(list, l, m);
            mergesort(list, m + 1, h);
            merge(list, l, m, h);
        }
    }

    // kombiner er realiseret ved fletteskabelonen
    private void merge(ArrayList<Integer> list, int low, int middle, int high) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        int i1 = low;
        int i2 = middle + 1;
        // flet sålænge der er noget i begge lister

        while (i1 <= middle && i2 <= high) {
            if (list.get(i1) < list.get(i2)) {
        // s1's første tal er mindst
                temp.add(list.get(i1));
                System.out.println(temp);
                i1++;
            } else { // s2's første tal er mindst
                temp.add(list.get(i2));
                System.out.println(temp);
                i2++;
            }
        }
        // tøm den liste der ikke er tom
        while (i1 <= middle) {
            temp.add(list.get(i1));
            System.out.println(temp);
            i1++;
        }
        while (i2 <= high) {
            temp.add(list.get(i2));
            System.out.println(temp);
            i2++;
        }
        for (int i = 0; i < temp.size(); i++) {
            list.set(i + low, temp.get(i)); //Low er 0 jeg er ligeglad med hvad de siger
        }
    }
}
