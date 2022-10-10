
// COMP600 Lab 01
// By Gurjit Singh
// Tested working with Java 17, Requires Java version 14 or above to run.

import java.util.Scanner;

public class VendingMachine {
  private static String items(int item) {
    return switch (item) {
      case 1 -> "Candy Bar";
      case 2 -> "Soda";
      case 3 -> "Chips";
      case 4 -> "Candy";
      default -> "Invalid Selection";
    };
  }

  private static double price(int itemNum) {
    return switch (itemNum) {
      case 1 -> 1.15;
      case 2 -> 1.25;
      case 3 -> 1.30;
      case 4 -> 1.05;
      default -> 0;
    };
  }

  public static void main(String[] args) {
    System.out.print("\nWhat are you interested in?"
        + "\n1 -> " + items(1) + " $" + Double.toString(price(1))
        + "\n2 -> " + items(2) + " $" + Double.toString(price(2))
        + "\n3 -> " + items(3) + " $" + Double.toString(price(3))
        + "\n4 -> " + items(4) + " $" + Double.toString(price(4))
        + "\n> ");

    try (var scanner = new Scanner(System.in)) {
      int selection = scanner.nextInt();
      double price = price(selection);
      int loonies = Math.round((int) price / 1);
      int quarters = Math.round((int) (((price / 1) % 1) / 0.25));
      int dimes = Math.round((int) ((((price / 1) % 1) % 0.25) / 0.1));
      int nickles = Math.round((int) (((((price / 1) % 1) % 0.25) % 0.5) / 0.1));

      System.out.println("\nYou've Selected " + items(selection)
          + ", Which will cost you " + Integer.toString(loonies)
          + " loonie(s), " + Integer.toString(quarters) + " quarter(s), "
          + Integer.toString(dimes) + " dime(s), "
          + Integer.toString(nickles) + " nickle(s).");
    }
  }
}