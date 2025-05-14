package selenium;
import java.util.*;

public class pattern {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> answer = new ArrayList<>();
        if(p.length() > s.length()) {
            return answer;
        }

        Map<Character, Integer> freqMain = new HashMap<>();
        Map<Character, Integer> freqPattern = new HashMap<>();
        for(int i=0; i < p.length(); i++) {
            freqPattern.put(p.charAt(i), freqPattern.getOrDefault(p.charAt(i), 0) + 1);
        }

        for(int i = 0; i < p.length() ; i++) {
            freqMain.put(s.charAt(i), freqMain.getOrDefault(s.charAt(i), 0) + 1);
        }

        boolean isAnagramFound = true;
        // for (Map.Entry<Character, Integer> entry : freqPattern.entrySet()) {
        //     if(!freqMain.containsKey(entry.getKey())) {
        //         isAnagramFound = false;
        //         break;
        //     }
        //     if(freqMain.get(entry.getKey()) != entry.getValue()) {
        //         isAnagramFound = false;
        //         break;
        //     }
        // }

        if(freqPattern.equals(freqMain)) {
            answer.add(0);
        }

        for(int i = p.length(); i < s.length() ; i++) {
            char ithCharacter = s.charAt(i);
            freqMain.put(ithCharacter, freqMain.getOrDefault(ithCharacter, 0) + 1);
            char charToRemove = s.charAt(i-p.length());
            freqMain.put(charToRemove, freqMain.get(charToRemove) - 1);
            if(freqMain.get(charToRemove) == 0) {
                freqMain.remove(charToRemove);
            }

            if(freqPattern.equals(freqMain)) {
                answer.add(i - p.length() + 1);
            }
        }

        return answer;

    }
}
