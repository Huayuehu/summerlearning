package study0605;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 去除集合中自定义对象的重复值(对象的成员变量值都相同)
 * Student:name,age
 *
 * 方法与ArrayListTest中类似，也会用到两个ArrayList，并且用到contains()
 * 但集合的contains()方法底层源码依赖的是元素对象的equals()方法
 * 而默认情况下，Student所属的类继承了Object类的equals()方法，比较的是地址值
 * 想要比较对象的成员变量值相同，就必须重写equals()方法。
 */

public class StudentArrayListTest {
    public static void main(String args[]) {
        // 创建集合对象
        ArrayList array = new ArrayList();

        // 创建学生对象
        Student s1 = new Student("林青霞", 28);
        Student s2 = new Student("王祖贤", 27);
        Student s3 = new Student("杨幂", 27);
        Student s4 = new Student("李若彤", 25);
        Student s5 = new Student("张惠妹", 40);
        Student s6 = new Student("赵雅芝", 60);
        Student s7 = new Student("林青霞", 20);
        Student s8 = new Student("林青霞", 28);

        // 把学生对象添加到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);
        array.add(s6);
        array.add(s7);
        array.add(s8);

        ArrayList newArray = new ArrayList();

        for (int i = 0; i < array.size(); i++) {
            Student s = (Student) array.get(i);
            if (!newArray.contains(s)) {
                newArray.add(s);
            }
        }

        Iterator it = newArray.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s);
        }
    }
}
