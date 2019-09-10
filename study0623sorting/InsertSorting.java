package study0623sorting;

import java.util.Arrays;

public class InsertSorting {
    public static void main(String args[]) {
        int[] a = {16, 3, 11, 25, 30, 36, 20, 42, 39, 47};
        insertSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void insertSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int waitingToBeInsert = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > waitingToBeInsert) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = waitingToBeInsert;
        }
    }
}
