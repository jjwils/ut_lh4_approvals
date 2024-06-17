package train.the.trainer.adapters;

import train.the.trainer.application.WordGameService;

public class Main {

    public static void main(String... args) {

        WordGameService wordGameService = new WordGameService(new ConsolePrinter());
        wordGameService.printNumbers(100);
    }
}
