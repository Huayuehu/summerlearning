package study0531;

/**
 * To simulate Log in situation:
 *
 * Total chance is 3, and it will show how many chances left
 *
 * A. Given specific username and password
 * B. keyboard input username and password
 * C. compare given params and input ones
 * D. 3 chances
 */

import java.util.Scanner;

public class StringTest {
    public static void main(String args[]) {
        String username = "hhy";
        String password = "admin";

        for (int x = 3; x > 0; x--) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter your username: ");
            String un = in.nextLine();
            System.out.println("Please enter your password: ");
            String ps = in.nextLine();

            if ((username.equals(un)) && (password.equals(ps))) {
                System.out.println("Successfully logged in! :) ");
                break;
            } else {
                if (x == 1) {
                    System.out.println("Sorry your chances for today have been run out :( ");
                } else {
                    System.out.println("Ooops, FAIL!!!!! You still have " + (x-1) + " chances. ");
                }
            }


        }

    }
}
