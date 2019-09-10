package study0605;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 去除集合中字符串的重复值(字符串的内容相同)
 * 举例：
 * 		hello,world,java,android,world,java,javaee,java,java,java,android
 * 结果：
 * 		hello,world,java,android,javaee
 *
 * 解决步骤：
 * 		1.定义集合，存储带重复的元素
 * 		2.创建新集合
 * 		3.遍历旧集合，获取到旧集合中的每一个元素
 * 		4.那旧集合的每一个元素到新集合中去找，看有没有
 * 			有：就不添加(不搭理它)
 * 			木有：就添加
 * 		5.遍历新集合
 */

public class ArrayListTest {
    public static void main(String args[]) {
        ArrayList array = new ArrayList();
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("android");
        array.add("world");
        array.add("java");
        array.add("javaee");
        array.add("java");
        array.add("java");
        array.add("java");
        array.add("android");

        ArrayList newArray = new ArrayList();

        Iterator it = array.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            if (!newArray.contains(s)) {
                newArray.add(s);
            }
        }

        Iterator it2 = newArray.iterator();
        while (it2.hasNext()) {
            String s2 = (String) it2.next();
            System.out.println(s2);
        }
    }

}
