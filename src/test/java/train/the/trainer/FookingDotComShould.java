package train.the.trainer;

import org.approvaltests.Approvals;
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

        Hotel[] hotels = new Hotel[] {new Hotel("MovenPick", 10, 20)};
        FookingDotCom app = new FookingDotCom(hotels);

        app.update();

        assertEquals("MovenPick", hotels[0].name);
        assertEquals(9, hotels[0].sellOutIn);
        assertEquals(19, hotels[0].price);


    }
}
