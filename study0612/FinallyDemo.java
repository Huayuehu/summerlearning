package study0612;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * finally:
 *
 * 格式：
 *      try……catch……finally……
 *
 * 特点：被finally控制的语句体一定会执行；但如果在执行到finally之前jvm退出了(System.exit(0))，则该语句体不会执行
 *
 * 面试题：
 * final,finally和finalize的区别?
 * final:修饰类，修饰成员变量，修饰成员方法
 * 		修饰类,类不能被继承
 * 		修饰成员变量，变量是常量
 * 		修饰成员方法，方法不能被重写
 * finally:是异常处理的一部分，被finally控制的代码永远会执行，用于释放资源。
 * finalize:是Object类的方法，启动垃圾回收器，用于回收垃圾。
 *
 * 如果catch里面有return语句，请问finally的代码还会执行吗?如果会，是在return前还是return后？
 * 会执行；前
 * 准确的说法：中间。
 * 整个过程有三步：
 * 		1：执行到return a这一步的时候其实是return 30，在内存中形成了一个返回路径
 * 		2：由于它发现还有一个finally，所以，继续执行了finally，a = 40
 * 		3：finally结束后，再次回到以前的返回路径，继续。所以返回的是30
 *
 */

public class FinallyDemo {
    public static void main(String args[]) {
/*        String s = "20190619";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            System.out.println("This sentence will be executed no matter how. ");
        }
        System.out.println(d);*/

        //******************************************

        System.out.println("return value is " + finallyTest());//40
    }

    private static int finallyTest() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            a = 30;
            return a;
        } finally {
            a = 40;
        }
        return a;
    }
}
