package study0605;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *  Iterator iterator()
 *
 * 	迭代器的使用
 * 		A:迭代器的使用
 * 			依赖于集合存在,本身有两个方法
 * 			a:boolean hasNext():是否有下一个元素
 * 			b:Object next():获取下一个元素,并自动移动到下一个位置等待
 * 		    c:NoSuchElementException:没有这样的元素异常。
 *   		原因是：你已经获取到元素的末尾了，你还要获取元素，已经没有元素了，所以报错。
 * 		B:集合的使用步骤
 * 			a:创建集合对象
 * 			b:创建元素对象
 * 			c:把元素添加到集合中
 * 			d:遍历集合
 * 				通过集合对象获取迭代器对象
 * 				通过迭代器对象的hasNext()方法判断是否有元素
 * 				通过迭代器对象的next()方法获取元素，并移动到下一个位置
 * 		C:迭代器的原理
 * 			定义为了接口，由具体的集合类通过内部类的方式提供实现
 *
 */

public class IteratorTest {
    public static void main(String args[]) {
/* 基础
        Collection c = new ArrayList();

        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("aaaaaaa");
        c.add("Silhouettes of me");

        Iterator it = c.iterator();

        while (it.hasNext()) {
            //Object next():获取下一个元素,并自动移动到下一个位置等待
            //返回值是Object类型，要强制类型转换成String
            String s = (String) it.next();
            System.out.println(s);
        }
        */
/* 练习
        用集合存储学生类对象
        用迭代器遍历并输出

 */
        Collection c = new ArrayList();

        Student s1 = new Student("rjx", 37);
        Student s2 = new Student("tfz", 35);
        Student s3 = new Student("cjh", 37);

        c.add(s1);//向上转型
        c.add(s2);
        c.add(s3);

        Iterator it = c.iterator();

        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s);//因为我在Student class里override toString()，所以可以直接按照格式输出
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }


}
