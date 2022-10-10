
// COMP600 Lab 02
// By Gurjit Singh
// Tested working with Java 17.

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.text.DecimalFormat;

public class AverageCalculator {
  public static void main(String[] args) {

    var df = new DecimalFormat("###.##");

    try (var scanner = new Scanner(System.in)) {
      var scores = IntStream.rangeClosed(1, 10)
          .map(x -> {
            System.out.println("\n\nPlease enter the name of Student no. " + x);
            scanner.nextLine();
            System.out.println("Please enter the score of Student no. " + x);
            var ret = scanner.nextInt();
            scanner.nextLine();
            return ret;
          })
          .toArray();

      var average = (Arrays.stream(scores)
          .reduce(0, (x, y) -> x + y) / scores.length);

      System.out.print("\n\nAverage score of the class: "
          + df.format(average) + "\n");

    }
  }
}
