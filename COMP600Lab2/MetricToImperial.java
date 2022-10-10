
// COMP600 Lab 02
// By Gurjit Singh
// Tested working with Java 17.

import java.util.stream.IntStream;
import java.text.DecimalFormat;

public class MetricToImperial {
  public static void main(String[] args) {

    var df = new DecimalFormat("###.##");

    System.out.println("\n" + "Kilograms" + "\t" + "Pounds");

    IntStream.concat(
        IntStream.range(1, 10),
        IntStream.range(191, 200))
        .filter(x -> x % 2 != 0)
        .forEach(x -> {
          System.out.print(x + "\t");
          System.out.print(df.format(x * 2.2046) + "\n");
        });

  }
}
