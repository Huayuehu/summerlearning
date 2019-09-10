package study0526; /**
 * To save each digit of a number into an array
 * &
 * convert back to string
 */

import java.util.Arrays;

public class study052606 {
    public static void main(String args[]) {
        int number = 789624;
        int index = 0;
        int[] arr = new int[6];
        while (number > 0) {
            arr[index] = number % 10;
            index++;
            number = number / 10; //remainder
        }

        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp;
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------------");

        //converting the elements of array back to string
        String s = "";
        for (int i = 0; i < arr.length ; i++) {
            s += arr[i];
        }
        System.out.println(s);
    }
}
