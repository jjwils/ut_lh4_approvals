package train.the.trainer.application;

import org.junit.jupiter.api.Test;
import train.the.trainer.application.port.TestDoublePrinter;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordGameShould {


    @Test
    void print_numbers(){

        TestDoublePrinter testDoublePrinter = new TestDoublePrinter();
        WordGame wordGame = new WordGame(testDoublePrinter);

        wordGame.printNumbers(2);

        assertEquals(2, testDoublePrinter.count());
    }
}
