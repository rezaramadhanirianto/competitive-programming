package leetcode.weekly363;

import java.util.Collections;
import java.util.List;

public class HappyStudent {
    public int countWays(List<Integer> nums) {
        int n = nums.size();
        Collections.sort(nums);
        int maxSoFar = 0;
        int res = 0;
        for(int i = 0; i <= n; i++){
            if(i == 0){
                if(nums.get(i) > i) res++;
            } else if(i < n) {
                if(nums.get(i-1) < i && nums.get(i) > i){
                    res++;
                }
            } else{
                if(nums.get(i-1) < i){
                    res++;
                }
            }
        }
        return res;
    }
}
