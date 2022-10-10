
// COMP600 Lab 02
// By Gurjit Singh
// Tested working with Java 17.

import java.util.Scanner;

public class HighScoreCalculator {
  public static void highScoreCalculator(
      int maxStudents, int studentNumber, String highestScorer, int highestScore) {

    if (studentNumber > maxStudents) {
      System.out.println("\nHighest Score is "
          + Integer.toString(highestScore) + " by " + highestScorer);
      return;
    }

    try (var scanner = new Scanner(System.in)) {
      System.out.println("\nPlease enter the name of Student no. " + Integer.toString(studentNumber));
      var scorer = scanner.nextLine();
      System.out.println("Please enter the score of Student no. " + Integer.toString(studentNumber));
      var score = scanner.nextInt();
      // scanner.nextLine();

      highScoreCalculator(maxStudents, studentNumber + 1,
          (highestScore > score) ? highestScorer : scorer,
          (highestScore > score) ? highestScore : score);
    }

  }

  public static void main(String[] args) {
    highScoreCalculator(10, 1, "", 0);
  }
}