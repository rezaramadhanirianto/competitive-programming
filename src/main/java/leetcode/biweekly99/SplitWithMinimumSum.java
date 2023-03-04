package leetcode.biweekly99;

import java.util.Arrays;

// https://leetcode.com/contest/biweekly-contest-99/problems/split-with-minimum-sum/
public class SplitWithMinimumSum {
    public int splitNum(int num) {
        String numStr = String.valueOf(num);
        int[] count = new int[10];
        for(int n: numStr.toCharArray()) count[n-'0']++;

        StringBuilder num1 = new StringBuilder(), num2 = new StringBuilder();
        int num1l = 0, num2l = 0;
        for(int i = 1; i < 10; i++){
            int c = count[i];
            while(c-- > 0){
                if(num1l <= num2l){
                    num1.append(i);
                    num1l++;
                }else{
                    num2.append(i);
                    num2l++;
                }
            }
        }

        int res = 0;
        if(!num1.toString().isEmpty()) res += Integer.valueOf(num1.toString());

        if(!num2.toString().isEmpty()) res += Integer.valueOf(num2.toString());

        return res;
    }

    // n log n
    public int splitNum2(int num) {
        char[] ca = Integer.toString(num).toCharArray();
        Arrays.sort(ca);
        int a = 0, b = 0;
        for(int i = 0; i < ca.length; i++){
            int digit = ca[i] - '0';
            if(i % 2 == 0){
                a *= 10;
                a += digit;
            }else{
                b *= 10;
                b += digit;
            }
        }
        return a + b;
    }
}
