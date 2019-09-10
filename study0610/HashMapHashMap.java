package study0610;

import java.util.HashMap;
import java.util.Set;

/**
 * USC
 *      EE power
 *          hhy 100
 *      CS data science
 *          zy  100
 */

public class HashMapHashMap {
    public static void main(String args[]) {
        HashMap<String, HashMap<String, Integer>> hmhm = new HashMap<String, HashMap<String, Integer>>();

        HashMap<String, Integer> hmEE = new HashMap<String, Integer>();
        hmEE.put("hhy", 100);
        hmhm.put("EE", hmEE);

        HashMap<String, Integer> hmCS = new HashMap<String, Integer>();
        hmCS.put("zy", 200);
        hmhm.put("CS", hmCS);

        //两层循环
        Set<String> keySet = hmhm.keySet();
        for (String key : keySet) {
            HashMap<String, Integer> valueMap = hmhm.get(key);

            Set<String> set = valueMap.keySet();
            for (String s : set) {
                Integer value = valueMap.get(s);
                System.out.println(key + ": " + s + "---" + value);
            }

        }

    }
}
