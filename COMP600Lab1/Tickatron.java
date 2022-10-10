
// COMP600 Lab 01
// By Gurjit Singh
// Tested working with Java 17, Requires Java version 8 or above to run.

import java.util.Scanner;

public class Tickataron {
  public static void main(String[] args) {

    double perTicketCost = 14.95;

    System.out.print("\nPlease Enter the number of tickets you would like to purchase?\n> ");
    int numOfTickets = (new Scanner(System.in)).nextInt();

    double totalCost = perTicketCost * numOfTickets;
    System.out.println(
        "\nYou'll have to pay a total of $" + totalCost + " for "
            + numOfTickets + " tickets at $" + perTicketCost + " each.");

  }
}