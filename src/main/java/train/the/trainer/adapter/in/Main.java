package train.the.trainer.adapter.in;

import train.the.trainer.application.WordGameService;
import train.the.trainer.adapter.out.ConsolePrinter;

public class Main {

    public static void main(String... args) {

        WordGameService wordGameService = new WordGameService(new ConsolePrinter());
        wordGameService.printNumbers(2);
    }
}
