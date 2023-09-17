package leetcode.weekly363;

import java.util.List;

public class MaximumNumberOfAlloys {
    public int maxNumberOfAlloys(int n, int k, int budget, List<List<Integer>> composition, List<Integer> stock, List<Integer> cost) {
        int res = 0;
        for(int i = 0; i < k; i++){
            res = Math.max(res, helper(n, (long) budget, composition.get(i), stock, cost));
        }
        return res;
    }

    int helper(int n, long budget, List<Integer> comp, List<Integer> stock, List<Integer> cost){
        long lo = 0, hi = 200_000_000;
        long res = 0;
        while(lo <= hi){
            long mid = lo + (hi - lo) / 2;
            long currCost = 0;
            for(int i = 0; i < n; i++){
                long needed = (long) (comp.get(i) * mid);
                if((long) stock.get(i) >= needed) continue;
                needed -= stock.get(i);
                currCost += ((long) needed * cost.get(i));
            }
            if(currCost > budget){
                hi = mid - 1;
            } else {
                res = mid;
                lo = mid + 1;
            }
        }
        return (int) res;
    }
}
