package in.gurjit.comp600lab04;

/*
  COMP600 Lab 04
  By Gurjit Singh (000487668) 07/10/22
  Tested working with Java 17.

  Write a program that populates an array with 20 integers.
    Populate the array with random integers between 0 and 100.
    Calculate the average.
    Count the number above a number passed in as a parameter.
 */

import java.util.Arrays;
import java.util.Scanner;

public class AboveAverageCount {
  public static void main(String[] args) {
    System.out.println("\nPopulate an array with 20 random integers between 0 and 100.");
    var randInts = Comp600ArrayMethods.getRandInts();
    System.out.println(Arrays.toString(randInts));
    System.out.println("\nCalculate the average of above array.");
    System.out.println(Comp600ArrayMethods.getAverage(randInts));
    System.out.println("\nInput a number to count the numbers above the input number in the above array.");
    var num = (new Scanner(System.in)).nextInt();
    System.out.println(Comp600ArrayMethods.countAbove(randInts, num));

  }
}