package opgave2;
import java.util.List;

public class App {

    public static void main(String[] args) {


        Studerende s1 = new Studerende("S1", 1, List.of(12, 4, 7, 4, 2));
        Studerende s2 = new Studerende("S2", 2, List.of(12, 10, 7, 4, 10));
        Studerende s3 = new Studerende("S3", 3, List.of(12, 10, 7, 10, 10));
        Studerende s4 = new Studerende("S4", 4, List.of(12, 10, 10, 4, 2));

        Skole skole = new Skole("Skole", List.of(s1, s2, s3, s4));


        System.out.println(skole.gennemsnit());

        System.out.println(skole.findStuderende(4));

    }
}
