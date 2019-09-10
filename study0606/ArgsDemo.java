package study0606;

/**
 * 可变参数：定义方法的时候不知道该定义多少个参数
 * 格式：
 * 		修饰符 返回值类型 方法名(数据类型…  变量名){
 *
 * 		}
 * 注意事项：
 * 		A:这里的变量其实是一个数组。它会自动把参数组装成一个数组里面去。
 * 		B:一个方法中的可变参数只能出现在形式参数的最后。
 */

public class ArgsDemo {
    public static void main(String args[]) {
        int a = 330;
        int b = 1110;
        System.out.println(sum(a,b));

        System.out.println("---------------");

        System.out.println(sum(1,2, 3, 4, 5, 6, 7, 8, 9));

    }

    public static int sum (int a, int... b) {
        int result = a;
        for (int i : b) {
            result += i;
        }
        return result;
    }

}

