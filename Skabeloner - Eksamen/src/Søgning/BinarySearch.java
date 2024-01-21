package Søgning;

public class BinarySearch {
    // Binary search

    public int binarySearch(int[] arr, int key) {
            /** Use binary search to find the key in the list */
            int low = 0;
            int high = arr.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (key == arr[mid]) {
                    return mid;
                }
                else if (key > arr[mid]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        return -1;
        }
    }

