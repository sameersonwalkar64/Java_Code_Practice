package org.example;

public class QuickSort {
    static void swap(int[] a, int p1, int p2) {
        int temp = a[p1];
        a[p1] = a[p2];
        a[p2] = temp;
    }
    static int partition(int[] a, int beg, int end) {
        int l=beg, h=end-1, p=end;
        while(l<=h) {
            if (a[l]<=a[p]) {
                l++;
            }
            else {
                swap(a, l, h);
                h--;
            }
        }
        swap(a, l, p);
        return l;
    }
    static int[] quickSort(int[] a, int beg, int end) {
        if (beg>=end) {
            return a;
        }
        int p = partition(a, beg, end);
        quickSort(a, beg, p-1);
        quickSort(a, p+1, end);
        return a;
    }

    public static void main(String[] args) {
       int []a = {3,1,6,3,8,4};
       int n = a.length-1;
       quickSort(a,0,n);
       for(int num : a)  {
           System.out.print(num+ " ");
       }
    }
}
