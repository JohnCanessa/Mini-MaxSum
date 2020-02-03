import java.util.Scanner;

/**
 * 
 */
public class Solution {

  /**
   * Complete the miniMaxSum function below.
   */

  static void miniMaxSum(int[] arr) {

    // **** ****
    long sum = 0;
    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;

    // **** process the set of values ****
    for (int i = 0; i < arr.length; i++) {

      // **** update the sum ****
      sum += arr[i];

      // **** update the min value (if needed) ****
      if (arr[i] < min) {
        min = arr[i];
      }

      // **** update the max value (if needed) ****
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    // **** display the sum of the min and max values ****
    System.out.println((sum - max) + " " + (sum - min));
  }

  // ***** open scanner ****
  private static final Scanner scanner = new Scanner(System.in);

  /**
   * Test scaffolding.
   */
  public static void main(String[] args) {

    // **** array of integers to process ****
    int[] arr = new int[5];

    // **** read a set of five integers ****
    String[] arrItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    // **** load the array with teh integer values ****
    for (int i = 0; i < 5; i++) {
      int arrItem = Integer.parseInt(arrItems[i]);
      arr[i] = arrItem;
    }

    // **** process the set ****
    miniMaxSum(arr);

    // **** close the scanner ****
    scanner.close();
  }
}