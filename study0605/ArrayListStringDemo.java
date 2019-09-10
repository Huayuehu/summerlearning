package study0605;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 如何在定义集合的时候，去明确集合的元素类型呢?
 * 从JDK5以后，就提供了一个新的技术：泛型
 * 泛型：把明确数据类型的工作推迟到了创建对象或者调用方法的时候去做的。
 * 格式：
 * 		<> 数据类型。
 * 我们在哪些地方使用泛型呢?
 * 		一般就是在集合中常见。查看API，如果类，抽象类，接口后面跟的有<?>就说明要用泛型。
 *
 * 泛型的好处：
 * 		A:提高了程序的安全性
 * 		B:将运行期遇到的问题转移到了编译期
 * 		C:省去了类型强转的麻烦
 *
 * 练习：
 * 		用ArrayList存储自定义对象，并遍历。加入泛型。
 */

public class ArrayListStringDemo {
    public static void main(String args[]) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            String s = it.next();//前面用了泛型明确了Object类型，这里就不用强制类型转换了
            System.out.println(s);
        }

        System.out.println("--------------------------");

        ArrayList<Student> arrStu = new ArrayList<Student>();

        Student s1 = new Student("林青霞", 28);
        Student s2 = new Student("王祖贤", 27);
        Student s3 = new Student("杨幂", 27);

        arrStu.add(s1);
        arrStu.add(s2);
        arrStu.add(s3);

        Iterator<Student> itStu = arrStu.iterator();
        while (itStu.hasNext()) {
            Student s = itStu.next();
            System.out.println(s);
        }

    }
}
