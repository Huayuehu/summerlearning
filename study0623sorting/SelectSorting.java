package study0623sorting;

import java.util.Arrays;

public class SelectSorting {
    public static void main(String args[]) {
        int[] a = {3, 16, 11, 25, 30, 36, 20, 42, 39, 47};
        selectSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void selectSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
}
