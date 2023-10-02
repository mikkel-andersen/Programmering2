package opgave1;

import java.util.Arrays;
import java.util.HashSet;

public class AnvendMetoderPaaHashSet {


    //        1) Tilføj til main erklæring og oprettelse af en mængde baseret på et HashSet.
//                Mængden skal indeholde heltal.
//        2) Indsæt tallene 34,12,23,45,67,34,98 i mængden.
//        3) Udskriv indholdet af mængden.
//        4) Indsæt tallet 23 i mængden.
//        5) Udskriv indholdet af mængden.
//        6) Fjern elementet 67 fra mængden.
//        7) Udskriv indholdet af mængden.
//        8) Undersøg om mængden indeholder elementet 23
//        9) Udskriv hvor mange elementer der er i mængden
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
