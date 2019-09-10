package study0527;

/**
 * Theme: extends and overrides and keyword: final
 * final: a. when using in father class's function, this function cannot be override by son class
 *        b. when using in father class's variable:
 *              i) member variable, it turns to CONSTANT
 *              ii) local variable, the number of this local variable cannot be changed or the address cannot be changed
 * polymorphism:
 *        1. [example] Human h = new Student();
 *                     Human hh = new Teacher();
 *                     Student ss = new Student();
 *        2. 多态的成员访问特点：
 * 		     A:成员变量
 * 			        编译看左边，运行看左边。
 * 		     B:成员方法
 * 			        编译看左边，运行看右边。(因为成员方法有重写，而变量没有。)
 * 		     C:静态方法
 * 			        编译看左边，运行看左边。(静态方法其实没有重写这一说。因为它是跟类相关。)
 * 			 D:缺点
 * 			        不能访问子类的特有功能
 *
 *
 * class Student & class Teacher extends Human
 * class Student:
 *              [variable] name
 *                         age
 *
 *              [function] setXxx()/getXxx()
 *                         eat()
 *                         sleep()
 *                         study()
 * class Teacher:
 *              [variable] name
 *                         age
 *              [function] setXxx()/getXxx()
 *                         eat()
 *                         sleep()
 *                         teach()
 * characters in common:
 * class Human:
 *              [variable] name
 *                         age
 *              [function] setXxx()/getXxx()
 *                         eat()
 *                         sleep()
 *                         love() (final: cannot be override by son class)
 *
 * class Study052705: demo class
 */



public class Study052705 {
    public static void main(String args[]) {
        //class Student
        Student s1 = new Student();
        s1.setName("Huayue Hua");
        s1.setAge(23);
        System.out.println("Student's name and age: " + s1.getName() + ", " + s1.getAge() + ". ");
        s1.eat();
        s1.sleep();
        s1.study();
        s1.love();

        System.out.println("-----------------------------");

        //class Teacher
        Teacher t1 = new Teacher();
        t1.setName("Prof. Ali Zahid");
        t1.setAge(60);
        System.out.println("Teacher's name and age: " + t1.getName() + ", " + t1.getAge() + ". ");
        t1.eat();
        t1.sleep();
        t1.teach();
        t1.love();



    }
}

class Human {
    private String name;
    private int age;

    public Human () {}

    public Human (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat () {
        System.out.println("Human need eat. ");
    }

    public void sleep () {
        System.out.println("Human need sleep. ");
    }

    public final void love () {
        System.out.println("HAIL LOVE!");
    }
}

class Student extends Human {
    public Student () {}

    public void study () {
        System.out.println("Student needs study. ");
    }

    //override eat in Human
    public void eat () {
        System.out.println("Student needs eat. ");
    }

    //override sleep in Human
    public void sleep () {
        System.out.println("Student needs sleep. ");
    }

}

class Teacher extends Human {
    public Teacher () {}

    public void teach () {
        System.out.println("Teacher needs teach. ");
    }

    //override eat in Human
    public void eat () {
        System.out.println("Teacher needs eat. ");
    }

    //override sleep in Human
    public void sleep () {
        System.out.println("Teacher needs sleep. ");
    }

}