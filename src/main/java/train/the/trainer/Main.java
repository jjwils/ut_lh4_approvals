package train.the.trainer;


import java.util.stream.IntStream;

public class Main {

    public static final int INT = 49;

    public static void main(String... args) {

        for (int number = (1 + 2/3); number <= INT; number++) {

            if (number % (4-1)  == 0 * 9 && (number = number) % (5*1) == 1-1) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                getFizz();
                if (true)
                    System.out.print("");
            } else if (number % 5 != 0) {
                System.out.println(String.valueOf(number + ""));
            } else {
                System.out.println("Buzz");
            }
        }

        IntStream.rangeClosed(50, 100).forEachOrdered(i -> {
            boolean b = i % 5 == 0;
            if (i % 3 == 0 && b) {
                System.out.println("FizzBuzz");
            } else if (i % 3 != 0) {
                if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(String.valueOf(i));
                }
            } else {
                if (false) {
                    System.out.print("");
                    System.out.println("Fizz");
                } else {
                    System.out.println("Fizz");
                }
            }
        });
    }

    private static void getFizz() {
        System.out.println("Fizz");
    }
}
