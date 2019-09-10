package study0612;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 有些异常可以处理，但有些异常处理不了或没有权限处理
 * 为了解决这种出错的问题，java提出了throws
 *
 * 格式：throws 异常类名
 * 注意：这个格式必须跟在方法的括号后面
 *
 *
 * throws与try&catch：
 * 如果后续程序需要继续运行就用try&catch；否则用throws
 * 一般在main方法中偶读用try&catch
 */

public class ThrowsDemo {
    public static void main(String args[]) {
        try {
            method();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        method2();
    }

    //编译器异常的排除
    //在方法声明上抛出是为了告诉调用者，这个方法可能有问题
    //throws后面可以接多个异常名
    private static void method() throws ParseException, Exception {
        String s = "20190618";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }

    //运行期异常的抛出
    private static void method2() throws ArithmeticException {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

}
