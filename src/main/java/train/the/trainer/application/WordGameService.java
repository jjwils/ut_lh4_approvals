package train.the.trainer.application;

import train.the.trainer.application.port.Printer;

public class WordGameService {
    private final Printer printer;

    public WordGameService(Printer printer) {
        this.printer = printer;
    }

    public void printNumbers(int amountToPrint) {
        for (int i = 1; i <= amountToPrint; i++) {
            printer.print("x");
        }

    }
}
