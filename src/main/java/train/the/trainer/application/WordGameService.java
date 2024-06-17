package train.the.trainer.application;

import train.the.trainer.application.port.Printer;
import train.the.trainer.domain.FizzBuzz;

public class WordGameService {
    private final Printer printer;

     public WordGameService(Printer printer) {
        this.printer = printer;
    }

    public void printNumbers(int amountToPrint) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i = 1; i <= amountToPrint; i++) {
            printer.print(fizzBuzz.convert(i));
        }

    }
}
