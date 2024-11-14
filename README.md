<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Robber Strategy Simulator in Java</title>
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
