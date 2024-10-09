package train.the.trainer.adapter.in;

import train.the.trainer.application.WordGame;
import train.the.trainer.adapter.out.ConsolePrinter;

public class Main {

    public static void main(String... args) {

        WordGame wordGame = new WordGame(new ConsolePrinter());
        wordGame.printNumbers(100);
    }
}
