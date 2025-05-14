package org.example;

import java.util.*;

public class Union {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(2);
        set.add(7);
        set.add(1);

        List<Integer> list = new ArrayList<>() ;
        for(Integer a : set){
            list.add(a);
        }
         Arrays.sort(list.toArray());
        System.out.println(list);

    }

}
