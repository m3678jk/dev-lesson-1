# dev-lesson-1
Task:
Write an application based on below info:

Grocery store app. Each product in the store has its own price. 
There are also products for which a promotional price for N quantities is provided. 
For example, 1 apple costs $1, 6 apples cost $5. Each product has its own code - a letter of the English alphabet.

Calculate the cost of the basket, taking into account discounts.

At the moment, the "warehouse" of the store and prices are as follows:

Product   Price (for 1 piece)   Promotional Qty   Promotion price
A /       1.25/                 3/                  3.00
B /       4.25/                 -/                   -
C /       1.00/                 6/                 5.00
D /       0.75/                 -/                  -

 
Technical requirements:

The use of the database is optional, you can store data in any form convenient for you
Features of internal implementation - at the discretion of the student
At the output, we expect to get a method that can be called from main, 
pass a string with “basket” there, and which will return the cost of this basket.

Example:
calculateTotalCost(" ABCDABA") return 13.25 (3*A - 3.00 stock, 2*B = 8.50, 1*C = 1.00, 1*D = 0.75 => 3 + 8.5 + 1 + 0.75 = 13.25)

Cover the application with tests
Push the project to a Git repository (whatever you use), 
add your mentor as a contributor (so he can push commits to your project). 
Specify the mentor's email through your communication channel.


 
How will homework be checked?
The mentor can:
leave comments with notes on the structure of the program, class names, method, etc.
leave comments with recommendations for improving the solution algorithm

(!) upload your changes to the code that do not “break” the tests (that is, the mentor cannot change the test, in which at least 1 occurs)
run the program with any test data

Task: do not let "break" the calculations that your program makes. 
This can be done only with the help of tests that cannot change the mentor (only leave comments related to the cleanliness of the code).
