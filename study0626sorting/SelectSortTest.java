package study0626sorting;

import java.util.Arrays;

public class SelectSortTest {
    public static void main(String args[]) {
        int[] a = {1, 18, 35, 12, 465, 23, 77};
        selectSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void selectSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
    }
}
