package study0531;

/**
 *
 *  * 需求：请自己写一个功能，比较两个字符串是否相等。
 *  *
 *  * 分析：
 *  * 		A:给出两个字符串
 *  * 		B:比较长度是否相同，如果不同，则返回false。
 *  * 		      如果相同，就继续
 *  * 		C:把每个字符串转换为字符数组。String.toCharArray()
 *  * 		D:遍历两个数组，拿每一个位置上的字符进行比较。
 *  * 		  一旦发现有不同的，就返回false。
 *  * 		E:返回true。
 */

public class StringTest6 {
    public static void main(String args[]) {
        System.out.println("hhysosad".equals("hhysosad"));
        System.out.println(compare("hhysosad", "hhyosad"));
    }

    public static boolean compare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }

}
