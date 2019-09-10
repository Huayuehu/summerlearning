package study0623sorting;

import java.util.Arrays;

public class MergeSorting2 {
    public static void main(String args[]) {
        int[] a = {16, 3, 11, 25, 30, 36, 20, 42, 39, 47};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int[] a, int s, int e) {
        int mid = (e + s) / 2;
        if (e > s + 1) {
            mergeSort(a, s, mid);
            mergeSort(a, mid + 1, e);
            merge(a, s, mid, e);
        } else {
            if (a[e] < a[s]) {
                int temp = a[e];
                a[e] = a[s];
                a[s] = temp;
            }
        }
    }

    private static void merge(int[] a, int s, int mid, int e) {
        int[] result = new int[a.length];
        int i = s;
        int i1 = s;
        int i2 = mid + 1;

        while (i1 <= mid && i2 <= e) {
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
        while (i1 <= mid) {
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
