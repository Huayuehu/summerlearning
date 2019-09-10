package study0606;


import java.util.ArrayList;

public class ArrayListToolTest {
    public static void main(String args[]) {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("tfz", 36);
        Student s2 = new Student("rjx", 38);
        Student s3 = new Student("cjh", 38);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        for (Student s : array) {
            System.out.println(s);
        }

    }
}
