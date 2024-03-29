package study0529;

/**
 * interface and implements
 *
 * 接口概述：现在在动物园里面，有些猫可以钻火圈，狗跳高，做计算等东西。
 * 		    而这些动作，并不是动物天生就就具备的，所以，不适合定义在动物类中。
 * 			并且，也不是所有的猫，或者狗具备这些功能，所以直接定义在猫或者狗类中也不合适。
 * 			针对这样的一种扩展功能，java就提供了接口来体现。
 * 接口的特点：
 * 		A:接口用关键字interface表示
 * 			格式：interface 接口名 {}
 * 		B:类实现接口用implements表示
 * 			格式：class 类名 implements 接口名 {}
 * 		C:接口不能实例化
 * 			接口多态
 * 		D:接口的子类
 * 			a:要么是抽象类
 * 			b:要么重写接口中的所有的抽象方法
 *
 * 接口的成员特点：
 * 		A:成员变量
 * 			是常量，并且是静态的修饰的。
 * 			默认的修饰符：public static final
 * 		B:构造方法
 * 			没有构造方法
 * 		C:成员方法
 * 			只能是抽象方法
 * 			默认的修饰符：public abstract
 * 		建议：
 * 			自己写接口的内容的时候，把这些默认修饰符加上。
 *
 * 	class类与类：
 * 		继承关系，只能单继承。可以多层继承。
 * 	class & interfac类与接口e：
 * 		实现关系，可以单实现，也可以多实现。
 * 		还可以在继承一个类的同时实现多个接口。
 * 	interface接口与接口：
 * 		继承关系，可以单继承，也可以多继承。
 *
 * 	抽象类和接口的区别?
 * 		A:成员区别
 * 		B:关系区别
 * 		C:设计理念区别
 * 			抽象类：父抽象类，里面定义的是共性内容。
 * 			接口：父接口，里面定义的是扩展内容。
 */

public class InterfaceDemo {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.show();
        System.out.println(d.num);
    }
}

interface Animala {
    int num = 20;
    public static final int num2 = 22;
    final int num3 = 10;

    //public Animal ();  //interface abstract methods cannot have body

    public abstract void show (); //1.默认的修饰符：public abstract; 2.不能有{}

}

class Dog implements Animala {
    public void show () {
        System.out.println("This is show() method. ");
    }
}