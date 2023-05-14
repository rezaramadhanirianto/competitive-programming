package codeforces.div4_round871;

import java.io.*;
import java.util.*;

public class A {
    // template
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        while(tests-- > 0){
            String word = scanner.next();
            String fav = "codeforces";
            int res = 0;
            for(int i = 0; i < word.length(); i ++){
                if(i > fav.length() || fav.charAt(i) != word.charAt(i)) res++;
            }

            System.out.println(res);
        }
    }
}
