package leetcode.weekly345;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/contest/weekly-contest-345/problems/find-the-losers-of-the-circular-game/
public class FindTheLosersOfTheCircularGame {
    public int[] circularGameLosers(int n, int k) {
        Set<Integer> set = new HashSet();
        int people = 1;
        int i = 0;
        while(set.add(people)){
            int next = (++i) * k;
            people = (people + next) % n;
            if(people == 0) people = n;
        }
        System.out.println(set.toString());
        int[] res = new int[n-set.size()];
        int j = 0;
        for(int x = 1; x <= n; x++){
            if(!set.contains(x)) res[j++] = x;
        }
        return res;
    }
}
