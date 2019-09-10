package study0612;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * (1)多个异常的情况：
 *      A:针对每个异常，给出一个处理
 *      B:try...catch...catch...catch...
 *    注意：
 *      a:一旦try里面的代码有问题，就不在执行try里面的内容，和catch里面的内容依次的匹配，一旦有一个匹配，其他的不执行。
 *      b:如果异常是平级关系，谁先谁后无所谓。
 *        如果异常不是平级关系，子先父后。
 *      c:异常能明确的尽量明确
 *
 * (2)JDK7的新特性：针对平级关系的 catch(异常1 | 异常2 | 异常3 ... e) {}
 *
 *
 * (3)Java中的异常被分为两大类：编译时异常和运行时异常。所有的RuntimeException类及其子类的实例被称为运行时异常，其他的异常就是编译时异常
 *	  编译时异常
 *		    Java程序必须显示处理，否则程序就会发生错误，无法通过编译
 *	  运行时异常
 *		    无需显示处理，也可以和编译时异常一样处理
 *
 *
 * (4)在try里面出现exception时，jvm会帮我们生成一个异常对象，然后把这个对象抛出，和catch中的类进行匹配；如果是同一类型，就会执行该catch里面的处理信息
 *
 *
 * (5)exception中需要知道的方法：
 *      String getMessage():获取异常信息，返回字符串。
 *      String toString():获取异常类名和异常信息，返回字符串。
 *      void printStackTrace():获取异常类名和异常信息，以及异常出现在程序中的位置，并把以上信息输出在控制台。
 */

public class MultiExceptionDemo {
    public static void main(String args[]) {
        //method1();
        //method2();// 针对平级关系的: catch(异常1 | 异常2 | 异常3 ... e) {}
        //method3();
        method4();

    }

    public static void method1() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};

        try {
            System.out.println(a / b);
            System.out.println(arr[3]);
        } catch (ArithmeticException e) {
            System.out.println("b cannot be zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index is out of bounds!");
        } catch (Exception e) {
            System.out.println("something goes wrong!");
        }

        System.out.println("over");
    }


    public static void method2() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};

        try {
            System.out.println(a / b);
            System.out.println(arr[3]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("程序出问题了");
        }
        System.out.println("over");
    }

    public static void method3() {
        String s = "2019-0613";
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
        try {
            Date d = sdf.parse(s);//创建了一个ParseException对象，然后抛出去，和catch中的类进行匹配
            System.out.println(d);
        } catch (ParseException e) {
            System.out.println("There are something wrong about parsing the date format. ");
        }
    }

    public static void method4() {
        String s = "2019-0613";
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
        try {
            Date d = sdf.parse(s);
            System.out.println(d);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
