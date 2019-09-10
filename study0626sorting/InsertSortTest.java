package study0626sorting;

import java.util.Arrays;

public class InsertSortTest {
    public static void main(String args[]) {
        int[] a = {1, 18, 35, 12, 465, 23, 77};
        insertSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void insertSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int wtbi = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > wtbi) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = wtbi;
        }
    }

}
