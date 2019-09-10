package study0620;

/**
 * 递归:方法定义中调用方法本身的现象
 *
 * Math.max(Math.max(a, b), c);这是方法的嵌套，而不是递归
 * public void show(int a) {
 *     show(a);
 * }这个才是递归
 *
 *
 * 注意事项：
 * 		A:递归一定要有出口，否则就是死递归
 * 		B:递归的次数不能过多，否则内存溢出(StackOverflowError:当应用程序递归太深而发生堆栈溢出时，抛出该错误)
 * 		C:构造方法不能递归使用
 *
 * 实现分析：
 *      (1)做递归要写一个方法
 *      (2)要有出口条件
 *      (3)规律
 */


/**
 * 需求：求5的阶乘
 *
 * 定义一个方法Factorial:
 *      返回值类型: int
 *      参数列表: int n
 *
 * 出口条件:
 *      1！= 1
 *      i.e.
 *      if (n == 1) {
 *          return 1;
 *      }
 *
 * 规律:
 *      if (n != 1) {
 *          return n*Factorial(--n);
 *      }
 *
 */
public class RecursionDemo {
    public static void main(String args[]) {
        RecursionDemo rd = new RecursionDemo();
        System.out.println(rd.factorial(5));
    }

    public int factorial(int n) {
        int num = n;

        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
