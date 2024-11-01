<h1>Top K Frequency</h1>

<h2>Frequency Analyzer</h2>
<p>The <strong>Frequency Analyzer</strong> is a Java program that analyzes an array of integers to identify the top K numbers with the highest occurrences. It prioritizes numbers based on frequency and, in the case of ties, selects the larger number. Results are presented in descending order of frequency.</p>

<h3>Features</h3>
<ul>
  <li><strong>Static Variable</strong>: Stores the input array of integers.</li>
  <li><strong>Static Method</strong>: Implements frequency analysis and sorting logic to determine the top K numbers.</li>
  <li><strong>Sorting Logic</strong>: Ensures numbers are sorted by frequency first, then by value in descending order.</li>
</ul>

<h3>Usage</h3>
<ol>
  <li>Set the static array <code>numbers</code> with your desired integers.</li>
  <li>Call the <code>findTopKFrequentNumbers(K)</code> method with a positive integer K to retrieve the top K frequent numbers.</li>
</ol>

<h3>Example</h3>
<p>For the array <code>{7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9}</code> with <code>K = 4</code>, the output will be:</p>
<pre><code>5 11 7 10</code></pre>

<hr>

<h1>Share Trader</h1>

<h2>Explanation of the Code</h2>

<h3>Class and Static Variables</h3>
<ul>
  <li>The class is named <strong>ShareTrader</strong>.</li>
  <li><code>maxProfit</code>: A static variable holding the maximum profit from transactions.</li>
</ul>

<h3>Method <code>findMaxProfit</code></h3>
<ul>
  <li><strong>Input</strong>: An array of stock prices.</li>
  <li><strong>Logic</strong>: Initializes four variables to track profits and updates them based on buying low and selling high for two transactions.</li>
  <li><strong>Output</strong>: Prints the maximum achievable profit with up to two transactions.</li>
</ul>

<h3>Test Cases</h3>
<p>Several test cases in the <code>main</code> method demonstrate the functionality, showcasing profit calculation for different price arrays.</p>

<h3>Conclusion</h3>
<p>This code efficiently calculates the maximum achievable profit with two transactions, ensuring the second transaction can only occur after the first.</p>

<hr>

<h1>Employee Payroll System</h1>

<h2>Overview</h2>
<p>The <strong>Employee Payroll System</strong> is a Java application designed to manage different employee roles and their payroll within CHRIST (Deemed to be University). It efficiently handles salary calculation, bonus computation, and total payroll tracking for various employee types.</p>

<h3>Features</h3>
<ul>
  <li><strong>Employee Types</strong>: Supports Hourly, Salaried, and Executive Employees.</li>
  <li><strong>Salary Calculation</strong>:
    <ul>
      <li>Weekly earnings for Hourly Employees are based on hourly rate and hours worked.</li>
      <li>Salaried Employees’ weekly earnings are derived from their monthly salary.</li>
    </ul>
  </li>
  <li><strong>Bonus Calculation</strong>: Each employee type has a custom bonus calculation method.</li>
  <li><strong>Data Validation</strong>: Ensures valid inputs for rates, salaries, and hours.</li>
  <li><strong>Annual Earnings</strong>: Displays annual earnings for each employee type.</li>
  <li><strong>Payroll Tracking</strong>: Maintains a comprehensive overview of the total payroll.</li>
</ul>

