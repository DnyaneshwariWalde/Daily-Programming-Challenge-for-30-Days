/*
 * Day 5:
 * Challenge:
 * Given an array of N integers, and an integer K, 
 * the task is to find the number of pairs of integers in the
 * array whose sum is equal to K.
 */
package Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class SumPairs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum");
        int k = sc.nextInt();
        int sumpair = countPairsWithSum(arr, k);
        System.out.println("Number of pairs with sum " + k + ": " + sumpair);

    }

    private static int countPairsWithSum(int[] arr, int k) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        int count = 0;

        for (int num : arr) {
            int complement = k - num;
            if (arr1.contains(complement)) {
                count++;
            }
            arr1.add(num);
        }

        return count;
    }
}
/*Output:
 * Enter the size of array
	5
	Enter the elements of array:
	1 3 5 7 9
	Enter the target sum
	10
	Number of pairs with sum 10: 2

*/
