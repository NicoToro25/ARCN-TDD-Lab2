import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void testFizzBuzzReturnsNumber() {
        // Arange
        int input = 1;

        //Act
        String result = FizzBuzz.fizzbuzz(input);

        //Assert
        assertEquals("1", result);
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

    @Test
    void testFizzBuzzWhitZero() {
        //Arange
        int input = 0;

        //Act
        String result = FizzBuzz.fizzbuzz(input);

        //Assert
        assertEquals("0", result);
    }
}
