package study0620;

/**
 * 兔子问题(斐波那契数列):有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第20个月的兔子对数为多少？
 * 			 兔子对数
 *  第一个月：	1
 *  第二个月：	1
 *  第三个月：	2
 *  第四个月：	3
 *  第五个月：	5
 *  第六个月：	8
 *  ...
 *
 *  斐波那契数列：1,1,2,3,5,8...
 *
 *  规律：从第三项开始，每一项是前两项之和
 *  出口：前两项应该是已知。第一项1，第二项1
 *
 */

public class RecursionFib {
    public static void main(String args[]) {
        RecursionFib rf = new RecursionFib();

        System.out.println(rf.fibNum(1));
        System.out.println(rf.fibNum(2));
        System.out.println(rf.fibNum(3));
        System.out.println(rf.fibNum(4));
        System.out.println(rf.fibNum(5));
        System.out.println(rf.fibNum(6));

    }

    public int fibNum(int n) {
        int num = n;
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return fibNum(n - 1) + fibNum(n - 2);
        }
    }
}
