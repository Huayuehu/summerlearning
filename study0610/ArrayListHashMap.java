package study0610;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListHashMap {
    public static void main(String args[]) {
        ArrayList<HashMap<String, Integer>> arrhm = new ArrayList<HashMap<String, Integer>>();

        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        hm1.put("hhy", 100);
        hm1.put("wy", 100);
        arrhm.add(hm1);

        HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
        hm2.put("wqh", 100);
        arrhm.add(hm2);

        for (HashMap<String, Integer> hm : arrhm) {
            Set<String> key = hm.keySet();
            for (String s : key) {
                Integer value = hm.get(s);
                System.out.println(s + "---" + value);

            }
        }
    }
}
