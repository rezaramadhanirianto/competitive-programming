package leetcode.biweekly98;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-score-by-changing-two-elements/description/
public class MinimumScoreByChangingTwoElements {
    public int minimizeSum(int[] nums) {
        if(nums.length < 4) return 0;
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE, n = nums.length;
        res = Math.min(res, nums[n-1] - nums[2]);
        res = Math.min(res, nums[n-2] - nums[1]);
        res = Math.min(res, nums[n-3] - nums[0]);
        return res;
    }
}
