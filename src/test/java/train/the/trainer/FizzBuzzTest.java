package train.the.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void return_1_given_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.convert(1);
        assertEquals("1", actual);
    }

    @Test
    void return_2_given_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.convert(2);
        assertEquals("2", actual);
    }

    @Test
    void return_fizz_given_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.convert(3);
        assertEquals("Fizz", actual);
    }

    @Test
    void return_fizz_given_6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.convert(6);
        assertEquals("Fizz", actual);
    }

    @Test
    void return_buzz_given_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.convert(5);
        assertEquals("Buzz", actual);
    }

    @Test
    void return_buzz_given_10() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.convert(10);
        assertEquals("Buzz", actual);
    }

    @Test
    void return_fizzbuzz_given_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.convert(15);
        assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }

    @Test
    void return_fizzbuzz_given_30() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.convert(30);
        assertEquals("FizzBuzz", fizzBuzz.convert(30));
    }

}