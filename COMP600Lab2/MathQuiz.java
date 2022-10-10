
// COMP600 Lab 02
// By Gurjit Singh
// Tested working with Java 17.

import java.util.Scanner;

public class MathQuiz {
  public static int qAndA(int state) {
    try (var scanner = new Scanner(System.in)) {

      var randNum1 = (int) (Math.random() * ((100 + 1) + 1));
      var randNum2 = (int) (Math.random() * ((100 + 1) + 1));

      System.out.println("\n"
          + Integer.toString(randNum1) + " + "
          + Integer.toString(randNum2) + " ?");

      return (scanner.nextInt() != randNum1 + randNum2) ? state : qAndA(state + 1);

    }

  }

  public static void main(String[] args) {
    System.out.println("\nYou've entered " + qAndA(0) + " right answer(s).");

  }
}