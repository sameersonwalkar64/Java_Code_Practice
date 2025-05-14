package org.example;
import java.util.*;

public class MaxRepeatedString {
    public static void main(String[] args) {
        String []arr = {"us","ozv","t","chy","z","uf","tfc","qh","g"};
        Map <String, Integer> map = new HashMap <>();
        for( String s : arr ) {
           // map.put(s, map.getOrDefault(s,0)+1);
        }
        int count = 0;
        String str = "";
        for(Map.Entry <String,Integer> set : map.entrySet() )  {
            if (set.getValue() > count)  {
                count = set.getValue();
                str = set.getKey();
            }
            else if (set.getValue() == count)  {
                String c = set.getKey();
                int keySize = c.length();
                int  strLength = str.length();
                int n = Math.min(strLength,keySize);
                for (int idx = 0; idx < n; idx++)  {
                    char a = c.charAt(idx);
                    char b = str.charAt(idx);
                    if(a != b)  {
                        if (a < b) {
                            str = c;

                        }
                    }
                    break;
                }
            }
        }
        System.out.println(str);
    }
}
