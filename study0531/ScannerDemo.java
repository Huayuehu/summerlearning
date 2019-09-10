package study0531;

/**
 * Scanner class
 */


import java.util.Scanner;

public class ScannerDemo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String oneStr = input.next();
        System.out.println("oneStr: " + oneStr);

        System.out.println("------------------------------------------------");

        //hasNextLine() and nextLine()
        System.out.println("Please enter a bunch of words within one line: ");
        if (input.hasNextLine()) {
            String str = input.nextLine();
            System.out.println("The line you entered is: " + str);
        }

        System.out.println("------------------------------------------------");

        //hasNextInt() and nextInt()
        System.out.println("Please enter one integer: ");
        if (input.hasNextInt()) {
            int number = input.nextInt();
            System.out.println("The number you entered is: " + number);
        }

        System.out.println("------------------------------------------------");

        //the sequence of nextInt() and nextLine()
        System.out.println("Please enter one integer: ");
        int x = input.nextInt();
        String y = input.nextLine();//上面的回车给了这里
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
