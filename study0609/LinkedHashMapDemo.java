package study0609;

/**
 * LinkedHashMap: 是Map接口的哈希表和链表的实现，具有可预知的迭代顺序
 * 由哈希表保证key的唯一性
 * 由链表保证键的有序(存储与取出的顺序一致)
 */

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String args[]) {
        LinkedHashMap<Student, String> map = new LinkedHashMap<Student, String>();

        Student s1 = new Student("林青霞", 28);
        Student s2 = new Student("风清扬", 31);
        Student s3 = new Student("王重阳", 200);
        Student s4 = new Student("林青霞", 28);
        Student s5 = new Student("风清扬", 20);
        Student s6 = new Student("王阳", 100);
        Student s7 = new Student("王阳", 100);

        map.put(s1, "001");
        map.put(s2, "002");
        map.put(s3, "003");
        map.put(s4, "004");
        map.put(s5, "005");
        map.put(s6, "004");
        map.put(s7, "004");

        Set<Student> set = map.keySet();
        for (Student key : set) {
            String value = map.get(key);
            System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
        }
    }

}
