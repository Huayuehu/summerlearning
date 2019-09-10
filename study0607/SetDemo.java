package study0607;

import java.util.HashSet;

/**
 * Collection:
 * 		List:元素有序(存储和取出顺序一致)，可重复
 * 		Set:元素无序,唯一
 * HashSet：不保证 set 的迭代顺序，特别是它不保证该顺序恒久不变。
 *
 */

public class SetDemo {
    public static void main(String args[]) {
        HashSet<String> hashSet = new HashSet<String>();


        System.out.println(hashSet.add("hello"));
        System.out.println(hashSet.add("java"));
        System.out.println(hashSet.add("wy"));
        System.out.println(hashSet.add("tfz"));
        System.out.println(hashSet.add("hhy"));
        System.out.println(hashSet.add("hello"));

        System.out.println(hashSet);
    }
}
