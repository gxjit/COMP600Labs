package in.gurjit.comp600lab04;

/*
  COMP600 Lab 04
  By Gurjit Singh (000487668) 07/10/22
  Tested working with Java 17.

  Make the appropriate methods to:
    Populate the array with random integers between 0 and 100.
    Calculate the average.
    Count the number above a number passed in as a parameter.
*/

import java.util.Arrays;
import java.util.stream.IntStream;

public class Comp600ArrayMethods {

  public static int[] getRandInts() {
    /*
     * Populate and return an array with random integers between 0 and 100.
     *
     * @return int[] Returns an array of random integers.
     */
    return IntStream.rangeClosed(1, 20)
        .map(x -> ((int) (Math.random() * ((100 + 1) + 1))))
        .toArray();
  }

  public static double getAverage(int[] intArray) {
    /*
     * Calculate the average of input array of integers.
     *
     * @param int[] intArray An array of integers.
     *
     * @return double Returns average of input array.
     */
    return (Arrays.stream(intArray)
        .reduce(0, (x, y) -> x + y) / intArray.length);
  }

  public static int countAbove(int[] intArray, int num) {
    /*
     * Count the number above a number passed in as a parameter.
     *
     * @param int[] intArray An array of integers.
     *
     * @param int num Numbers above this number will be counted.
     *
     * @return int Returns total count of numbers above number passed
     * in as a parameter.
     */
    return (Arrays.stream(intArray)
        .filter(x -> x > num)
        .reduce(0, ((x, y) -> x + 1)));
  }

  public static int getMinIndex(double[] inArray) {
    /*
     * A method that returns the index of the smallest value in
     * an array of doubles. If there are more than one such elements,
     * returns the smallest index.
     *
     * @param double[] inArray An array of integers.
     *
     * @return int Returns the index of the smallest value.
     */
    var smallestVal = (Arrays.stream(inArray)
        .reduce((x, y) -> (x < y ? x : y))
        .getAsDouble());
    return IntStream.range(0, inArray.length)
        .filter(i -> inArray[i] == smallestVal)
        .findFirst()
        .getAsInt();
  }

  public static double getMinVal(double[] inArray) {
    /*
     * A method that returns the minimum value in an array of doubles.
     * If there are more than one such elements, return the smallest index.
     *
     * @param double[] inArray An array of integers.
     *
     * @return int Returns the minimum value / index of the minimum value.
     */

    var smallestVal = (Arrays.stream(inArray)
        .reduce((x, y) -> (x < y ? x : y))
        .getAsDouble());
    var vals = IntStream.range(0, inArray.length)
        .filter(i -> inArray[i] == smallestVal)
        .toArray();
    return (vals.length == 1)
        ? smallestVal
        : Double.valueOf(Arrays.stream(vals).findFirst().getAsInt());
  }

}
