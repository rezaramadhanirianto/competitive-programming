package codechef.practice.pastzco;

import java.util.Arrays;
import java.util.Scanner;

// https://www.codechef.com/ZCOPRAC/problems/ZCO14003
public class SmartPhone {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        long res = 0l;
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            res = (long) Math.max(res, ((long) arr[i]*(n-i)));
        }

        System.out.println(res);
    }
}
