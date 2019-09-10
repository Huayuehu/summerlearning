package study0607.GetRandomNumberProject;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 *
 * 分析：
 * 		A:创建随机数对象
 * 		B:定义HashSet集合，存储Integer类型的数据
 * 		C:直接判断集合的长度
 * 			小于10，继续产生随机数，存储
 * 		D:遍历集合
 */

public class HashSetDemo {
    public static void main(String args[]) {
        Random r = new Random();

        HashSet<Integer> hs = new HashSet<Integer>();

        while (hs.size() < 10) {
            int num = r.nextInt(20) + 1;
            hs.add(num);
        }

        for (int i : hs) {
            System.out.println(i);
        }


    }
}
