package study0530;

/**
 * innerclass with static
 */

public class InnerClassDemo2 {
    public static void main(String args[]) {
        //Outer1.Inner1 oi2 = new Outer1().new Inner1();//加了static之后不能这样创建对象了
        Outer1.Inner1 oi2 = new Outer1.Inner1();
        oi2.show();
        oi2.show2();
        //Outer1.Inner1.show();
        Outer1.Inner1.show2();
    }
}

class Outer1 {
    int num1 = 30;
    static int num2 = 50;


    public static class Inner1 {
        public void show () {
            System.out.println("Inner show() ");
            //System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
        }

        public static void show2 () {
            System.out.println("Inner show2() ");
            //System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
        }

    }
}
