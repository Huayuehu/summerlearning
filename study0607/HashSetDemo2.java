package study0607;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String args[]) {
        HashSet<Person> hs = new HashSet<Person>();

        Person p1 = new Person("hhy", 23);
        Person p2 = new Person("tfz", 36);
        Person p3 = new Person("rjx", 38);
        Person p4 = new Person("cjh", 38);
        Person p5 = new Person("hhy", 23);
        Person p6 = new Person("hhy", 0);
        Person p7 = new Person("hhy", 23);


        hs.add(p1);
        hs.add(p2);
        hs.add(p3);
        hs.add(p4);
        hs.add(p5);
        hs.add(p5);
        hs.add(p6);
        hs.add(p7);

        for (Person p : hs) {
            System.out.println(p);
        }


    }
}
