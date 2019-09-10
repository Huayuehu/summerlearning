package study0531;

/**
 * 把数组中的数据按照指定格式拼接成一个字符串
 *  * 举例：int[] arr = {1,2,3};	
 *  * 输出结果：[1, 2, 3]
 */

public class StringTest4 {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3};

        String result = arrayToString(arr);
        System.out.println(result);
    }
    
    
    public static String arrayToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length-1; i++) {
            str += arr[i];
            str += ", ";
        }
        str += arr[arr.length-1];
        str += "]";
        return str;
    }
}
