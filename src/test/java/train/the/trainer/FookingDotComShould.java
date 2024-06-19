package train.the.trainer;

import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FookingDotComShould {

    @Test
    void update_all_sell_by_and_prices(){

        ByteArrayOutputStream fakeoutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeoutput));

        Main.main();
        String output = fakeoutput.toString();

        Approvals.verify(output);
    }

    @Test
    public void update_the_eden_hotel() {

        Hotel[] hotels = new Hotel[] { new Hotel("Eden", 10, 1) };
        FookingDotCom app = new FookingDotCom(hotels);
        app.update();

        Approvals.verify(hotels[0]);

    }

    @Test
    public void update_the_combinbations() {

        String hotelName = "Eden";
        int sellOutIn = 10;
        int price = 1;

        doUpdate(hotelName, sellOutIn, price);

        CombinationApprovals.verifyAllCombinations(this::doUpdate,
                new String[]{hotelName, "Room Mate Aitana"},
                new Integer[]{sellOutIn, 5},
                new Integer[]{price, 60});

    }

    private String doUpdate(String hotelName, Integer sellOutIn, Integer price) {
        Hotel[] hotels = new Hotel[] { new Hotel(hotelName, sellOutIn, price) };
        FookingDotCom app = new FookingDotCom(hotels);
        app.update();

        Hotel hotel = hotels[0];
        return hotel.toString();
    }
}
