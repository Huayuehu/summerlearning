package study0530;

/**
 * 	内部类：把类定义在其他类的内部，这个类就被称为内部类。
 * 		   举例：把类A定义在类B的内部，A被称为内部类。
 * 	内部类的访问特点：
 * 		A:内部类可以直接访问外部类的成员，包括私有。
 * 		B:外部类要访问内部类的成员，必须创建对象。
 * 	根据内部类在类中的位置不同，内部类可以分为：
 * 		A:成员位置
 * 			成员内部类
 * 		B:局部位置
 * 			局部内部类
 * 	成员内部类：
 * 		A:访问内部的方法
 * 			创建内部类的对象即可。
 * 			格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象;
 */


public class InnerClassDemo {
    public static void main(String args[]) {
        //Inner i1 = new Inner();
        Outer.Inner oi = new Outer().new Inner();
        oi.show();

        System.out.println("--------------------------");

        Outer o = new Outer();
        o.method();

    }



}

class Outer {
    private int num = 10;

    //public Outer () {}

    public class Inner {
        //public Inner () {}

        public void show ()  {
            System.out.println("This is inner class: ");
            System.out.println("The num in the outer class is " + num);//内部类可以直接访问外部类的成员，包括私有
        }
    }

    public void method () {
        Inner i = new Inner(); //外部类要访问内部类的成员，必须创建对象
        i.show();
    }

}

