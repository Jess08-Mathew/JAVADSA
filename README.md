<h1>Top K Frequency</h1>
<p>Frequency Analyzer
Overview
The Frequency Analyzer is a Java program that analyzes an array of integers to identify the top K numbers with the highest occurrences. It prioritizes numbers based on their frequency, and in the case of ties, it selects the larger number. The results are presented in descending order of their frequencies.

Features
Static Variable: Stores the input array of integers.
Static Method: Implements frequency analysis and sorting logic to determine the top K numbers.
Sorting Logic: Ensures that numbers are sorted by frequency first, then by value in descending order.
Usage
To use the program, set the static array numbers with your desired integers and call the findTopKFrequentNumbers(K) method with a positive integer K to retrieve the top K frequent numbers.

Example
Given the input array {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9} and K = 4, the output will be 5 11 7 10, reflecting their frequencies.</p>
  <h1>Share Trader<h1>
<p>Explanation of the Code
Class and Static Variables:

The class is named ShareTrader.
maxProfit is a static variable that holds the maximum profit from the transactions.
Method findMaxProfit:

The method takes an array of prices as input.
It checks if there are enough prices to make transactions.
It initializes four variables to track profits:
firstBuy: Maximum profit after the first buy.
firstSell: Maximum profit after the first sell.
secondBuy: Maximum profit after the second buy.
secondSell: Maximum profit after the second sell.
Loop Through Prices:

For each price, it updates the values for firstBuy, firstSell, secondBuy, and secondSell based on the maximum profit calculations.
The logic follows that if you can buy at a lower price and sell at a higher price, you update the profits accordingly.
Final Output:

After iterating through all prices, it prints the maximum profit.
Test Cases:

Several test cases are included in the main method to demonstrate the functionality.
Conclusion
This code efficiently calculates the maximum profit a trader can achieve with up to two transactions, ensuring that the second transaction can only occur after the first is completed. You can modify or add more test cases as needed!</p>

  
</h1>PayRoll System</h1>
<p># Employee Payroll System

## Overview
The Employee Payroll System is a Java application designed to manage various employee roles within CHRIST (Deemed to be University). This system efficiently handles different payment structures for employees, providing functionalities such as salary calculation, bonus computation, and payroll tracking.

## Features
- **Employee Types**: Supports multiple employee roles, including:
  - Hourly Employees
  - Salaried Employees
  - Executive Employees
- **Salary Calculation**:
  - Hourly Employees' weekly earnings calculated based on hourly rate and hours worked.
  - Salaried Employees' weekly salary determined by dividing monthly salary by 4.
- **Bonus Calculation**:
  - Each employee type has a method to calculate bonuses.
  - Executive Employees can receive a percentage of their annual salary as a bonus.
- **Data Validation**: Ensures that inputs for hourly rates, monthly salaries, hours worked, and bonus percentages conform to predefined ranges.
- **Annual Earnings**: Calculates and displays annual earnings for each employee.
- **Total Payroll Tracking**: Maintains a comprehensive overview of the total payroll.

- ## Classes
- **Employee**: Base class with common attributes and methods for all employees.
- **HourlyEmployee**: Inherits from Employee, adding attributes and methods specific to hourly employees.
- **SalariedEmployee**: Inherits from Employee, adding attributes and methods specific to salaried employees.
- **ExecutiveEmployee**: Inherits from SalariedEmployee, adding additional functionality for executives.</p>
