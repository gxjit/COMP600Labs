package in.gurjit.comp600lab03;

import java.util.Scanner;

public class Comp600Lab03 {
  public static void main(String[] args) {
    System.out.println("\nPlease select the program to run."
        + "\n1 -> Temperature Converter"
        + "\n2 -> Round To Five"
        + "\n3 -> Round To Two");

    try (var scanner = new Scanner(System.in)) {
      switch (scanner.nextInt()) {
        case 1 -> TemperatureConverter.main(args);
        case 2 -> RoundToFive.main(args);
        case 3 -> RoundToTwo.main(args);
        default -> System.out.println("Invalid Selection");
      }

    }

  }
}
