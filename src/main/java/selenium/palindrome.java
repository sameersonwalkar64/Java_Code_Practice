package selenium;
import java.util.*;

public class palindrome {
    static int longestPalindrome(int n, String s) {
        Map<Character, Integer > keyFrq = new HashMap<>();
        for(int i = 0; i< n; i++) {
            int val = keyFrq.getOrDefault(s.charAt(i), 0) + 1;
            keyFrq.put(s.charAt(i), val);
        }

        int ans = 0;
        //    int minOdd = Integer.MAX_VALUE;
        boolean isOddFound = false;
        for(Map.Entry<Character, Integer> entry : keyFrq.entrySet()) {
            int val = entry.getValue();
            if(val % 2 == 1) {
                ans = ans + (val - 1);
                isOddFound = true;
            } else {
                ans = ans + val;
            }
        }

        if(isOddFound) {
            ans ++;
        }

        return ans;


    }
}
}
