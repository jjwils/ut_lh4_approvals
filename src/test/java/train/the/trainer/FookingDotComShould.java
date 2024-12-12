package train.the.trainer;

import org.approvaltests.Approvals;
import org.approvaltests.core.Options;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FookingDotComShould {

    @Test
    void approvalsTest(){

        ByteArrayOutputStream fakeoutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeoutput));

        Main.main();
        String output = fakeoutput.toString();

        Approvals.verify(output);
    }

    @Test
    void update_the_movenpick_hotel() {
        var expected = """
            MovenPick, 9, 19
            """;
        Hotel movenPick = new Hotel("MovenPick", 10, 20);
        verifyNextDaysPrice(movenPick, expected);
        
    }
    
    @Test
    void update_the_eden_hotel() {
        var expected = """
            Eden, 1, 1
            """;
        Hotel eden = new Hotel("Eden", 2, 0);
        verifyNextDaysPrice(eden, expected);
    }
    
    @Test
    void update_the_mister_highland_hotel() {
        Hotel misterHighland = new Hotel("Mister Highland", 5, 7);
        verifyNextDaysPrice(misterHighland, "");
    }

    @Test
    void update_the_nh_leidseplein_hotel() {
        Hotel nhLeidseplein = new Hotel("NH Leidseplein", 0, 80);
        verifyNextDaysPrice(nhLeidseplein, "");
    }
    @Test
    void update_the_room_mate_aitana_hotel() {
        Hotel roomMateAitana = new Hotel("Room Mate Aitana", 15, 20);
        verifyNextDaysPrice(roomMateAitana, "");
    }

   

    private static void verifyNextDaysPrice(Hotel movenPick, String expected) {
        Hotel[] hotels = new Hotel[] {movenPick};
        FookingDotCom app = new FookingDotCom(hotels);

        app.update();
        
        Approvals.verify(hotels[0], new Options().inline(expected));
    }
}
