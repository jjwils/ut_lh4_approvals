package train.the.trainer;

import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
     void update_the_movenpick_hotel() {

        Hotel movenPick = new Hotel("MovenPick", 10, 20);
        Hotel[] hotels = new Hotel[] {movenPick};
        FookingDotCom app = new FookingDotCom(hotels);

        app.update();

        assertEquals("MovenPick", hotels[0].name);
        assertEquals(9, hotels[0].sellOutIn);
        assertEquals(19, hotels[0].price);


    }

    @Test
     void update_movenpick_and_room_mate_aitana_hotels() {

        String hotelName = "MovenPick";
        int sellOutIn = 10;
        int price = 20;

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
