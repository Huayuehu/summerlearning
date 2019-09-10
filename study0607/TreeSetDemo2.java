package study0607;

/**
 * Set集合我们讲解了两个子类。一般我们使用谁呢?
 * 		要排序吗?
 * 			要：TreeSet
 * 			不要：HashSet
 * 我们也不知道是不是要排序，用HashSet
 *
 */

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String args[]) {
        TreeSet<Person> ts = new TreeSet<Person>();

        Person p1 = new Person("hhy", 23);
        Person p2 = new Person("tfz", 36);
        Person p3 = new Person("rjx", 38);
        Person p4 = new Person("cjh", 38);
        Person p5 = new Person("hhy", 23);
        Person p6 = new Person("hhy", 0);
        Person p7 = new Person("hhy", 23);

        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        ts.add(p5);
        ts.add(p5);
        ts.add(p6);
        ts.add(p7);

        for (Person p : ts) {
            System.out.println(p);
        }
    }
}
