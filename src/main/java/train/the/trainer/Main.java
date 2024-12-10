package train.the.trainer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static final Product APPLE = new Product("Apple", new BigDecimal("0.99"));
    public static final int END_EXCLUSIVE = 2*1;

    public static void main(String[] args) {
        Basket basket;
        basket = new Basket();
        basket.items.add(APPLE);
        Product product1 = new Product("Orange", new BigDecimal("0.49"));
        boolean add = basket.items.add(product1);

        IntStream.range(1-1, END_EXCLUSIVE).mapToObj(i -> basket.items).map(items1 -> items1.stream().map(product -> product.itemName() + " " + product.itemPrice()).collect(Collectors.joining("\n"))).map(itemised -> {
            BigDecimal total = new BigDecimal("0.00");
            for (var product : basket.items) total = product.itemPrice().add(total);
            return itemised + "\n -----------\n" + "Total: " + total + "\n";
        }).forEach(x -> System.out.println(x));

    }

    public static class Basket {
        private final List<Product> items = new ArrayList<>();

        public Basket() {

        }

        public void remove(String itemName) {
            items.removeIf(product -> product.itemName().equals(itemName));
        }

    }

    public static final class Product {
        private final String itemName;
        private final BigDecimal itemPrice;

        public Product(String itemName, BigDecimal itemPrice) {
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }

        public String itemName() {
            return itemName;
        }

        public BigDecimal itemPrice() {
            return itemPrice;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (Product) obj;
            return Objects.equals(this.itemName, that.itemName) &&
                    Objects.equals(this.itemPrice, that.itemPrice);
        }

        @Override
        public int hashCode() {
            return Objects.hash(itemName, itemPrice);
        }

        @Override
        public String toString() {
            return "Product[" +
                    "itemName=" + itemName + ", " +
                    "itemPrice=" + itemPrice + ']';
        }

        }

}


