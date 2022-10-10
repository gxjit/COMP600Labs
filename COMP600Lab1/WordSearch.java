
// COMP600 Lab 01
// By Gurjit Singh
// Tested working with Java 17, Requires Java version 10 or above to run.

import java.util.Scanner;

public class WordSearch {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.print("\nPlease Enter the first word?\n> ");
      String firstWord = scanner.next();
      System.out.print("\nPlease Enter the second word?\n> ");
      String secondWord = scanner.next();
      System.out.println("\n" +
          "The second word " + (firstWord.contains(secondWord) ? "is " : "is not ") + "contained in the first word.");

    }

  }
}