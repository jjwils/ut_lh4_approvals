package train.the.trainer.domain;

import org.junit.jupiter.api.Test;
import train.the.trainer.application.WordGameService;
import train.the.trainer.domain.application.port.TestDoublePrinter;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordGameServiceShould {


    @Test
    void print_numbers(){

        TestDoublePrinter testDoublePrinter = new TestDoublePrinter();
        WordGameService wordGameService = new WordGameService(testDoublePrinter);

        wordGameService.printNumbers(2);

        assertEquals(2, testDoublePrinter.count());
    }
}
