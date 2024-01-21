package Iterator;

import java.util.Iterator;

public class PersonIterator implements Iterator<Person> {

    private Person[] persons;
    private int index = 0;

    public PersonIterator(Person[] persons) {
        this.persons = persons;
    }


    @Override
    public boolean hasNext() {
        return index < persons.length && persons[index] != null;
        }

    @Override
    public Person next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("Ikke flere elementer");
        }
        Person nextPerson = persons[index];
        index++;
        return nextPerson;
    }
}
