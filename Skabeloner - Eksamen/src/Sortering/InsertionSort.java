package Sortering;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {10, 8,3,5,1,6,7,9,2};
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void insertionSort(int[] list) {
        // Løb usorteret del af liste igennem
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            // Skub sorterede elementer en op
            int j = i;
            boolean found = false;
            while (!found && j > 0) {
                if (currentElement >= list[j - 1]) {
                    found = true;
                } else {
                    list[j] = list[j - 1];
                    j--;
                }
            }
            // Indsæt currentElement på sin plads
            list[j] = currentElement;
        }
    }
}
