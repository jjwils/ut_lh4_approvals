package train.the.trainer.adapters;

import train.the.trainer.application.port.Printer;

 class ConsolePrinter implements Printer {
    @Override
     public void print(String output) {
        System.out.println(output);
    }
}
