package train.the.trainer;

public class TestDoublePrinter implements Printer {

    private int count = 0;

    @Override
    public void print(String output) {
        count++;

    }

    public int count() {
        return count;
    }
}
