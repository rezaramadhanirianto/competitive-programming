package leetcode.weekly344;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/contest/weekly-contest-344/problems/frequency-tracker/
public class FrequencyTracker {
    Map<Integer, Set<Integer>> map;
    Map<Integer, Integer> key;

    public FrequencyTracker() {
        map = new HashMap();
        key = new HashMap();
    }

    public void add(int number) {
        key.put(number, key.getOrDefault(number, 0) + 1);

        int freq = key.get(number);
        if(map.containsKey(freq-1) && map.get(freq-1).contains(number)) map.get(freq-1).remove(number);

        Set<Integer> set = map.getOrDefault(freq, new HashSet());
        set.add(number);
        map.put(key.get(number), set);
    }

    public void deleteOne(int number) {
        if(key.containsKey(number)){
            int freq = key.get(number);
            map.get(freq).remove(number);
            if(freq <= 1) {
                key.remove(number);
            } else {
                key.put(number, freq-1);

                Set<Integer> set = map.getOrDefault(freq-1, new HashSet());
                set.add(number);
                map.put(key.get(number), set);
            }

        }
    }

    public boolean hasFrequency(int frequency) {
        return map.getOrDefault(frequency, new HashSet()).size() > 0;
    }
}
