/*
 * Day 7:
 * Challenge:Rotate the array left N times. 
 * Accept N value from the user.
 */
package Day7;

import java.util.Scanner;

public class ArrayRotateLeft {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter how many times array to be rotated i.e N");
        int N = sc.nextInt();

        System.out.println("Array Before Rotations ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        rotateleft(arr, N);

        System.out.println("\nArray after " + N + " left rotations");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void rotateleft(int[] arr, int N) {
        int n = arr.length;
        N = N % n;

        for (int rotation = 0; rotation < N; rotation++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }
}
/*
 * Output:
 * `Enter array size
	5
	Enter array elements:
	1 2 3 4 5
	Enter how many times array to be rotated i.e N
	2
	Array Before Rotations 
	1 2 3 4 5 
	Array after 2 left rotations
	3 4 5 1 2 
*/