package study0529;

/**
 * 	我们在做一个程序设计的时候，请从具体的开始分析，看有哪些共性的内容，不断的向上抽取。
 * 	    分析的过程：从具体到抽象。
 * 	    实现的过程：从抽象到具体。
 * 	    使用的时候：使用的是具体的对象。
 *
 * 	猫狗案例,加入跳高的额外功能：
 * 	运动：(interface)
 * 		成员方法：跳高。
 * 	猫：(class)
 * 		成员变量：姓名，年龄
 * 		构造方法：无参，带参
 * 		成员方法：getXxx()/setXxx，吃饭，睡觉
 * 	狗：(class)
 * 		成员变量：姓名，年龄
 * 		构造方法：无参，带参
 * 		成员方法：getXxx()/setXxx，吃饭，睡觉
 * 	猫狗有很多共性的内容，所以我们要进行提取：
 *
 * 	动物：(abstract class)
 * 		成员变量：姓名，年龄
 * 		构造方法：无参，带参
 * 		成员方法：getXxx()/setXxx，吃饭()，睡觉(){}
 *
 * 	抽象类：
 * 		动物(抽象类)
 * 			猫(具体类)
 * 				具备跳高功能的猫(具体类)
 * 			狗(具体类)
 * 				具备跳高功能的狗(具体类)
 * 		运动员(接口)
 * 	多态的前提：
 * 		A:有继承或者实现关系
 * 		B:有方法的重写
 * 		C:有父类或者父接口引用指向子类对象
 * 	多态的表现形式：
 * 		具体类多态
 * 		抽象类多态
 * 		接口多态
 * 	我们目前最常用的是具体类创建对象并使用。
 *
 */


//as test class containing main method
public class AnimalInterfaceDemo {
    public static void main(String args[]) {
        //JumpCat
        System.out.println("Belows are information about jump cat 1: ");
        JumpCat jc1 = new JumpCat();
        jc1.setName("跳跳猫");
        jc1.setAge(2);
        System.out.println("Name and age are as follows: " + jc1.getName() + ", " + jc1.getAge());
        jc1.sleep();
        jc1.eat();
        jc1.jump();

        System.out.println("------------------------------------------");

        System.out.println("Belows are information about jump cat 2: ");
        JumpCat jc2 = new JumpCat("多来A梦",100);
        System.out.println("Name and age are as follows: " + jc2.getName() + ", " + jc2.getAge());
        jc2.sleep();
        jc2.eat();
        jc2.jump();

        System.out.println("------------------------------------------");

        //多态
        Animal ani = new JumpCat("blue cat", 6);
        System.out.println("Name and age are as follows: " + ani.getName() + ", " + ani.getAge());
        ani.sleep();
        ani.eat();
        ((JumpCat) ani).jump();

        System.out.println("------------------------------------------");

        Sport s = new JumpCat("red cat", 7);
        //System.out.println("Name and age are as follows: " + s.getName() + ", " + s.getAge());
        ((JumpCat) s).sleep();
        ((JumpCat) s).eat();
        s.jump();
    }
}

//interface Sport containing one abstract method
interface Sport {
    public abstract void jump ();
}

//abstract class Animal as Father class of Cat
abstract class Animal {
    private String name;
    private int age;

    public Animal () {}

    public Animal (String name, int age) {
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

    public void sleep () {
        System.out.println("Animals need sleep. ");
    }

    public abstract void eat ();
}


//class Cat as son class of Animal;
//          as father class of JumpCat
class Cat extends Animal {

    public Cat () {}

    public Cat (String name, int age) {
        super(name, age);
    }

    @Override
    //override abstract method eat() in Father class
    public void eat() {
        System.out.println("Cat eats fish. ");
    }
}


//class JumpCat as son class of Cat, it can do all the things cat can do
//jump cat can do sport, so it implements Sport interface
class JumpCat extends Cat implements Sport {
    public JumpCat () {}

    public JumpCat (String name, int age) {
        super(name, age);
    }

    @Override
    //override abstract method jump() in interface Sport
    public void jump() {
        System.out.println("Jump cat is good at sport, V5!");
    }
}

