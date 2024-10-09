package train.the.trainer.application;

import train.the.trainer.application.port.Printer;
import train.the.trainer.domain.FizzBuzz;

public class WordGame {
    private final Printer printer;

    public WordGame(Printer printer) {
        this.printer = printer;
    }

    public void printNumbers(int amountToPrint) {
        for (int i = 1; i <= amountToPrint; i++) {
            printer.print(new FizzBuzz().convert(i));
        }

    }
}
