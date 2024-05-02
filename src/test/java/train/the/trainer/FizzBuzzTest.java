package train.the.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
    }

}