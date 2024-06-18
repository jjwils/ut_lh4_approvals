package train.the.trainer;

public class Hotel {

    public String name;

    public int sellOutIn;

    public int price;


    public Hotel(String name, int sellOutIn, int price) {
        this.name = name;
        this.sellOutIn = sellOutIn;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellOutIn + ", " + this.price;
    }
}


