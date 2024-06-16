package train.the.trainer;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class ApprovalsTest {

    @Test
    void given_1_then_return_1(){

        Approvals.verify(Main.fizzBuzzPlus(1,1));
    }


    @Test
    void given_3_then_return_fizz(){

        Approvals.verify(Main.fizzBuzzPlus(3,3));
    }

}
