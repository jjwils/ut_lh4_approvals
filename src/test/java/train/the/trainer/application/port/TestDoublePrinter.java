package train.the.trainer.application.port;

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
