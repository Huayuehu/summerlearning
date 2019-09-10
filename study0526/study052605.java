package study0526; /**
 * TWO dimension array
 * initiate, traverse
 */

import java.util.Arrays;
import java.util.Scanner;


public class study052605 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[][] twoDimArr = new int[3][2];
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[0].length; j++) {
                System.out.println("Please enter a number: ");
                twoDimArr[i][j] = input.nextInt();
            }
        }

        System.out.println(Arrays.toString(twoDimArr[0]));
        System.out.println(Arrays.toString(twoDimArr[1]));
        System.out.println(Arrays.toString(twoDimArr[2]));
    }
}
