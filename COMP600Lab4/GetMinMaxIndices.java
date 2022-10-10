package in.gurjit.comp600lab04;

/*
  COMP600 Lab 04
  By Gurjit Singh (000487668) 07/10/22
  Tested working with Java 17.

  Write a method that returns the index of the smallest value in an array of doubles. If there are more than one such elements, return the smallest index.

  Write a method that returns the minimum value in an array of doubles.
  If there are more than one such elements, return the smallest index.
 */

import java.util.Arrays;
import java.util.List;

public class GetMinMaxIndices {

  public static void main(String[] args) {
    var doubles = new double[] { 4.5, 1.4, 2.5, 1.4, 5.6, 6.3 };
    var doubles2 = new double[] { 4.5, 7.4, 2.5, 1.4, 5.6, 6.3 };
    var doublesList = List.of(doubles, doubles2);
    doublesList.forEach(x -> System.out.println("\nFor Array: "
        + Arrays.toString(x) + "\n Minimum index : "
        + Comp600ArrayMethods.getMinIndex(x)
        + "\n Minimum value/index : "
        + Comp600ArrayMethods.getMinVal(x)));

  }
}