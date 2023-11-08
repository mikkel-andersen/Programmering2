package Opgaver;

import Helper.HelperMethods;

import java.util.ArrayList;
import java.util.List;

public class Opgave1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 2, 2, 3, 4, 5, 6, 7));
        System.out.println(ligeTalHelper(list));
    }

    public static int ligeTal(ArrayList<Integer> list, int index) {
        if (index == list.size()) {
            return 0;
        } else {
            int currentElement = list.get(index);
            if (currentElement % 2 == 0) {
                return 1 + ligeTal(list, index + 1);
            } else {
                return ligeTal(list, index + 1);
            }
        }
    }

    public static int ligeTalHelper(ArrayList<Integer> list) {
        return ligeTal(list, 0);
    }
}
