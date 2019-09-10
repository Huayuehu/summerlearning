package study0605;

/**
 * Define an array, store three Student Object, and go through that array to get member variables of every Student Object
 *
 * Student[]: Object Array
 */

public class StudentDemo {
    public static void main(String args[]) {
        Student[] students = new Student[3];

        //syso default value
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        //initiate
        Student s1 = new Student("rjx", 37);
        Student s2 = new Student("tfz", 35);
        Student s3 = new Student("cjh", 37);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
