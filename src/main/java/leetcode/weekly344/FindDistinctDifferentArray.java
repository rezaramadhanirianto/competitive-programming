package leetcode.weekly344;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/contest/weekly-contest-344/problems/find-the-distinct-difference-array/
public class FindDistinctDifferentArray {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];
        for(int i = 0; i < n; i++){
            Set<Integer> left = new HashSet();
            Set<Integer> right = new HashSet();
            for(int j = 0; j <= i; j++) left.add(nums[j]);
            for(int j = i+1; j < n; j++) right.add(nums[j]);
            diff[i] = left.size() - right.size();
        }
        return diff;
    }
}
