package train.the.trainer;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FookingDotComShould {

    @Test
    void approvalsTest(){

        ByteArrayOutputStream fakeoutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeoutput));

        Main.main();
        String output = fakeoutput.toString();

        Approvals.verify(output);
    }
}
