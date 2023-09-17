package leetcode.weekly363;

import java.util.List;

public class SumOfValuesAtIndicesWithKSetBits {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int res = 0;
        for(int i = 0; i < nums.size(); i++){
            if(Integer.bitCount(i) == k) res += nums.get(i);
        }
        return res;
    }
}
