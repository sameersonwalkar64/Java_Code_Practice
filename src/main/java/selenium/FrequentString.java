package selenium;
import java.util.*;
public class FrequentString {
    public static class Pair {
        public String key;
        public Integer freq;
        Pair(String key, Integer freq) {
            this.key = key;
            this.freq = freq;
        }
    }
    public static Vector<String> frequentWords(Vector<String> vec,int k)
    {
        Map<String, Integer> keyFreq = new HashMap<>();
        for(int i = 0; i < vec.size(); i++) {
            int val = keyFreq.getOrDefault(vec.get(i), 0) + 1;
            keyFreq.put(vec.get(i), val);
        }

        List<Pair> keyFreqList = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : keyFreq.entrySet()) {
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            keyFreqList.add(pair);
        }

        Collections.sort(keyFreqList, new Comparator<Pair>() {
            @Override
            public int compare(Pair first, Pair second) {
                if(first.freq != second.freq)
                    return second.freq - first.freq;
                else
                    return first.key.compareTo(second.key);
            }});

        Vector<String> ans = new Vector<>();

        for(int i = 0; i < k; i++ ) {
            ans.add(keyFreqList.get(i).key);
        }

        return ans;

    }
}
