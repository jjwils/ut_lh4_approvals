package train.the.trainer.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import train.the.trainer.adapters.out.TestDoublePrinter;
import train.the.trainer.application.domain.Product;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasketShould {

    public static final Product APPLE = new Product("Apple", new BigDecimal("0.99"));
    public static final Product ORANGE = new Product("Orange", new BigDecimal("0.49"));
    private Basket basket;

    @BeforeEach
    void setUp() {

        basket = new Basket(new TestDoublePrinter());

    }

    @Test
    void add_an_item(){

        basket.add(APPLE);

        assertEquals(1, basket.size());
        assertEquals(new BigDecimal("0.99"), basket.priceTotal());

    }

    @Test
    void be_empty(){
        assertEquals(0, basket.size());
        assertEquals(new BigDecimal("0.00"), basket.priceTotal());

    }

    @Test
    void remove_an_item(){
        basket.add(APPLE);
        basket.remove("Apple");

        assertEquals(0, basket.size());
        assertEquals(new BigDecimal("0.00"), basket.priceTotal());

    }

    @Test
    void return_the_contents(){

        basket.add(APPLE);
        basket.add(ORANGE);

        assertTrue(basket.contents().contains(APPLE));
        assertTrue(basket.contents().contains(ORANGE));


    }


    @Test
    void return_the_price_total_for_two_of_the_same_item() {

        basket.add(APPLE);
        basket.add(APPLE);

        assertEquals(new BigDecimal("1.98"), basket.priceTotal());

    }

    @Test
    void return_the_price_total_for_two_items_with_different_prices() {

        basket.add(APPLE);
        basket.add(ORANGE);

        assertEquals(new BigDecimal("1.48"), basket.priceTotal());

    }

    @Test
    void return_the_price_total_for_two_items_with_different_prices_after_one_is_removed() {

        basket.add(APPLE);
        basket.add(ORANGE);
        basket.remove("Orange");

        assertEquals(new BigDecimal("0.99"), basket.priceTotal());

    }

    @Test
    void print_receipts(){

        //given
        TestDoublePrinter printer = new TestDoublePrinter();
        Basket basket = new Basket(printer);

        //when
        basket.printReceipt(2);

        //then
        assertEquals(2, printer.count());
    }
}
