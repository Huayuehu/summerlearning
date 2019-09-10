package study0531;

/**
 * count the times that a specific bunch of string appeared in a long string, says "woshihuahuayuewozhengzaixuejavawojuedeshijianbuduolewodemaya"
 */

public class StringTest5 {
    public static void main(String args[]) {
        String str = "woshihuahuayuewozhengzaixuejavawojuedeshijianbuduolewodemaya";
        String demo = "wo";

        int count = getCount(str, demo);
        System.out.println(count);
    }

    public static int getCount(String str, String demo) {
        int count = 0;

        //indexOf(String str)
        int index1 = str.indexOf(demo);
        while (index1 != -1) {
            count++;

            //indexOf(String str, int fromIndex)
            index1 = str.indexOf(demo, index1+(demo.length()));
        }
        return count;
    }
}
