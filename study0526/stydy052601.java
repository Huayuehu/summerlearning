package study0526; /**
 * two dimensions array
 * the same tow ways to print out all the elements of two dimensions array
 */
import java.util.Arrays;
import java.util.Scanner;

public class stydy052601 {
    public static void main(String args[]) {
        int[][] num = new int[2][3];
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a bunch of numbers: ");
        num[0][0] = input.nextInt();
        num[0][1] = input.nextInt();
        num[0][2] = input.nextInt();
        num[1][0] = input.nextInt();
        num[1][1] = input.nextInt();
        num[1][2] = input.nextInt();

        for (int i: num[0]) {
            System.out.print(i + ", ");
        }
        for (int i: num[1]) {
            System.out.print(i + ", ");
        }

//        System.out.println(Arrays.toString(num[0]));
//        System.out.println(Arrays.toString(num[1]));

    }
}
