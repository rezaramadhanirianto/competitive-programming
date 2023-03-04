package leetcode.biweekly99;

// https://leetcode.com/contest/biweekly-contest-99/problems/count-total-number-of-colored-cells/
public class CountTotalNumberOfColoredCells {
    public long coloredCells(int n) {
        long res = 1;
        int seq = 0, i = 1;
        while(i < n){
            seq += 4;
            res += seq;
            i++;
        }
        return res;
    }
}
