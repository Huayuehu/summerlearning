package study0609;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap: 基于红黑树的Map接口实现
 *
 * TreeMap: 存入的是已经排序了的
 * HashMap: 按照存入顺序存储
 */

public class TreeMapDemo {
    public static void main(String args[]) {
        TreeMap<Student, String> tm = new TreeMap<Student, String>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num1 = o1.getAge()-o2.getAge();
                int num2 = num1 == 0 ? o1.getName().compareTo(o2.getName()) : num1;
                return num2;
            }
        });

        Student s1 = new Student("huahuayue", 28);
        Student s2 = new Student("tianfuzhen", 31);
        Student s3 = new Student("renjiaxuan", 200);
        Student s4 = new Student("chenjiahua", 28);
        Student s5 = new Student("fujin", 20);
        Student s6 = new Student("wuxuanyi", 100);
        Student s7 = new Student("wuxuanyi", 100);

        tm.put(s1, "001");
        tm.put(s2, "002");
        tm.put(s3, "003");
        tm.put(s4, "004");
        tm.put(s5, "005");
        tm.put(s6, "006");
        tm.put(s7, "007");

        Set<Student> set = tm.keySet();
        for (Student key : set) {
            String value = tm.get(key);
            System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
        }

    }
}
