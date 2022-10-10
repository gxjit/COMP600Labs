
// COMP600 Lab 02
// By Gurjit Singh
// Tested working with Java 17.

import java.util.Scanner;

public class CharacterCountSubroutine {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.print("\nPlease enter the search word?\n> ");
      var searchWord = scanner.next();
      System.out.print("\nPlease enter the search character contained in the search word?\n> ");
      var searchChar = scanner.next().charAt(0);

      System.out.println("\nThe letter '"
          + searchChar + "' appears in the word '"
          + searchWord + "' "
          + (searchWord.chars()
              .filter(x -> x == searchChar)
              .reduce(0, ((x, y) -> x + 1)))
          + " time(s).");

    }

  }
}