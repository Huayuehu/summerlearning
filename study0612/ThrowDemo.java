package study0612;

/**
 * throw；如果出现异常情况，我们可以把该异常抛出，这个时候抛出的是异常的对象；执行了throw则一定是抛出了某种异常
 * throws：在方法名上出现提示异常；表示出现异常的一种可能性，并不一定会发生这些异常
 */

public class ThrowDemo {
    public static void main(String args[]) {
        //method();
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void method() {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            System.out.println(a / b);
        }

    }

    private static void method2() throws Exception {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new Exception();
        } else {
            System.out.println(a / b);
        }

    }
}
