package study0607;

import java.util.TreeSet;

/**
 * TreeSet:底层数据结构是二叉树。
 * 可以让元素排序，有两种方案:
 *                          1.自然排序(元素具有比较性)：让元素所属的类实现自然排序接口Comparable
 *                          2.比较器排序(集合具有比较性)：让集合的构造方法接收一个比较器接口的子类对象Comparator
 *
 * 通过观察的现象：
 * 添加add()的时候，会和前面的元素进行比较，走的是自然排序里的compareTo()方法
 * 		如果返回的是正数：大，往后放
 * 		如果返回的是负数：小，往前放
 * 		如果返回的是0：说明重复。不放。
 */

public class TreeSetDemo {
    public static void main(String args[]) {
        // 20,18,23,22,17,24,19,18,24
        // 构造一个新的空的set，该set根据其元素的自然顺序进行排序。
        TreeSet<Integer> ts = new TreeSet<Integer>();

        // 存储元素
        ts.add(20);
        ts.add(18);
        ts.add(23);
        ts.add(22);
        ts.add(17);
        ts.add(24);
        ts.add(19);
        ts.add(18);
        ts.add(24);

        // 遍历集合
        for (Integer i : ts) {
            System.out.println(i);
        }
    }

}
