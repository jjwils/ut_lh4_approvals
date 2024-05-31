package train.the.trainer;

public class Program {
    private final Printer printer;

    public Program(Printer printer) {
        this.printer = printer;
    }

    public void printNumbers(int amountToPrint) {
        for (int i = 1; i <= amountToPrint; i++) {
            printer.print("x");
        }

    }
}
