package generics;

import java.util.Arrays;
import java.util.List;

public class Generics {

    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        printList(integerList);  // Prints: 1 2 3 4 5

        List<String> stringList = Arrays.asList("Hello", "World");
        printList(stringList);  // Prints: Hello World
    }
}
