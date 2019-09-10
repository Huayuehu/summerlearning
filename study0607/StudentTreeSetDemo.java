package study0607;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentTreeSetDemo {
    public static void main(String args[]) {
        //TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());//外部类方法
        //如果一个方法的参数是接口，那么真正要的是接口的实现类的对象
        //而匿名内部类就可以实现这个东西
        //则上面的语句可改为：
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
           @Override
            public int compare(Student o1, Student o2) {
                //name length
                int num = o1.getName().length() - o2.getName().length();
                //name content
                int num2 = (num == 0) ? o1.getName().compareTo(o2.getName()) : num;
                //age
                int num3 = (num2 == 0) ? o1.getAge() - o2.getAge() : num2;
                return num3;
                }
        }
        );

        Student s1 = new Student("hhy", 23);
        Student s2 = new Student("hhy", 23);
        Student s3 = new Student("hhy", 0);
        Student s4 = new Student("tfz", 23);
        Student s5 = new Student("wy", 23);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student s : ts) {
            System.out.println(s);
        }
    }

}
