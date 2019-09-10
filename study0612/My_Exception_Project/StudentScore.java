package study0612.My_Exception_Project;

import java.util.Scanner;

public class StudentScore {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter student's score: ");

        int score = in.nextInt();
        Teacher t = new Teacher();
        try {
            t.check(score);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
