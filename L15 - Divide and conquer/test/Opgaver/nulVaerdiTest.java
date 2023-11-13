package Opgaver;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class nulVaerdiTest {

    @Test
    void nulVaerdi() {
        //Assert
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(2);
        numbers.add(0);
        numbers.add(4);
        numbers.add(8);

        //Act
        int count = nulVaerdi.nulVaerdi(numbers);

        assertEquals(2, count);
    }
}