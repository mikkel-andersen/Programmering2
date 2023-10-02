package opgave1;

import java.util.Arrays;
import java.util.HashSet;

public class AnvendMetoderPaaHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(34,12,23,45,67,34,98));

        System.out.println(set);

        set.add(23);

        System.out.println(set);

        set.remove(67);

        System.out.println(set);

        System.out.println(set.contains(23));

        System.out.println(set.size());

    }
}
