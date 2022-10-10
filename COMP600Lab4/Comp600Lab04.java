package in.gurjit.comp600lab04;

/*
  COMP600 Lab 04
  By Gurjit Singh (000487668) 07/10/22
  Tested working with Java 17.
 */

import java.util.Scanner;

public class Comp600Lab04 {
  public static void main(String[] args) {
    System.out.println("\nPlease select the program to run."
        + "\n1 -> Above Average Count"
        + "\n2 -> Get Min Max Indices");

    try (var scanner = new Scanner(System.in)) {
      switch (scanner.nextInt()) {
        case 1 -> AboveAverageCount.main(args);
        case 2 -> GetMinMaxIndices.main(args);
        default -> System.out.println("Invalid Selection");
      }

    }

  }
}
