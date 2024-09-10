# Learning Hour 4: Approvals Testing - Testing Behaviour not Implementation

Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

Sample output:

1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
... etc up to 100


New PM requirement incoming ----

Write a program that prints the numbers from 1 to 100, but...

numbers that are exact multiples of 3, or that contain 3, must print a string containing "Fizz"
For example 9 -> "...Fizz..."
For example 31 -> "...Fizz..."

numbers that are exact multiples of 5, or that contain 5, must print a string containing "Buzz"
For example 10 -> "...Buzz..."
For example 52 -> "...Buzz..."

## Step 1

1.  Run all the tests in the test directory.  Everything should be green and passing.
2.  Now run Main.  Is the program working correctly?  If not, why not?
3.  Run all the tests again this time with coverage.  What do you notice?
4.  Let's create an acceptance test.  Add the following to the dependencies section in build.gradle
```testImplementation("com.approvaltests:approvaltests:24.2.0")```
5.  Add the following test to WordGameShould 
```java
    @Test
    void print_numbers_1_100(){

        //arrange
        ByteArrayOutputStream fakeOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeOutput));

        //act
        Main.main();
        
        //assert
        Approvals.verify(fakeOutput.toString());
        
    }
```

