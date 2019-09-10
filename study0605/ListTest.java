package study0605;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List集合的特有功能：
 * 		void add(int index,Object obj):在指定索引位置添加元素
 *		Object remove(int index):删除指定索引位置的元素，并把删除掉的元素值返回
 *		Object get(int index):根据给定索引，返回元素
 *		Object set(int index,E element):修改指定索引处的元素为给定的元素，并返回被修改的值
 */

public class ListTest {
    public static void main(String args[]) {
        List l = new ArrayList();

        Student s1 = new Student("rjx", 37);
        Student s2 = new Student("tfz", 35);
        Student s3 = new Student("cjh", 37);

        l.add(s1);
        l.add(s2);
        l.add(s3);

        //void add(int index,Object obj):在指定索引位置添加元素
        Student s4 = new Student("hhy", 23);
        l.add(2, s4);
        Iterator it = l.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s);
        }

        //Object remove(int index):删除指定索引位置的元素，并把删除掉的元素值返回
        System.out.println("remove: " + l.remove(2));

        //Object get(int index):根据给定索引，返回元素
        System.out.println("get: " + l.get(0));

        //Object set(int index,E element):修改指定索引处的元素为给定的元素，并返回被修改的值
        Student s5 = new Student("WY", 15);
        Student sSet = (Student) l.set(2, s5);
        System.out.println("set: " + sSet);

        //System.out.println("list: " + l);


        //  List集合的特有遍历：普通for循环
        //  size()方法和get()方法结合使用
        for (int i = 0; i < l.size(); i++) {
            Student s6 = (Student) l.get(i);
            System.out.println(s2.getName() + ", " + s2.getAge());
        }


    }
}
