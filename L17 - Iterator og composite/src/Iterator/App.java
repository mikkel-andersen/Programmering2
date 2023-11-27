package Iterator;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        PersonCollection personCollection = new PersonCollection();
        personCollection.add(new Person("Mikkel"));
        personCollection.add(new Person("Mazza"));
        personCollection.add(new Person("Tully"));

        PersonIterator it = personCollection.createIterator();
        System.out.println(it.hasNext());
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(it.hasNext());
    }
}
