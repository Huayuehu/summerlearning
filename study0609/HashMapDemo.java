package study0609;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap: 基于Hashtable的Map接口实现
 *          Hashtable用来保证键的唯一性
 *
 * HashMap<String,String>
 * 键：学生姓名
 * 值：地址
 * 存储三个元素，然后遍历
 */

public class HashMapDemo {
    public static void main(String args[]) {
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("hhy", "jiangxi");
        hm.put("tfz", "xinzhu");
        hm.put("rjx", "taibei");
        hm.put("cjh", "pingdong");

        //遍历-way1
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            String value = hm.get(key);
            System.out.println(key + "---" + value);
        }

        System.out.println("---------------------------------");

        //遍历-way2
        Set<Map.Entry<String, String>> entrySet = hm.entrySet();
        for (Map.Entry<String, String> me : entrySet) {
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "---" + value);
        }
    }

}
