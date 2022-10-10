
// COMP600 Lab 03
// By Gurjit Singh
// Tested working with Java 17.

import java.util.Scanner;

public class RoundToTwo {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("\nPlease enter the radius of the circle.");
      var radius = scanner.nextDouble();
      var area = Math.PI * radius * radius;
      System.out.println("Area of the circle for radius "
          + Comp600Methods.RoundTo2(radius) + " is "
          + Comp600Methods.RoundTo2(area));
    }

  }
}