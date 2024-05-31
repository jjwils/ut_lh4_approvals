package train.the.trainer;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProgramShould {


    @Test
    void print_numbers(){

        TestDoublePrinter printer = new TestDoublePrinter();
        Program program = new Program(printer);

        program.printNumbers(2);

        assertEquals(2, printer.count());
    }
}
