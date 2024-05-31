package train.the.trainer;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProgramShould {


    @Test
    void print_numbers(){

        Printer printer = new Printer();
        Program program = new Program();

        program.printNumbers(2);

        assertEquals(2, printer.count());
    }
}
