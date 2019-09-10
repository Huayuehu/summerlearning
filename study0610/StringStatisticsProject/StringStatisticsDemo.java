package study0610.StringStatisticsProject;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * "dabcdababcabcea",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)
 *
 * 分析：
 *      (1) 定义一个字符串，也可以键盘输入
 *      (2) 定义一个TreeMap集合
 *              key: Character
 *              value: Integer
 *      (3) 把字符串转成字符数组
 *      (4) 遍历字符数组，得到每一个字符作为key
 *      (5) 按照key去找相应的value
 *              若返回值为null: 说明该键不存在，就把字符作为键，1作为值存储
 *              若返回值不为null: 说明该键已存在，就把值++，然后重新存储该key和value
 *      (6) 定义字符串缓冲区变量
 *      (7) 遍历集合，得到key和value
 *      (8) 输出
 */

public class StringStatisticsDemo {
    public static void main(String args[]) {
//        // 定义一个字符串
//        String s = "dabcdababcabcea";

        // 键盘输入
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a bunch of string: ");
        String s1 = in.nextLine();

        // 定义一个TreeMap集合
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

        // 字符串转成字符数组
        char[] chs = s1.toCharArray();

        // 遍历字符数组，得到每一个字符作为key
        for (char ch : chs) {

            // 按照key去找相应的value
            Integer i = map.get(ch);

            // 若返回值为null: 说明该键不存在，就把字符作为键，1作为值存储
            if (i == null) {
                map.put(ch, 1);
            }
            // 若返回值不为null: 说明该键已存在，就把值++，然后重新存储该key和value
            else {
                i++;
                map.put(ch, i);
            }

        }

        StringBuffer sb = new StringBuffer();

        Set<Character> set = map.keySet();
        for (char key : set) {
            Integer value = map.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        String result = sb.toString();
        System.out.println(result);
    }
}
