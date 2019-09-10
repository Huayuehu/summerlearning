package study0610;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapArrayList {
    public static void main(String args[]) {
        HashMap<String, ArrayList<String>> hmarr = new HashMap<String, ArrayList<String>>();

        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("yxq");
        arr1.add("hhy");
        arr1.add("lyy");
        arr1.add("wy");
        hmarr.put("beautiful girl", arr1);

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("wqh");
        hmarr.put("stupid boy", arr2);

        //遍历
        Set<String> keySet = hmarr.keySet();
        for (String key : keySet) {
            System.out.println(key + ": ");
            ArrayList<String> arrValue = hmarr.get(key);
            for (String s : arrValue) {
                System.out.println("\t" + s);
            }
        }

    }
}
