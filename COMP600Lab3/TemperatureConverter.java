
// COMP600 Lab 03
// By Gurjit Singh
// Tested working with Java 17.

import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("\nEnter 1 to convert Celsius to Fahrenheit"
          + "\nor any other number to convert Fahrenheit to Celsius");
      var userSelection = scanner.nextInt();
      System.out.print("Input temperature: ");
      var userIn = scanner.nextDouble();
      var result = (userSelection == 1) ? Comp600Methods.celcius(userIn)
          : Comp600Methods.fahrenheit(userIn);
      System.out.println("Resulting tempreature: "
          + Comp600Methods.RoundToN(result, 3));

    }
  }
}