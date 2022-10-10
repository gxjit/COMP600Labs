
// COMP600 Lab 01
// By Gurjit Singh
// Tested working with Java 17, Requires Java version 14 or above to run.

import java.util.Scanner;

public class SaltSales {
  public static void main(String[] args) {

    double bagOfSaltCost = 11.99;

    System.out.print("\nPlease Enter the number of Bags of Salt you would like to purchase?\n> ");
    int numOfBags = (new Scanner(System.in)).nextInt();

    double shippingPerBag = (numOfBags > 10) ? 1.89 : 1.99;
    double totalCost = (bagOfSaltCost * numOfBags) + (shippingPerBag * numOfBags);

    System.out.println("\nYou'll have to pay a total of $" + totalCost
        + " for " + numOfBags + " bags of salt at $"
        + bagOfSaltCost + " each, with additional shipping cost of $"
        + shippingPerBag + " per bag.");

  }
}