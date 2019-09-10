package study0526; /**
 * ONE dimension array:
 * MAX, MIN, sort, reverse
 */

import java.util.Arrays;
import java.util.Scanner;

public class study052604 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];

        //initiate array one by one
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter a number: ");
            arr[i] = input.nextInt();
        }

        //v1: To test if the input is correct
        System.out.println(Arrays.toString(arr));


        //v2: To find the MAX of this array
            for (int j = 1; j < arr.length; j++) {
                if (arr[0] < arr[j]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[0];
                    arr[0] = temp;
                }
            }
        System.out.println("the maximum number is " + arr[0]);


        System.out.println("--------------------------------");


        //v3: To find the MIN of this array
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                int temp;
                temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
            }
        }
        System.out.println("the minimum number is " + arr[0]);


        System.out.println("--------------------------------");


        //v4: To sort the array, from minimum to maximum
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


        System.out.println("--------------------------------");


        //v5: To reverse the array
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp;
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
