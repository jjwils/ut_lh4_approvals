package train.the.trainer.adapters.out;

import train.the.trainer.application.ports.out.Printer;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String output) {
        System.out.println("output");
    }
}
