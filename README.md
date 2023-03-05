# README for English Ruler of Variable Length and Variable Major Tic using Recursion
![image](https://user-images.githubusercontent.com/65556438/222951403-71ac8712-ea09-47aa-a141-53cb96f31490.png)


This repository contains a Python implementation of an English Ruler of variable length and variable major tic using recursion.

The English Ruler is a mathematical tool used to measure the length of an object. It consists of a straight edge marked with evenly spaced marks or ticks. In this implementation, the ruler is represented by a string of hyphens ("-") and tics ("|"). The length of the ruler is determined by the user and the distance between major tics is also variable.

The implementation uses recursion to create the ruler. The main function, Marks, takes two arguments: the length of the ruler and the distance between major tics. It then recursively calls itself to draw smaller rulers within the larger ruler. The base case of the recursion is a ruler of length zero, which returns an empty string. As the recursion progresses, the function creates the ruler string by concatenating smaller ruler strings with the appropriate spacing and tic marks.

To run the code, simply clone the repository and run the EnglishRuler.java file. The file includes a main function that calls draw_ruler with default values of 10 for the ruler length and 2 for the distance between major tics. These values can be easily modified to create rulers of different lengths and tic spacings.

Overall, this implementation provides a simple solution for creating English Rulers of variable length and variable major tic using recursion.
