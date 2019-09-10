package study0610;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections：是针对集合进行操作的工具类，都是静态方法。
 * 面试题?
 * 		Collections和Collection的区别?
 * 		Collections: 类；是针对集合进行操作的工具类，包含了排序和查找等功能。
 * 		Collection: 接口；是单列集合的顶层接口，定义了单列集合的共性功能。
 *
 * 掌握的功能：
 * 		public static <T> void sort(List<T> list):排序，默认情况下是自然排序，要求T实现自然排序接口comparable
 *		public static <T> int binarySearch(List<?> list,T key):二分查找
 *		public static <T> T max(Collection<?> coll):最大值
 *		public static void reverse(List<?> list):反转
 *		public static void shuffle(List<?> list):随机置换
 */

public class CollectionsDemo {
    public static void main(String args[]) {
        List<Integer> l = new ArrayList<Integer>();

        l.add(10);
        l.add(50);
        l.add(20);
        l.add(30);
        l.add(40);

        // void sort(List<T> list)
        Collections.sort(l);
        System.out.println("sort: " + l);

        // int binarySearch(List<?> list,T key)
        System.out.println("binarySearch 20: " + Collections.binarySearch(l, 20));
        System.out.println("binarySearch 200: " + Collections.binarySearch(l, 200));//找不到的时候返回 "-(最大索引+1)"

        // void reverse(List<?> list)
        Collections.reverse(l);
        System.out.println("reverse: " + l);

        // void shuffle(List<?> list)
        Collections.shuffle(l);
        System.out.println("shuffle: " + l);

    }
}
