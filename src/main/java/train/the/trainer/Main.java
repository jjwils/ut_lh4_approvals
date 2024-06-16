package train.the.trainer;


public class Main {


    private static Object output;

    public static void main (String[]args){
            fizzBuzzPlus(1, 100);
        }

     static String fizzBuzzPlus(int start, int stop) {
        for (int i = start; i <= stop; i++) {
            StringBuilder result1 = new StringBuilder();

            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                result1.append("Fizz");
            }
            if (i % 5 == 0 || String.valueOf(i).contains("5")) {
                result1.append("Buzz");
            }

            String result = result1.toString();
            output = result.isEmpty() ? i : result;
            System.out.println(output);
        }
        return output.toString();
    }
}


