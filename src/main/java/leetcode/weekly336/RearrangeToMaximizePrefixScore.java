package leetcode.weekly336;

import java.util.Arrays;

// https://leetcode.com/problems/rearrange-array-to-maximize-prefix-score/
public class RearrangeToMaximizePrefixScore {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        long seq = 0;

        for(int i = nums.length -1; i >= 0; i--){
            seq += nums[i];
            if(seq > 0) res++;
        }
        return res;
    }
}
