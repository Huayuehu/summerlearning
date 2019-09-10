package study0531;

public class StudentDemo {
    public static void main(String args[]) {
        Student s1 = new Student();
        System.out.println("s1's hashCode value:" + s1.hashCode());

        System.out.println("--------------------------");

        Student s2 = new Student();
        System.out.println("s2: " + s2);

        System.out.println("--------------------------");

        Student s3 = new Student("hhy", 23);
        System.out.println("s3: " + s3);//重写了toString方法
        Class c = s3.getClass();
        System.out.println("s3's class: " + c.getName());

        System.out.println("--------------------------");

        Student s4 = new Student("hhy", 23);
        boolean flag = s3.equals(s4);
        System.out.println("If s3 = s4? : " + flag);//重写了equals方法
    }
}
