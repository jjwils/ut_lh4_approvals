package train.the.trainer.adapters.in;

import train.the.trainer.adapters.out.ConsolePrinter;
import train.the.trainer.application.Basket;
import train.the.trainer.application.domain.Product;

import java.math.BigDecimal;

public class Main {

    public static void main(String[]... args) {
        Basket basket = new Basket(new ConsolePrinter());
        basket.add(new Product("Apple", new BigDecimal("0.99")));
        basket.add(new Product("Orange", new BigDecimal("0.49")));

        basket.printReceipt(2);

    }
}
