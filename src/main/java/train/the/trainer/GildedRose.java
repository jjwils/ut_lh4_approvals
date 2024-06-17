package train.the.trainer;

public class GildedRose {

    Hotel[] hotels;

    public GildedRose(Hotel[] hotels) {
        this.hotels = hotels;
    }

    public void updateQuality() {
        for (int i = 0; i < hotels.length; i++) {
            if (!hotels[i].name.equals("Eden")
                    && !hotels[i].name.equals("Room Mate Aitana")) {
                if (hotels[i].qualityRating > 0) {
                    if (!hotels[i].name.equals("NH Leidseplein")) {
                        hotels[i].qualityRating = hotels[i].qualityRating - 1;
                    }
                }
            } else {
                if (hotels[i].qualityRating < 50) {
                    hotels[i].qualityRating = hotels[i].qualityRating + 1;

                    if (hotels[i].name.equals("Room Mate Aitana")) {
                        if (hotels[i].sellIn < 11) {
                            if (hotels[i].qualityRating < 50) {
                                hotels[i].qualityRating = hotels[i].qualityRating + 1;
                            }
                        }

                        if (hotels[i].sellIn < 6) {
                            if (hotels[i].qualityRating < 50) {
                                hotels[i].qualityRating = hotels[i].qualityRating + 1;
                            }
                        }
                    }
                }
            }

            if (!hotels[i].name.equals("NH Leidseplein")) {
                hotels[i].sellIn = hotels[i].sellIn - 1;
            }

            if (hotels[i].sellIn < 0) {
                if (!hotels[i].name.equals("Eden")) {
                    if (!hotels[i].name.equals("Room Mate Aitana")) {
                        if (hotels[i].qualityRating > 0) {
                            if (!hotels[i].name.equals("NH Leidseplein")) {
                                hotels[i].qualityRating = hotels[i].qualityRating - 1;
                            }
                        }
                    } else {
                        hotels[i].qualityRating = hotels[i].qualityRating - hotels[i].qualityRating;
                    }
                } else {
                    if (hotels[i].qualityRating < 50) {
                        hotels[i].qualityRating = hotels[i].qualityRating + 1;
                    }
                }
            }
        }
    }
}

