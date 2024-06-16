package train.the.trainer;

import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ApprovalsTest {

    @Test
    void given_1_then_return_1(){

        int number = 1;
       // Approvals.verify(fizzBuzzWith(number));
        CombinationApprovals.verifyAllCombinations(Main::fizzBuzzPlus, new Integer[] {number, 2, 3, 5, 53, 15, 150}, new Integer[] {number, 2, 3, 5, 53, 15, 150});
    }

    @Test
    public void FizzBuzz() {

        ByteArrayOutputStream fakeoutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeoutput));

        Main.main();
        String output = fakeoutput.toString();

        Approvals.verify(output);
    }
}
