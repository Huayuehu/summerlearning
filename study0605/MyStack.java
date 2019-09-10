package study0605;

import java.util.LinkedList;

/**
 *   stack: first in, last out
 *          [function] void push(Object obj)
 *                     void pop()
 *                     boolean isEmpty()
 */

public class MyStack {
    private LinkedList l;

    public MyStack() {
        //initiate l
        l = new LinkedList();
    }

    public void push(Object obj) {
        l.addFirst(obj);
    }

    public Object pop() {
        return l.removeFirst();
    }

    public boolean isEmpty() {
        return l.isEmpty();
    }

}
