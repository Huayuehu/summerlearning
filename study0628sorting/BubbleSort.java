package study0628sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]) {
        int[] a = {2458, 45, 6768, 93, 22, 35};
        bubble(a);
        System.out.println(Arrays.toString(a));
    }

    private static void bubble(int[] a) {
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
