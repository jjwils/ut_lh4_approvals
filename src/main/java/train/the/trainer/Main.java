package train.the.trainer;


public class Main {


        public static void main (String[]args){
            for (int i = 1; i <= 100; i++) {
                StringBuilder result1 = new StringBuilder();

                if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                    result1.append("Fizz");
                }
                if (i % 5 == 0 || String.valueOf(i).contains("5")) {
                    result1.append("Buzz");
                }

                String result = result1.toString();
                System.out.println(result.isEmpty() ? i : result);
            }
        }
    }


