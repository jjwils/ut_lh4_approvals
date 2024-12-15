package train.the.trainer;


public class Main {


        public static void main (String...args){
            System.out.println("OMGHAI!");

            Hotel[] hotels = new Hotel[] {
                    // this new hotel does not work properly yet
                    new Hotel("Rho Hotel", 20, 50) };

            FookingDotCom app = new FookingDotCom(hotels);

            for (int i = 0; i < 31; i++) {
                System.out.println("-------- day " + i + " --------");
                System.out.println("name, must sell in days, price");
                for (int j = 0; j < hotels.length; j++) {
                    System.out.println(hotels[j]);
                }
                System.out.println("");
                app.update();
            }
        }
    }


