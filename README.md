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


## Step 2

### Continue here

1. Run the tests.  Oh, nft...
2. Use your new knowledge of outside-in approvals testing to get 100% coverage of the existing codebase
2. Perform safe Refactoring using your approvals test regularly for feedback (you should be able to use almost entirely IDE automated refactorings/yellow light bulbs etc) to tidy the complete mess that is the codebase.
>Remember the definition of a refactoring is a change to the internal structure of a program that does not change its
observable behaviour.
>Note the code as it stands is currently in production and therefore "correct".
3. Change the code to add the ability to remove items from the basket.  An updated sample output is below.  You could do this by putting your new expectation in the approved file, or working incrementally towards the soltuion like in step_1

Sample output one apple, one orange:
```
Apple 0.99  x1
Orange 0.49 x1 
-----------  
Total: 1.48
```
Sample output two apples, one orange:
```
Apple 0.99  x2 
Orange 0.49 x1 
----------- 
Total: 2.47
```

