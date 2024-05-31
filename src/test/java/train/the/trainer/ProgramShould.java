package train.the.trainer;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProgramShould {


    @Test
    void print_numbers(){

        TestDoublePrinter testDoublePrinter = new TestDoublePrinter();
        Program program = new Program(testDoublePrinter);

        program.printNumbers(2);

        assertEquals(2, testDoublePrinter.count());
    }
}
