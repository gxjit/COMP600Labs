
// COMP600 Lab 03
// By Gurjit Singh
// Tested working with Java 17.

import java.math.*;

public class Comp600Methods {

  public static String RoundToN(double number, int nPlaces) {
    return (new BigDecimal(number)).setScale(nPlaces, RoundingMode.HALF_UP).toPlainString();
  }

  public static String RoundTo2(double number) {
    return RoundToN(number, 2);
  }

  public static double celcius(double faranH) {
    return (5.0 / 9.0 * (faranH - 32));
  }

  public static double fahrenheit(double celcius) {
    return (9.0 / 5.0 * (celcius + 32));
  }

  public static int charCount(String searchWord, char searchChar) {
    return (searchWord.chars()
        .filter(x -> x == searchChar)
        .reduce(0, ((x, y) -> x + 1)));
  }

  public static String reverseString(String origin) {
    return (new StringBuilder()).append(origin).reverse().toString();
  }

  public static boolean equalsIgnoreCase(String origin, String reversed) {
    return reversed.equalsIgnoreCase(origin);
  }

  public static boolean isReversed(String origin, String reversed) {
    return reversed.equals(reverseString(origin));
  }

}
