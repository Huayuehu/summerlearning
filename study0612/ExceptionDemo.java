package study0612;

/**
 * 异常分类：
 * 		错误	Error: 合理的应用程序不应该试图捕获的严重问题。说明我们不需要处理这种问题，比如说内存溢出
 * 		异常	Exception: 合理的应用程序想要捕获的条件，说明是需要我们进行处理的
 * 			    编译时期异常: 非RuntimeException, 这是我们必须要处理的异常
 * 			    运行时期异常: RuntimeException, 这种异常，一般我们也是不需要处理的。一般出现这样的问题，应该是我们写的代码出问题了
 *
 * JVM的默认处理方案:
 * 		程序出现了异常，如果我们没有做任何处理，jvm会做出了默认的处理：把异常的类名，产生的原因以及出现的位置等信息显示在了控制台，并让程序从这里结束了。
 *
 * java中我们如何处理异常?
 *      A:try…catch…finally
 *      B:throws
 *
 *      A.try…catch…finally格式
 *          try {
 * 		        可能出现问题的代码
 *          }catch(异常名 变量) {
 * 		        针对问题的处理
 *          }finally {
 * 		        释放资源的代码
 *          }
 *
 *          finally之后单独讲，先使用简单的格式：
 *          try {
 * 		        可能出现问题的代码
 *          }catch(异常类名 变量) {
 * 		        针对问题的处理
 *          }
 *
 * 注意：A. try里面的代码越少越好
 *      B. catch里面必须有内容，哪怕有一个提示
 *
 */

public class ExceptionDemo {
    public static void main(String args[]) {
        int a = 6;
        int b = 0;

        try {
            System.out.println( a / b);
        } catch (ArithmeticException ae) {
            System.out.println("b cannot be zero! ");
        }
    }
}
