package train.the.trainer.adapter.out;

import train.the.trainer.application.port.Printer;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String output) {
        System.out.println(output);
    }
}
