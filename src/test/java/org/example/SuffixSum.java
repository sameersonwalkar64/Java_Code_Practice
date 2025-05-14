//package org.example;
//
//public class SuffixSum {
//    static int sumElements(int[] result, int start, int end) {
//        int sum = 0;
//        for (int i = start; i <= end; i++) {
//            sum += arr[i];
//        }
//        return sum;
//
//        int n = arr.length;
//    int[] result = new int[n];
//
//        for (int i = 0; i < n; i++) {
//        int leftSum = sumElements(arr, 0, i - 1);
//        int rightSum = sumElements(arr, i + 1, n - 1);
//        result[i] = Math.abs(leftSum - rightSum);
//    }
//
//        return result;
//
//}
