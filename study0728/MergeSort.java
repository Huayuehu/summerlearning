package study0728;

import java.util.Arrays;

public class MergeSort {
    public static void main(String args[]) {
        int[] a = {43, 62, 1, 3, 90, 77, 2};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int[] a, int s, int e) {
        if (e > s + 1) {
            int index = (s + e) / 2;
            mergeSort(a, s, index);
            mergeSort(a, index + 1, e);
            merge(a, s, index, e);
        } else {
            if (a[s] > a[e]) {
                int temp = a[s];
                a[s] = a[e];
                a[e] = temp;
            }
        }

    }

    private static void merge(int[] a, int s, int index, int e) {
        int[] result = new int[a.length];
        int i = s;
        int i1 = s;
        int i2 = index + 1;
        while (i1 <= index && i2 <= e) {
            if (a[i1] < a[i2]) {
                result[i] = a[i1];
                i++;
                i1++;
            } else {
                result[i] = a[i2];
                i++;
                i2++;
            }
        }
        while (i1 <= index) {
            result[i] = a[i1];
            i++;
            i1++;
        }
        while (i2 <= e) {
            result[i] = a[i2];
            i++;
            i2++;
        }
        for (int j = s; j <= e; j++) {
            a[j] = result[j];
        }
    }
}
