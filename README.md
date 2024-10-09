# Learning Hour 4: Approvals Testing - Testing Behaviour not Implementation, safe refactoring

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


### Continue here

1. Use your new knowledge of approvals testing get 100% coverage of the existing codebase
2. Perform safe Refactoring using your approvals test regulary for feedback (you should be able to use entirely IDE refactorings/yellow light bulbs etc) to tidy the complete mess that is the codebase.
>Remember the defintion of a refactoring is a change to the internal structure of a program that does not change its
   observable behaviour.
>Note the code as it stands is currently in production and therefore "correct".
3. change the code to implement the updated spec below.  You could do this by putting your new expectation in the approved file, or working incrementally towards the soltuion like in step_1
```
Write a program that prints the numbers from 1 to 100, but...numbers that are exact multiples of 3, or that contain 3, must print a string containing "Fizz"
For example 9 -> "...Fizz..."
For example 31 -> "...Fizz..."```

numbers that are exact multiples of 5, or that contain 5, must print a string containing "Buzz"
For example 10 -> "...Buzz..."
For example 52 -> "...Buzz..."

numbers that meet both the above conditions must print a string containing "FizzBuzz"
```
