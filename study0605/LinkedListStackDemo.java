package study0605;


/**
 * Use linkedlist to simulate stack function
 *
 * stack: first in, last out
 *        [function] void push(Object obj)
 *                   void pop(Object obj)
 *                   boolean isEmpty()
 */

public class LinkedListStackDemo {
    public static void main(String args[]) {
        MyStack l = new MyStack();

        l.push("hello");
        l.push("world");
        l.push("java");

        System.out.println(l.pop());
        System.out.println(l.pop());
        System.out.println(l.pop());

        System.out.println("Empty?: " + l.isEmpty());
    }
}
