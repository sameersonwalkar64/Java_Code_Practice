package org.example;

import java.util.*;



public class Unique {

    public static void main(String args[]) {
//        System.out.println(mostRepeatedTemperature());
//        fabonacci(5);
        int t = 1;
        while (t-- > 0) {
            String s = "abskeekkaa";
            int flag = check(s);
            if (flag == 1) {
                System.out.print("Yes");
            } else System.out.print("No");
        }

        return ;
    }

//
//    public static int mostRepeatedTemperature() {
//        int n = 5;
//        int a[] = {10, 0, 10, 20, 30, 20};
//        int count = 1;
//        int repeated = a[0];
//        int temp = 0;
//        for (int i = 0; i < (a.length - 1); i++) {
//            temp = a[i];
//            int tempCount = 0;
//            for (int j = 0; j < a.length; j++) {
//                if (temp == a[j])
//                    tempCount++;
//            }
//            if (tempCount == count) {
//                if (temp > repeated) {
//
//                    repeated = temp;
//                    count = tempCount;
//                }
//            }
//            if (tempCount > count) {
//                repeated = temp;
//                count = tempCount;
//            }
//        }
//
//        return repeated;
//    }

    public static int check(String s) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();


        Set<Integer> st = new HashSet<>();
        int n = s.length();
        int count=1;
        for (int i = 0; i <n; ++i) {
            char c = s.charAt(i);
            if (map.containsKey(c))  {
               int tempCount= map.get(c);
                System.out.println(tempCount);
                map.put(c,tempCount+=1);
            }else {
                map.put(c,count);
            }
        }
        for (Character v: map.keySet()) {
            System.out.println(map.get(v));
            if(map.get(v)>1) {
               st.add(map.get(v));
                System.out.println(st);
                break;
            }
            return map.size();
        }

        if (st.size() == 0) {
            return 1;
        } else {
            return 0;
        }

    }
}



