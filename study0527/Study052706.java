package study0527;

/**
 * extends与override的练习：
 * 	猫 (Cat)：
 * 		成员变量：姓名，年龄
 * 		构造方法：无参，带参
 * 		成员方法：getXxx()/setXxx()，show()，catchMouse()
 * 	狗 (Dog)：
 * 		成员变量：姓名，年龄
 * 		构造方法：无参，带参
 * 		成员方法：getXxx()/setXxx()，show()，watchForDoor()
 * 	动物 (Animal)：
 * 		成员变量：姓名，年龄
 * 		构造方法：无参，带参
 * 		成员方法：getXxx()/setXxx()，show()

 * 	测试类 (Study052706)：
 * 		main(String[] args):
 */


public class Study052706 {
    public static void main(String args[]) {
        //for cat class
        Cat c1 = new Cat();
        c1.setName("wxy");
        c1.setAge(23);
        c1.show();
        c1.catchMouse();
        System.out.println("--------------------------");
        Cat c2 = new Cat("Wei Xue", 21);
        c2.show();
        c2.catchMouse();
        System.out.println("--------------------------");

        //for dog class
        Dog d1 = new Dog();
        d1.setName("one");
        d1.setAge(19);
        d1.show();
        d1.watchForDoor();
        System.out.println("--------------------------");
        Dog d2 = new Dog("Xinyi Cai", 22);
        d2.show();
        d2.watchForDoor();
        System.out.println("--------------------------");
    }
}

class Animal {
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

    public void show () {
        System.out.println("Animal has a name and age: " + this.getName() + ", " + this.getAge() + ". ");
    }
}

class Cat extends Animal{
    public Cat () {}

    public Cat (String name, int age) {
        super(name, age); //so concise!!!!
    }

    public void catchMouse () {
        System.out.println(this.getName() + " can catch mouse. ");
    }

    public void show () {
        System.out.println("This cat has a name and age: " + this.getName() + ", " + this.getAge() + ". ");
    }
}


class Dog extends Animal{
    public Dog () {}

    public Dog (String name, int age) {
        super(name, age); //so concise!!!!
    }

    public void watchForDoor () {
        System.out.println(this.getName() + " can watch for the door. ");
    }

    public void show () {
        System.out.println("This dog has a name and age: " + this.getName() + ", " + this.getAge() + ". ");
    }
}