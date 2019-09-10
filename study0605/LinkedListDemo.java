package study0605;

import java.util.LinkedList;

/**
 * LinkedList的特有功能：
 * 		A:添加功能
 * 			void addFirst()
 * 			void addLast()
 * 		B:移除功能
 * 			Object removeFirst()
 * 			Object removeLast()
 * 		C:获取功能
 * 			Object getFirst()
 * 			Object getLast()
 */

public class LinkedListDemo {
    public static void main(String args[]) {
        LinkedList l = new LinkedList();

        l.add("hello");
        l.add("world");
        l.add("java");

        //void addFirst()    void addLast()
        l.addFirst("first");
        l.addLast("last");

        //Object getFirst()   Object getLast()
        System.out.println("getFirst: " + l.getFirst());
        System.out.println("getLast: " + l.getLast());

    }
}
