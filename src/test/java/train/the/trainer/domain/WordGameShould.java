package train.the.trainer.domain;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;
import train.the.trainer.adapter.out.ConsolePrinter;
import train.the.trainer.application.WordGameService;
import train.the.trainer.domain.application.port.TestDoublePrinter;

public class WordGameShould {


    @Test
    void print_fizzBuzz_1_to_100(){

        ApprovalsPrinter approvalsPrinter = new ApprovalsPrinter();
        WordGameService wordGameService = new WordGameService(approvalsPrinter);
        wordGameService.printNumbers(100);

        Approvals.verify(approvalsPrinter.output());
    }
}
