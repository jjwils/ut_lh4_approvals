package train.the.trainer;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProgramShould {


    @Test
    void print(){

        Printer printer = new Printer();
        Program program = new Program(printer);

        program.print("1");

        assertEquals("1", printer.printed());
    }
}
