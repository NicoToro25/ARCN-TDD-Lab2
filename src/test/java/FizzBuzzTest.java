import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void testFizzBuzzReturnsNumber() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }

    @Test
    void testFizzBuzzMultiplyBy3() {
        // Arange
        int input = 3;

        //Act
        String result = FizzBuzz.fizzbuzz(input);

        //Assert
        assertEquals("Fizz", result);
    }

    @Test
    void testFizzBuzzMultiplyBy5() {
        // Arange
        int input = 5;

        //Act
        String result = FizzBuzz.fizzbuzz(input);

        //Assert
        assertEquals("Buzz", result);
    }

    @Test
    void testFizzBuzzMultiplyBy3And5() {
        // Arange
        int input = 15;

        //Act
        String result = FizzBuzz.fizzbuzz(input);

        //Assert
        assertEquals("FizzBuzz", result);
    }

    @Test testFizzBuzzMultiplyByOtherNumbers() {
        assertEquals("0", FizzBuzz.fizzbuzz(0));
    }
}
