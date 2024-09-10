package train.the.trainer.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzShould  {

    @ParameterizedTest
    @CsvSource({
            "1, '1'",
            "2, '2'",
            "3, 'Fizz'",
            "6, 'Fizz'",
            "5, 'Buzz'",
            "10, 'Buzz'",
            "15, 'FizzBuzz'",
            "30, 'FizzBuzz'"
    })
    void convert_correctly(int input, String expectedOutput) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expectedOutput, fizzBuzz.convert(input));
    }
}