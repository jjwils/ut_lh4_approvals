# Learning Hour 4: Approvals Testing - Testing Behaviour not Implementation


## Spec
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


## Start here

1.  Run all the tests in the test directory.  Everything should be green and passing.
2.  Now run Main.  Is the program working correctly as per the Spec above?  If not, why not?
3.  Run all the tests again this time with coverage.  What do you notice?
4.  Let's create new test thats going to help us incrementally move towards a solution that has the behviour as described in the spec, aka BDD.  Add the following to the dependencies section in build.gradle
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
6.  Run the test.  You should be presented with a diff dialog between two files, one called `...received.txt` and once called `approved.txt`
7.  What do you notice about the contents of both files?
8. Accept the changes on the left so both files are now identical to `recieved.txt` and close the diff window
9. Run the test again.  What do you notice about the test now?
10. Run all the tests in the test directory with coverage.  What has changed in the coverage metrics compared to earlier?
10. Find the `...approved.txt` file in the project folder and delete it.
11. Run the test again.  What do you notice?
12. Run the approvals test repeatedly to iteratively change the production code until the program output matches the specification.
