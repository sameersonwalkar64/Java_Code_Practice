package org.example;

import org.testng.annotations.Test;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Hello world");
//        string compression
        String s = "abbbccaafggff";
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
          //  map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            sb.append(set.getKey());
            sb.append(set.getValue());
        }
        System.out.println(sb.toString());

//--------------------------------------------------------
//        diamond * print
        String[] arr = new String[5];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            String s2 = "";
            for (int j = 0; j <= i; j++) {
                s2 = s2 + "* ";
            }
            arr[i] = s2;

        }
        for (String str : arr
        ) {
            System.out.println(str);

        }
//        ------------------------------------------------------------------------
//        time complexicity
        int n1 = 50;
        for (int i = 1; i < n1; i = i * 2) {
            System.out.println(i);
        }
//        -----------------------------------------------------------------
//        unique string or not (if all char is only 1 time.
        HashMap<Character, Integer> M = new HashMap<Character, Integer>();
        String s1 = "cdgfhijk";
        int n3 = s1.length();

        for (int i = 0; i < n3 - 1; i++) {
            char ch = s1.charAt(i);
           // M.put(ch, M/.getOrDefault(ch, 0) + 1);
        }
        boolean flag = true;
        for (Map.Entry<Character, Integer> set : M.entrySet()
        ) {
            if (set.getValue() >= 2) {
                flag = false;
                break;

            }


        }
        if (flag == true) {
            System.out.println("yes");
        } else {

            System.out.println("no");

        }
//        --------------------------------------------------------
//        max temp repetation
        int[] a = {10, 10, -20, -20, -20, 30, 30};
        HashMap<Integer, Integer> m1 = new HashMap<>();
        for (int i : a) {
            //m1.put(i, m1.getOrDefault(i, 0) + 1);
        }
        int key12 = Integer.MIN_VALUE;
        int maxValue = 0;
        for (int j : m1.keySet()) {
            if (m1.get(j) > maxValue) {
                key12 = j;
                maxValue = m1.get(j);
            } else {
                if (m1.get(j) == maxValue) {
                    if (j > key12) {
                        key12 = j;
                    }
                }
            }
        }
        System.out.println(key12);
//        ------------------------------------------
//        palindrome (String char sequance same from start and from end)

        String str = "sassas";
        int l = str.length();
        boolean flag1 = true;
        for (int i = 0, j = l - 1; i < l/2; i++, j--) {
            char start = str.charAt(i);
            char end = str.charAt(j);
            if (start != end) {
                flag1 = false;
                break;

            }

        }
        if (flag1 == true) {

            System.out.println("yes");

        } else {
            System.out.println("no");
        }
//        --------------------------------------------------------------
//      second largest no
        int []ar = {25,27,40,12,35};

        for(int i = 0; i<ar.length-1; i++)  {

            for (int j=i+1; j<ar.length; j++)  {
                int temp = ar[0];
                if(ar[j] > ar[i])  {
                   ar[i]=ar[j];
                   ar[j]=temp;
                }
            }


        }

//        -------------------------------------------
//        reverse string
        String str1 = "abcd";
        int i = 0;
        int j = str1.length()-1;
        StringBuilder sb1 = new StringBuilder();
        while(i < str1.length())  {
            char ch = str1.charAt(j);
            sb1.append(ch);
            i++;
            j--;

        }
        System.out.println(sb1.toString());
        //        int num=10;int flag=0;int s1=1;int s2=10;
//        for(int i = s1; i <= s2; i++)
//        {
//            for(int j = 2; j < i; j++)
//            {
//                if(i % j == 0)
//                {
//                    flag = 0;
//                    break;
//                }
//                else
//                {
//                    flag = 1;
//                }
//            }
//            if(flag == 1)
//            {
//                System.out.println(i);
//            }
//        }

    }


//    _________________________________________________________________

}
