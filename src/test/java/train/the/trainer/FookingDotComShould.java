package train.the.trainer;

import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FookingDotComShould {

    @Test
    void approvalsTest(){

        ByteArrayOutputStream fakeoutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeoutput));

        Main.main();

        Approvals.verify(fakeoutput);
    }

    @Test
    void update_combination() {
        
        CombinationApprovals.verifyAllCombinations(this::doUpdate,
                new String[]{"MovenPick"},
                new Integer[]{10},
                new Integer[]{20 });

    }

    private String doUpdate(String hotelName, Integer sellOutIn, Integer price) {
        Hotel[] hotels = new Hotel[] { new Hotel(hotelName, sellOutIn, price) };
        FookingDotCom app = new FookingDotCom(hotels);
        app.update();

        Hotel hotel = hotels[0];
        return hotel.toString();
    }
}
