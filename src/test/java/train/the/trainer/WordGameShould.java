package train.the.trainer;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;
import train.the.trainer.adapters.Main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WordGameShould {


    @Test
    void print_numbers_1_100(){

        //arrange
        ByteArrayOutputStream fakeoutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeoutput));

        //act
        Main.main();

        var output = fakeoutput.toString();


        //assert
        Approvals.verify(output);

    }
}
