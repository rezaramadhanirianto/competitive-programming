package leetcode.biweekly99;

import java.util.Arrays;

// https://leetcode.com/problems/count-ways-to-group-overlapping-ranges/
public class CountWaysToGroupOverlappingRanges {
    public int countWays(int[][] ranges) {
        Arrays.sort(ranges, (a, b) -> a[0] - b[0]);
        long size = 1;
        int prev = ranges[0][1];
        for(int[] range: ranges){
            if(prev >= range[0]) prev = Math.max(prev, range[1]);
            else {
                prev = range[1];
                size++;
            }
        }

        int res = 1;
        while(size-- > 0){
            res *= 2;
            res = res % 1000_000_007;
        }

        return res;
    }
}
