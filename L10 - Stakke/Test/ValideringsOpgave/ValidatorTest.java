package ValideringsOpgave;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void test_validator_canValidateBrackets1() {
        //Arrange
        Validator validator = new Validator();
        String expression = "((5+3)*2+1)";
        //Act
        boolean result = validator.validateBrackets(expression);
        //Assert
        assertTrue(result);

    }

    @Test
    void test_validator_canValidateBrackets2() {
        //Arrange
        Validator validator = new Validator();
        String expression = "(23814)(5+3)*2+1)";
        //Act
        boolean result = validator.validateBrackets(expression);
        //Assert
        assertFalse(result);
    }

    @Test
    void test_validator_canValidateBrackets3() {
        //Arrange
        Validator validator = new Validator();
        String expression = "{()()[[{[]}]]}";
        //Act
        boolean result = validator.validateBrackets(expression);
        //Assert
        assertTrue(result);
    }
}