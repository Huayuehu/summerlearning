package study0531;

/**
 *
 *  String s = new String(“hello”)和String s = “hello”;的区别
 *
 *  ==:比较引用类型，比较的是地址值
 *  equal():默认比较的是地址值。String类重写了equals()方法，该方法的作用是比较字符串的内容是否相同
 *
 */


public class StringDemo {
    public static void main(String args[]) {
        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println(s1 == s2);//false: "=="比较的是地址值
        System.out.println(s1.equals(s2));//true: equal()默认比较的是地址值，String类重写了equals()方法，该方法的作用是比较字符串的内容是否相同

        System.out.println("-----------------------------");

        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s3 == s4);//false: 这是两个不同的对象空间
        System.out.println(s3.equals(s4));//true: s3和s4中字符串内容一样

        System.out.println("-----------------------------");

        String s5 = "hello";
        String s6 = "hello";
        System.out.println(s5 == s6);//true
        System.out.println(s5.equals(s6));//true

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

        String s7 = "hhy";
        String s8 = "ntmy";
        String s9 = "hhyntmy";
        String s10 = s7 + s8;
        String s11 = "hhy" + "ntmy";
        System.out.println(s10);
        System.out.println(s11);
        System.out.println(s9 == s7 + s8);//false
        System.out.println(s9.equals(s7 + s8));//true
        System.out.println(s9 == s11);//true
    }
}
