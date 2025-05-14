package org.example;
import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        int[] a = {3, 2, 7, 4, 9, 11, 3};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");

        }
        System.out.println("");
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5};
        int n = arr.length;
        int val = 0, count = 0, j = 0;

        for (int i = 0; i < n; ) {
            val = arr[i];
            count = 0;

            while (i < n && arr[i] == val) {
                count++;
                i++;
            }
            if (count > 2) {
                count = 2;
            }
            while (count-- > 0) {
                arr[j] = val;
                j++;
            }
            System.out.print(j);
        }
    }
}
