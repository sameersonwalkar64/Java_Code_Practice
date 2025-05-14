package selenium;
import java.util.*;
public class wrongcode {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if( p.length() > s.length()) {
            return ans;
        }

        Map<Character, Integer> patternFreq = new HashMap<>();
        Map<Character, Integer> mainFreq = new HashMap<>();



        for(int i = 0; i < p.length(); i++) {
            int val = patternFreq.getOrDefault(p.charAt(i), 0);
            val += 1;
            patternFreq.put(p.charAt(i), val);
        }

        for(int i = 0; i < p.length(); i++ ) {
            int val = mainFreq.getOrDefault(s.charAt(i), 0);
            val += 1;
            mainFreq.put(s.charAt(i), val);
        }

        if(patternFreq.equals(mainFreq)) {
            ans.add(0);
        }

        for(int i = p.length(); i < s.length(); i++) {
            // add the current ele
            int val = mainFreq.getOrDefault(s.charAt(i), 0);
            val += 1;
            mainFreq.put(s.charAt(i), val);
            // removing the i-p.length() ele from the window
            val = mainFreq.get(s.charAt(i - p.length()));
            val = val - 1;
            if(val == 0) {
                mainFreq.remove(s.charAt(i - p.length()));
            }
            mainFreq.put(s.charAt(i - p.length()), val);

            //compare with pattern string
            if(patternFreq.equals(mainFreq)) {
                ans.add(i - p.length() + 1);
            }
        }

        return ans;

    }
}
