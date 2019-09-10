package study0531;

/**
 * decide whether a word is palindrome
 * String --> StringBuffer
 * StringBuffer.reverse()
 */

public class StringBufferDemo {
    public static void main(String args[]) {
/*        String s = "hello";
        //StringBuffer sb = new StringBuffer(s);

        //sb.append("world");
        //System.out.println(sb);

        //sb.reverse();
        //System.out.println(sb);


        String s2 = "hhyhh";
        //StringBuffer sb2 = new StringBuffer(s2);

        System.out.println(reVerse(s).equals(s));
        System.out.println(reVerse(s2).equals(s2));

    }

    public static String reVerse (String s) {
        StringBuffer bs = new StringBuffer(s);
        return new String(bs.reverse());
    }*/

        String s = "hello";
        String s2 = "hhyhh";

        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s2));

    }

    public static boolean isPalindrome (String s) {
        StringBuffer bs = new StringBuffer(s);
        bs.reverse();
        String ss = new String(bs);
        return s.equals(ss);
    }

}
