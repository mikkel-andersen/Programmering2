package Søgning;

public class LinearSearch {

    public int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
