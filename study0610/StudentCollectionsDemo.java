package study0610;

/**
 * 自然排序与比较器排序
 * void sort(List<T> list)
 * void sort(List<T> list, new Comparator<>() {})
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentCollectionsDemo {
    public static void main(String args[]) {
        List<Student> l = new ArrayList<Student>();

        Student s1 = new Student("诸葛亮", 34);
        Student s2 = new Student("蒋干", 33);
        Student s3 = new Student("曹操", 35);

        l.add(s1);
        l.add(s2);
        l.add(s3);

        //自然排序
        // void sort(List<T> list)
        Collections.sort(l);
        System.out.println(l);

        //比较器排序
        // void sort(List<T> list, new Comparator<>() {})
        Collections.sort(l, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num ;
                return num2;
            }
        });

        System.out.println(l);
    }
}
