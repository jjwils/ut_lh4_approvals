package train.the.trainer;

public class Hotel {

    public String name;

    public int sellIn;

    public int qualityRating;

    public Hotel(String name, int sellIn, int qualityRating) {
        this.name = name;
        this.sellIn = sellIn;
        this.qualityRating = qualityRating;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.qualityRating;
    }
}


