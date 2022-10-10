
// COMP600 Lab 01
// By Gurjit Singh
// Tested working with Java 17, Requires Java version 10 or above to run.

import java.util.Scanner;

public class OvertimeCalculator {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.print("\nPlease enter the number of your working hours?\n> ");
      double numOfHours = scanner.nextDouble();
      System.out.print("\nPlease enter your hourly wage?\n> ");
      double hourlyWage = scanner.nextDouble();

      double totalEarned;
      if (numOfHours > 40) {
        totalEarned = (40 * hourlyWage) + ((hourlyWage * 1.5) * (numOfHours - 40));
      } else {
        totalEarned = numOfHours * hourlyWage;
      }

      System.out.println("\nYou've Earned a total of " + totalEarned
          + ((numOfHours > 40) ? " with 1.5 times per hour over 40 hours." : " without any overtime."));

    }
  }
}