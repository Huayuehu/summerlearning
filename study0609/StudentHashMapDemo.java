package study0609;

import java.util.HashMap;
import java.util.Set;

/**
 * HashMap<Student,String>
 * Key：Student (name,age)
 * Value：String (学号)
 * 要求存储三个学生，并遍历。输出的格式是：
 * 		name---age---studentID
 * 注意：如果两个学生对象的成员变量值都相同，我们就认为这是同一个对象，也就是说这是重复的键。
 */

public class StudentHashMapDemo {
    public static void main(String args[]) {
        HashMap<Student, String> hm = new HashMap<Student, String>();

        Student s1 = new Student("林青霞", 28);
        Student s2 = new Student("风清扬", 31);
        Student s3 = new Student("王重阳", 200);
        Student s4 = new Student("林青霞", 28);
        Student s5 = new Student("风清扬", 20);
        Student s6 = new Student("王阳", 100);
        Student s7 = new Student("王阳", 100);

        hm.put(s1, "001");
        hm.put(s2, "002");
        hm.put(s3, "003");
        hm.put(s4, "004");
        hm.put(s5, "005");
        hm.put(s6, "006");
        hm.put(s7, "006");

        Set<Student> set = hm.keySet();
        for (Student key : set) {
            String value = hm.get(key);
            System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
        }
    }
}
