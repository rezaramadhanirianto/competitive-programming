package leetcode.biweekly98;

// https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/description/
public class MaximumDifferenceByRemappingDigit {
    public int minMaxDifference(int num) {
        String strNum = String.valueOf(num);
        int n = strNum.length();
        char[] max = strNum.toCharArray();
        char[] min = strNum.toCharArray();

        int firstMax = max[0];
        int firstMin = min[0];

        for(char c: max) {
            if(c - '0' < 9){
                firstMax = c;
                break;
            }
        }
        for(int i = 0; i < n; i++) if(max[i] == firstMax) max[i] = '9';
        for(int i = 0; i < n; i++) if(min[i] == firstMin) min[i] = '0';

        int ma = Integer.parseInt(new String(max));
        int mi = Integer.parseInt(new String(min));
        return ma - mi;
    }
}
