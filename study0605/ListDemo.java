package study0605;

import java.util.*;

/**
 * Use List Collection to store String and go through it
 * List: 元素的存储顺序和输出顺序一致，元素可重复
 * Set: 元素的存储顺序与输出顺序不同，元素唯一
 */


public class ListDemo {
    public static void main(String args[]) {
        List l = new ArrayList();//List是一个接口，一种特殊的抽象类，不能被实例构造，ArrayList是其一个实现类

        l.add("hello");
        l.add("world");
        l.add("java");
        l.add("java");

        Iterator it = l.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }

        System.out.println("--------------------");

        Set s = new TreeSet();
        s.add("hello");
        s.add("world");
        s.add("java");
        s.add("java");

        Iterator it2 = s.iterator();
        while (it2.hasNext()) {
            String s2 = (String) it2.next();
            System.out.println(s2);
        }

    }
}
