package study0728;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]) {
        int[] a = {18, 1, 35, 12, 465, 23, 77};
        insert(a);
        System.out.println(Arrays.toString(a));
    }

    private static void insert(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1;
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }
    }
}