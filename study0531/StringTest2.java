package study0531;

/**
 * To go through and get every char in string
 *
 * char chaAt(int index): return char according to index
 */


public class StringTest2 {
    public static void main(String args[]) {
        String s1 = "java";
        String s2 = "javaisdifficult";

        //s1
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(2));
        System.out.println(s1.charAt(3));

        //s2
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            System.out.println(ch);
        }
    }
}
