package train.the.trainer;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;
import train.the.trainer.adapter.in.Main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WordGameShould {

        @Test
        public void print_fizzBuzz_1_to_100() {

            ByteArrayOutputStream fakeoutput = new ByteArrayOutputStream();
            System.setOut(new PrintStream(fakeoutput));

            Main.main();
            String output = fakeoutput.toString();

            Approvals.verify(output);
        }
    }

