package codeforces.div4_round871;


import java.io.*;
import java.util.*;

// template
public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        while(tests-- > 0){
            int size = scanner.nextInt();
            int[] arr = new int[size];
            int i = 0;
            while(size-- > 0){
                arr[i++] = scanner.nextInt();
            }
            int seq = 0, res = 0, prev = 1;
            for(int s: arr){
                if(s == 0 && prev == 0) seq++;
                else if(s == 0) seq = 1;
                else seq = 0;

                prev = s;
                res =  Math.max(res, seq);
            }
            System.out.println(res);
        }
    }
}
