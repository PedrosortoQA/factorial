#Author: pedrosorto.91@gmail.com
#Keywords Summary : Test the maximun coverage through the Equivalence, borders and partitions for the factorial
#Background: Defined in the Before in Stepfile
## (Comments: )
@tag
Feature: Test Factorial Equivalence and boundary values,  Feature

  
 Scenario Outline: Check the Equivalence values for the factorial feature
   Given User navigates to the factorial app site
   And User Enter the <number> in the number textbox
   When User click on the Calculate!
   Then User compare the <result> 
   
   Examples: 
     | number | result  |
     |     -1  | "The factorial of -1 is: incalculable" |
     |     0  | "The factorial of 0 is: 1" |
     |     1  | "The factorial of 1 is: 1" |
     |     5  | "The factorial of 5 is: 120" |
     |     10 | "The factorial of 10 is: 3628800" |
     |     100 | "The factorial of 100 is: 9.332621544394415e+157" |
     |     170 | "The factorial of 170 is: 7.257415615307999e+306" |
     |     171 | "The factorial of 171 is: Infinity" |
     |     1000 | "The factorial of 1000 is: Infinity" |
