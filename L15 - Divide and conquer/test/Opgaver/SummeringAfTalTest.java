package Opgaver;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SummeringAfTalTest {

    @org.junit.jupiter.api.Test
    void summeringAfListe_test1() {
        //Arrange
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        //Act
        int actualSum = SummeringAfTal.sum(numbers);

        //Assert
        assertEquals(10, actualSum);
    }

    @org.junit.jupiter.api.Test
    void summeringAfListe_test2() {
        //Arrange
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //Act
        int actualSum = SummeringAfTal.sum(numbers);

        //Assert
        assertEquals(15, actualSum);
    }
}