package Iterator;

import org.junit.jupiter.api.Test;

import java.util.ConcurrentModificationException;

import static org.junit.jupiter.api.Assertions.*;

class PersonCollectionTest {

    @Test
    void test_Iterator_next_returnsNext() {

        // Arrange
        PersonCollection personCollection = new PersonCollection();
        Person p1 = new Person("Anne");
        Person p2 = new Person("Bente");
        Person p3 = new Person("Caroline");
        personCollection.add(p1);
        personCollection.add(p2);
        personCollection.add(p3);
        PersonIterator iterator = personCollection.createIterator();

        // Act & Assert
        assertEquals(p1, iterator.next());
        assertEquals(p2, iterator.next());
        assertEquals(p3, iterator.next());
    }

    @Test
    void test_Iterator_next_throwsException() {

        // Arrange
        PersonCollection personCollection = new PersonCollection();
        Person p1 = new Person("Anne");
        Person p2 = new Person("Bente");
        Person p3 = new Person("Caroline");
        personCollection.add(p1);
        personCollection.add(p2);
        personCollection.add(p3);
        PersonIterator iterator = personCollection.createIterator();

        // Act & Assert
        iterator.next();
        iterator.next();
        iterator.next();
        assertThrows(ConcurrentModificationException.class, () -> {
            iterator.next();
        });
    }

    @Test
    void test_Iterator_hasNext_returnsTrueFalse() {

        // Arrange
        PersonCollection personCollection = new PersonCollection();
        Person p1 = new Person("Anne");
        Person p2 = new Person("Bente");
        Person p3 = new Person("Caroline");
        personCollection.add(p1);
        personCollection.add(p2);
        personCollection.add(p3);
        PersonIterator iterator = personCollection.createIterator();

        // Act & Assert
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertFalse(iterator.hasNext());
    }
}