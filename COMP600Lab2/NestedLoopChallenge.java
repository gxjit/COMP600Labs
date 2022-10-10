
// COMP600 Lab 02
// By Gurjit Singh
// Tested working with Java 17.

import java.util.stream.IntStream;

public class NestedLoopChallenge {
  public static void main(String[] args) {
    for (var num : IntStream.rangeClosed(1, 6).toArray()) {
      System.out.print("\n");
      for (var nums : IntStream.rangeClosed(1, num).toArray()) {
        System.out.print(nums);
      }
    }
    System.out.print("\n");
  }
}