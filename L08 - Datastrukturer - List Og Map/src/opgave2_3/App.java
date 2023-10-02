package opgave2_3;

import java.util.Arrays;
import java.util.HashSet;

public class App {

    public static void main(String[] args) {

        HashSet<Integer> k1 = new HashSet<>(Arrays.asList(12, 4, 7, 4, 2));
        HashSet<Integer> k2 = new HashSet<>(Arrays.asList(12, 10, 7, 4, 10));
        HashSet<Integer> k3 = new HashSet<>(Arrays.asList(12, 10, 7, 10, 10));
        HashSet<Integer> k4 = new HashSet<>(Arrays.asList(12, 10, 10, 4, 2));



        Studerende s1 = new Studerende("S1", 1, k1);
        Studerende s2 = new Studerende("S2", 2, k2);
        Studerende s3 = new Studerende("S3", 3, k3);
        Studerende s4 = new Studerende("S4", 4, k4);

        HashSet studerende = new HashSet<>(Arrays.asList(s1, s2, s3, s4));

        Skole skole = new Skole("Skole", studerende);


        System.out.println(skole.gennemsnit());

        System.out.println(skole.findStuderende(4));

    }
}
