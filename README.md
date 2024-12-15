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

1. Run the tests with coverage.  Oh, nft...
2. Use your new knowledge of outside-in approvals testing to get 100% coverage of the existing codebase.
3. Run your test with coverage, what do you notice about line and branch coverage?
4. Refactor back to the previous hexagonal architecture using exclusively IDE automated refactorings look for the yellow light bulb).  Remember to run your approvals test regularly for feedback that you haven't regressed anything.
>Remember the definition of a refactoring is a change to the internal structure of a program while not changing its
observable behaviour.
