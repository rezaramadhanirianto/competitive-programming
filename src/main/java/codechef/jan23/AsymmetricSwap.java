package codechef.jan23;

import java.util.Arrays;
import java.util.Scanner;

// https://www.codechef.com/problems/ARRSWAP
public class AsymmetricSwap {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int len = sc.nextInt();
            int[] arr = new int[len*2];
            for(int i = 0; i < len*2; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int min = Integer.MAX_VALUE;
            for(int i=0;i<=len;i++){
                min = Math.min(arr[len+i-1]-arr[i],min);
            }
            System.out.println(min);
        }
    }
}
