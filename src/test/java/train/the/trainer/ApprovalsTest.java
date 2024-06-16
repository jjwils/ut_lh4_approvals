package train.the.trainer;

import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

public class ApprovalsTest {

    @Test
    void given_1_then_return_1(){

        int number = 1;
       // Approvals.verify(fizzBuzzWith(number));
        CombinationApprovals.verifyAllCombinations(this::fizzBuzzWith, new Integer[] {number, 2, 3, 5, 53, 15, 150});
    }

    private String fizzBuzzWith(Integer number) {
        return Main.fizzBuzzPlus(number, number).trim();
    }


}
