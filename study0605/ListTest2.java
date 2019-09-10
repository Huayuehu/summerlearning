package study0605;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator:
 * 		A:ListIterator是Iterator的子接口
 * 		B:ListIterator可以逆向遍历，但是意义不大。
 * 			因为它需要先正向遍历。
 * 		C:需求：我有一个集合，里面有三个元素"hello","world","java",请写程序实现如下操作
 *          	         判断这个集合中有没有元素为world的，如果有，就添加一个元素Android。
 *
 *        分析：
 *   		    A.创建一个集合，并添加多个元素
 *   		    B.遍历集合，获取到每一个元素
 *   		    C.判断元素有没有是"world"的，如果有，就往集合中添加一个新元素android
 *   		    D.直接输出集合名称
 *
 *        ConcurrentModificationException:并发修改异常。
 *
 *        原因：
 *   		    迭代器是依赖于集合而存在的，我们用迭代器遍历集合的时候，如果有满足条件的，
 *   		    我们就通过集合调用add()功能添加了一个元素，也就是说这个时候，集合发生了改变，
 *   		    而迭代器并没有发生改变，这样就产生了这个问题。
 *   		    这个问题的主要原因：通过迭代器去遍历集合的时候，不能在通过集合去操作。
 *
 *        解决方案：
 *   		    A.用普通for遍历，并用集合去添加元素
 * 				B.用ListIterator遍历，并用ListIterator去添加元素
 */

public class ListTest2 {
    public static void main(String args[]) {
        List l = new ArrayList();

        l.add("hello");
        l.add("world");
        l.add("java");

        //A.用普通for遍历，并用集合去添加元素
        for (int i = 0; i < l.size(); i++) {
            String s = (String) l.get(i);
            if (s.equals("world")) {
                l.add("IOS");
            }
        }
        System.out.println(l);

        //B.用ListIterator遍历，并用ListIterator去添加元素
        ListIterator li = l.listIterator();
        while (li.hasNext()) {
            String s = (String) li.next();
            if (s.equals("world")) {
                li.add("IOS");//加的位置是在当前位置之后
            }
        }
        System.out.println(l);
    }
}
