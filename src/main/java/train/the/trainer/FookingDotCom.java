package train.the.trainer;

public class FookingDotCom {

    Hotel[] hotels;

    public FookingDotCom(Hotel[] hotels) {
        this.hotels = hotels;
    }

    public void updateQuality() {
        for (int i = 0; i < hotels.length; i++) {
            if (!hotels[i].name.equals("Eden")
                    && !hotels[i].name.equals("Room Mate Aitana")) {
                if (hotels[i].price > 0) {
                    if (!hotels[i].name.equals("NH Leidseplein")) {
                        hotels[i].price = hotels[i].price - 1;
                    }
                }
            } else {
                if (hotels[i].price < 50) {
                    hotels[i].price = hotels[i].price + 1;

                    if (hotels[i].name.equals("Room Mate Aitana")) {
                        if (hotels[i].sellOutIn < 11) {
                            if (hotels[i].price < 50) {
                                hotels[i].price = hotels[i].price + 1;
                            }
                        }

                        if (hotels[i].sellOutIn < 6) {
                            if (hotels[i].price < 50) {
                                hotels[i].price = hotels[i].price + 1;
                            }
                        }
                    }
                }
            }

            if (!hotels[i].name.equals("NH Leidseplein")) {
                hotels[i].sellOutIn = hotels[i].sellOutIn - 1;
            }

            if (hotels[i].sellOutIn < 0) {
                if (!hotels[i].name.equals("Eden")) {
                    if (!hotels[i].name.equals("Room Mate Aitana")) {
                        if (hotels[i].price > 0) {
                            if (!hotels[i].name.equals("NH Leidseplein")) {
                                hotels[i].price = hotels[i].price - 1;
                            }
                        }
                    } else {
                        hotels[i].price = hotels[i].price - hotels[i].price;
                    }
                } else {
                    if (hotels[i].price < 50) {
                        hotels[i].price = hotels[i].price + 1;
                    }
                }
            }
        }
    }
}

