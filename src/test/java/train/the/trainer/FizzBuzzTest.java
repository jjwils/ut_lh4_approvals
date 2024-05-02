package train.the.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzShould {

    @Test
    void return_all_the_correct_things() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.convert(15));
        assertEquals("Fizz", fizzBuzz.convert(3));
        assertEquals("Fizz", fizzBuzz.convert(33));


        assertEquals("Buzz", fizzBuzz.convert(5));

        assertEquals("1", fizzBuzz.convert(1));
    }
}