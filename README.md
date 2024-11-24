<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<h1>Robber Strategy Simulator in Java</h1>

<p>This project demonstrates an inheritance-based design in Java to simulate different robbery strategies for maximizing the amount of money a robber can steal from various types of houses while avoiding security alarms. It includes an abstract <code>Robber</code> class and a derived class <code>JAVAProfessionalRobber</code> with methods using dynamic programming to solve different robbery constraints.</p>

<h2>Project Structure</h2>
<ul>
  <li><strong>Abstract Class <code>Robber</code></strong>: Contains abstract methods for different robbery strategies, along with:
    <ul>
      <li>A method <code>RobbingClass</code> that prints "MScAI&ML".</li>
      <li>A default method <code>MachineLearning</code> that prints "I love MachineLearning."</li>
    </ul>
  </li>
  <li><strong>Class <code>JAVAProfessionalRobber</code></strong>: Inherits from <code>Robber</code> and implements the following strategies:
    <ul>
      <li><code>RowHouses()</code>: Calculates maximum amount robbed without triggering alarms in adjacent row houses.</li>
      <li><code>RoundHouses()</code>: Calculates maximum amount robbed in a circular arrangement of houses.</li>
      <li><code>SquareHouse()</code>: Maximizes amount robbed from square houses without robbing adjacent houses.</li>
      <li><code>MultiHouseBuilding()</code>: Maximizes amount robbed from a multi-type building where each array represents a separate type of house.</li>
    </ul>
  </li>
</ul>

<h2>Algorithm Summary</h2>
<p>Each method uses dynamic programming to ensure that no adjacent houses are robbed, maximizing the total robbery amount.</p>

<h3>Method Explanations</h3>
<ol>
  <li><strong>RowHouses</strong>: Robs from an array of row houses without robbing two adjacent houses.</li>
  <li><strong>RoundHouses</strong>: Handles circular houses where the first and last are adjacent.</li>
  <li><strong>SquareHouse</strong>: Similar to <code>RowHouses</code>, optimizes for non-adjacent square houses.</li>
  <li><strong>MultiHouseBuilding</strong>: Robs from a multi-type building with each house type treated independently.</li>
</ol>

<h3>Test Cases</h3>
<ul>
  <li><code>RowHouses([1,2,3,0])</code> -> Expected result: 4</li>
  <li><code>RoundHouses([1,2,3,4])</code> -> Expected result: 6</li>
  <li><code>SquareHouse([5,10,2,7])</code> -> Expected result: 17</li>
  <li><code>MultiHouseBuilding([[5,3,8,2], [10,12,7,6], [4,9,11,5], [8,6,3,7]])</code> -> Expected result: 59</li>
</ul>

<h1>Bank Interface Program</h1>
<h2>Description for README:</h2>
<p>This program demonstrates the use of interfaces in Java by implementing a <code>BankInterface</code> that contains two abstract methods:</p> <ul> <li><code>getBalance()</code>: Returns the balance in a bank account.</li> <li><code>getInterestRate()</code>: Returns the interest rate offered by the bank based on the balance.</li> </ul> <p>The program involves three classes: <code>BankA</code>, <code>BankB</code>, and <code>BankC</code>, which implement the <code>BankInterface</code> and provide unique definitions of the <code>getInterestRate</code> method based on the respective bank's policies. The main class instantiates objects of each bank, sets balances, and displays their balance and interest rate.</p><br>
<h2>Code Features:</h2>
<ol> <li><strong>Interface Definition</strong>: <ul> <li><code>BankInterface</code> defines the methods <code>getBalance</code> and <code>getInterestRate</code>.</li> </ul> </li> <li><strong>Bank Implementations</strong>: <ul> <li><code>BankA</code>: Offers a 7% interest rate.</li> <li><code>BankB</code>: Offers a 7.4% interest rate.</li> <li><code>BankC</code>: Offers a 7.9% interest rate.</li> </ul> </li> <li><strong>Main Class</strong>: <ul> <li>Demonstrates the use of polymorphism by invoking methods on the bank objects via the <code>BankInterface</code>.</li> <li>Deposits specific amounts in each bank (<code>10000</code>, <code>150000</code>, and <code>200000</code>) and calculates the corresponding interest rates.</li> </ul> </li> </ol><br>

<h1>Water Conservation System</h1>
<h2>Description for README:</h2>
<p>This program calculates the total volume of water that can be trapped between city blocks during the rainy season. It demonstrates the use of interfaces and abstract classes to design a reusable and modular system for water conservation.</p>
<h2>Code Features:</h2>
<ol> <li><strong>Interface Definition</strong>: <ul> <li><code>WaterConservationSystem</code> defines the abstract method <code>calculateTrappedWater(int[] blockHeights)</code>.</li> </ul> </li> <li><strong>Abstract Class</strong>: <ul> <li><code>RainySeasonConservation</code> implements <code>WaterConservationSystem</code> as an abstract class, providing a base for future water conservation strategies.</li> </ul> </li> <li><strong>Concrete Class</strong>: <ul> <li><code>CityBlockConservation</code> extends <code>RainySeasonConservation</code> and provides a concrete implementation of the <code>calculateTrappedWater</code> method: <ul> <li>Uses two arrays (<code>leftMax</code> and <code>rightMax</code>) to store the maximum block height to the left and right of each block.</li> <li>Calculates water trapped over each block as the minimum of these values minus the block's height.</li> </ul> </li> </ul> </li> <li><strong>Main Class</strong>: <ul> <li>Creates an instance of <code>CityBlockConservation</code>.</li> <li>Tests the program with sample inputs and displays the total water trapped.</li> </ul> </li> </ol>
