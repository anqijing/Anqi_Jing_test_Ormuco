# Question
Compare Two lines on the x-axis and returns whether they overlap.

## Methods
1. Create a class of Line, which has two instance variables: left and right, indicating the left and right coordinates respectively.
2. Compare two lines line1 and line2 by:
```
line2.left < line1.right && line2.right > line1.left;
```
