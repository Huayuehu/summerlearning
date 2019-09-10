package study0531;

/**
 * String class
 * Uppercase, lowercase, number
 * count
 *
 * trim()
 *
 * compareTo(String str)
 */
import java.util.Scanner;


public class StringTest3 {
    public static void main(String args[]) {
        int upperCount = 0;
        int lowerCount = 0;
        int numberCount = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a bunch of string: ");
        String s = in.nextLine();

        //count upper/lower/number
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //uppercase
            if (ch >= 'A' && ch <= 'Z') {
                upperCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowerCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        System.out.println("# of uppercase: " + upperCount);
        System.out.println("# of lowercase: " + lowerCount);
        System.out.println("# of number: " + numberCount);

        System.out.println("-------------------------------");

        //trim()
        System.out.println("---" + s + "---");
        System.out.println("---" + s.trim() + "---");

        System.out.println("-------------------------------");

        //compareTo(String str)
        //  比较两个字符串的字典顺序
        //  用字符串1跟字符串2作比较，如果字符串1的字典顺序在字符串2前面，则返回一个负数。若在后面，则返回一个正数。若两个字符串的字典顺序相同，则返回0。
        //  这里的字典顺序指的是ASCII码表中的字符顺序。ASCII表中每个字符都有对应的下标，从0开始升序排列，共128个字符。
        System.out.println(s.compareTo("helloworld"));
        System.out.println(s.compareTo("Helloworld"));
        System.out.println(s.compareTo("helloworldhhy"));
    }
}
