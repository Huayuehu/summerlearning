package study0526;

/**
 * two way of print out an array(one dimension):
 * 1. Arrays.toString();
 * 2. for each
*/

import java.util.Arrays;
import java.util.Scanner;

public class study0526 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[4];
        System.out.println("Please enter score for this exam:");
        scores[0] = input.nextInt();
        scores[1] = input.nextInt();
        scores[2] = input.nextInt();
        scores[3] = input.nextInt();

        System.out.println(scores[0] + ", " + scores[1] + ", " + scores[2] + ", " + scores[3]);
        //System.out.println("Oh my dear your score is: " + Arrays.toString(scores) + "!!!!");
        System.out.print("Oh my dear your score is: ");
        for (int score : scores) {
            System.out.print(score + ", ");
        }



    }
}
