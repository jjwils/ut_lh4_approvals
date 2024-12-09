# Introduction to approvals testing

Spec:  Write a program that lets you add items to a basket and print a specified number of copies of an itemised receipt with total price.

Sample output one copy:
```
Apple 0.99  
Orange 0.49  
-----------  
Total: 1.48
```
Sample output two copies:
```
Apple 0.99  
Orange 0.49  
----------- 
Total: 1.48

Apple 0.99  
Orange 0.49  
----------- 
Total: 1.48
```


## Step 1

## Start here

1.  Run all the tests in the ````test```` directory.  Everything should be green and passing.
2.  Now run ```Main```.  Is the program output matching the spec above when printing two copies of the receipt?  If not, why not?
3.  Run all the tests again this time with coverage.  What do you notice?  In particular with respect to the Hexagonal Architecture package structure.
4.  Let's iterate towards a complete solution by creating an automated acceptance test.  Add the following to the dependencies section in build.gradle
    ```testImplementation("com.approvaltests:approvaltests:24.9.0")```
5.  Add the following test in a new test class (give it an appropriate name) in the ```adapters.in``` package in the ```test``` directory:
```java
    @Test
    void print_two_copies_of_receipt() {

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
9. Run the test again.  What do you notice about the test result now?  Is it failing or passing?
10. Run all the tests in the test directory with coverage.  What has changed in the coverage metrics compared to earlier?
10. Find the `...approved.txt` file in the project folder and delete it.
11. Run the test again.  What do you notice?
12. Run the approvals test repeatedly to iteratively change the production code until the program output matches the specification.

