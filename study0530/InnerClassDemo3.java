package study0530;

/**
 *
 * 	匿名内部类：没有名字的内部类
 *
 * 	前提：存在一个类或者接口
 * 			这里的类可以是具体类也可以是抽象类。
 * 	格式：
 * 		new 类名或者接口名() {
 * 			重写方法;
 *                }
 * 	本质理解：其本质是匿名子类对象
 *
 *
 *  ※※
 *  ※按照要求，补齐代码
 * 	interface Inter { void show(); }
 * 	class Outer { //补齐代码 }
 * 	class OuterDemo {
 * 	    public static void main(String[] args) {
 * 		      Outer.method().show();
 *                    }
 * 	}
 *  要求在控制台输出”HelloWorld”
 *
 *
 *  内部类总结(理解)
 * 	(1)把类A定义在类B内部，类A就被称为内部类
 * 	(2)访问特点：
 * 		A:内部类可以直接访问外部类的成员，包括私有
 * 		B:外部类要想访问内部类的成员，必须创建对象
 * 	(3)内部类的分类：
 * 		A:成员内部类
 * 		B:局部内部类
 * 	(4)成员内部类
 * 		A:private
 * 		B:static
 * 	(5)局部内部类
 * 		A:面试题
 * 			局部内部类访问局部变量，必须加final修饰
 * 	(6)匿名内部类(掌握)
 * 		A:没有名字的内部类
 * 		B:前提
 * 			存在一个类或者接口
 * 		C:格式
 * 			new 类名或者接口名() {
 * 				重写方法();
 *          };
 *
 * 			本质：是一个匿名子类对象
 * 	(7)开发中如何使用
 * 		不用在定义一个新的类了。直接通过匿名内部类的格式就可以搞定
 *
 * 		interface Person {
 * 			public abstract void show();
 * 		}
 *
 * 		class PersonDemo {
 * 			public void method(Person p) {
 * 				p.show();
 * 			}
 * 		}
 *
 * 		PersonDemo pd = new PersonDemo();
 * 		pd.method(
 * 	    	new Person(){
 * 			    public void show(){        ...}
 * 		    }
 * 		);
 *
 */


public class InnerClassDemo3 {
    public static void main(String args[]) {
        Outer3.method().show();//Outer3.method():类名能够直接调用方法，说明该方法是静态的
        //Outer3.method().show(): 链式编程[new A().b().c().d()]，show()方法之前的内容应该是一个对象
    }
}

interface Inter {
    void show();
}

class Outer3 {
    public static Inter method () {//返回一个接口的实现对象
        return new Inter () {//new Inter()里面要override show()
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };// “;” expected here
    }

}
