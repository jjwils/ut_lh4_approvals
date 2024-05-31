package train.the.trainer;

public class TestDoublePrinter implements Printer {

    private String printed = "";

    public String printed() {
        return printed;
    }

    @Override
    public void print(String output) {
        printed = output;

    }
}
