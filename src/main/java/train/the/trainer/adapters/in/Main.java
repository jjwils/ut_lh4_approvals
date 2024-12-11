package train.the.trainer.adapters.in;

import train.the.trainer.application.WordGame;
import train.the.trainer.adapters.out.ConsolePrinter;

public class Main {

    public static void main(String... args) {

        WordGame wordGame = new WordGame(new ConsolePrinter());
        wordGame.printNumbers(2);
    }
}
