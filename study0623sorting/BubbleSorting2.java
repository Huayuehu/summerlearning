package study0623sorting;

import java.util.Arrays;

public class BubbleSorting2 {
    public static void main(String args[]) {
        int[] a = {3, 16, 11, 25, 30, 36, 20, 42, 39, 47};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
