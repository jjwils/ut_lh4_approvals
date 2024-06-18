package train.the.trainer;


public class Main {


        public static void main (String[]args){
            System.out.println("OMGHAI!");

            Hotel[] hotels = new Hotel[] {
                    new Hotel("MovenPick", 10, 20),
                    new Hotel("Eden", 2, 0),
                    new Hotel("Mister Highland", 5, 7),
                    new Hotel("NH Leidseplein", 0, 80),
                    new Hotel("NH Leidseplein", -1, 80),
                    new Hotel("Room Mate Aitana", 15, 20),
                    new Hotel("Room Mate Aitana", 10, 49),
                    new Hotel("Room Mate Aitana", 5, 49),
                    // this hotel does not work properly yet
                    new Hotel("Rho Hotel", 3, 6) };

            FookingDotCom app = new FookingDotCom(hotels);

            for (int i = 0; i < 31; i++) {
                System.out.println("-------- day " + i + " --------");
                System.out.println("name, must sell in, quality rating");
                for (int j = 0; j < hotels.length; j++) {
                    System.out.println(hotels[j]);
                }
                System.out.println("");
                app.updateQuality();
            }
        }
    }


