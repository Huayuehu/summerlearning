package study0722;

import java.util.Arrays;

public class QuickSort {
    public static void main(String args[]) {
        int[] a = {18, 1, 35, 12, 465, 23, 77};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] a, int i, int j) {
        if (i >= j) {
            return;
        }

        int index = partition(a, i, j);
        quickSort(a, i, index - 1);
        quickSort(a, index + 1, j);
    }

    private static int partition(int[] a, int p, int q) {
        int x = a[p];
        int i = p;

        for (int j = p + 1; j <= q; j++) {
            if (a[j] < x) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i];
        a[i] = a[p];
        a[p] = temp;

        return i;
    }

}
