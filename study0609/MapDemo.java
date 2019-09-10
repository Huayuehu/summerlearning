package study0609;

import java.util.*;

/**
 * Map：元素是按照键值对形式存储的。每一对元素由两部分组成。分别叫键和值，key, value
 * 	         键是唯一的，值是可以重复的。
 * 	         Map集合的底层数据结构是针对键key有效，跟值value无关
 *
 * Map: (1) HashMap
 *      (2) TreeMap
 *
 * Map集合的功能：
 * 		A:添加功能
 * 			V put(K key,V value):
 * 		    (1) 如果键是第一次存储。就直接存储键和元素，返回null
 * 		    (2) 如果不是第一次存在，就用新的值把以前的值替换掉，返回以前的值
 * 		B:移除功能
 * 			void clear():移除所有映射关系
 * 			V remove(Object key): (1)根据键移除键值对元素，返回的是键对应的值
 * 		                          (2)如果这个键不存在，则返回null
 * 		C:判断功能
 * 			boolean containsKey(Object key):判断Map集合中是否包含指定的键
 * 			boolean containsValue(Object value):判断Map集合中是否包含指定的值
 * 			boolean isEmpty():判断集合是否为空
 * 		D:获取功能
 * 			Set<Map.Entry<K,V>> entrySet():返回的是键值对对象的Set集合。
 * 			V get(Object key):根据键获取值
 * 			Set<K> keySet():所有的键的集合
 * 			Collection<V> values():所有值的集合
 * 			int size():集合的长度
 *
 * Map集合的遍历：
 * 		思路：
 * 			A:获取所有的键值对的Set集合 keySet()
 * 			B:遍历key的，得到每一个key，增强for
 * 			C:用key去找value。V get(key key)
 *
 */

public class MapDemo {
    public static void main(String args[]) {
        Map<String, String> map = new HashMap<String, String>();

        //Value put(K key,V value)
        map.put("h", "1");
        map.put("h", "2");
        map.put("y", "3");
        map.put("tfz", "330");
        map.put("rjx", "1031");
        map.put("cjh", "618");
//      System.out.println("put: " + map.put("h", "1"));//null
//      System.out.println("put: " + map.put("h", "2"));//1
//      System.out.println("put: " + map.put("y", "2"));//null

        //map.clear();

        //Value remove(Object key)
        //System.out.println("remove: " + map.remove("y"));
        System.out.println("remove: " + map.remove("Selina"));

        System.out.println("----------------------------------------");

        //boolean containsKey(Object key)
        System.out.println("contains h: " + map.containsKey("h"));

        System.out.println("----------------------------------------");

        //boolean containsValue(Object value)
        System.out.println("contains 2: " + map.containsValue("2"));

        System.out.println("----------------------------------------");

        //Value get(Object key)
        System.out.println("get 'tfz': " + map.get("tfz"));

        System.out.println("----------------------------------------");

        System.out.println("set of key: ");
        //Set<K> keySet()
        Set<String> set = map.keySet();//用来装键
        for (String key : set) {
            System.out.println(key);
        }

        System.out.println("----------------------------------------");

        System.out.println("collection of value: ");
        //Collection<V> values()
        Collection<String> c = map.values();
        for (String value : c) {
            System.out.println(value);
        }

        System.out.println("----------------------------------------");

        //遍历-way1
        Set<String> set1 = map.keySet();
        for (String key : set1) {
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }

        System.out.println("----------------------------------------");

        //遍历-way2
        Set<Map.Entry<String, String>> set2 = map.entrySet();
        for (Map.Entry<String, String> me : set2) {
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "---" + value);
        }

        //遍历-way3
        /* Iterator<Map.Entry<KeyType, ValueType>> iter = map.iterator();
           while (iter.hasNext()) {
                Map.Entry<KeyType, ValueType> me = iter.next();
                KeyType key = me.getKey();
                ValueType value = me.getValue();
                System.out.println(key + "---" + value);
           }
        */
/*        Iterator<Map.Entry<String, String>> iter = map.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> me = iter.next();
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "---" + value);
        }*/

        System.out.println("----------------------------------------");

        System.out.println("map: " + map);


    }
}
