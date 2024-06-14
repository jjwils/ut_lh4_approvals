package train.the.trainer.domain;

import train.the.trainer.application.port.Printer;

public class ApprovalsPrinter implements Printer {

    private String output;

    @Override
    public void print(String output) {
        this.output += output;
    }

    String output(){
        return output;
    }
}
