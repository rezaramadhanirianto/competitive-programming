package codechef.start90_4;

import java.util.Scanner;

public class E {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        while(tests-- > 0){
            int n = scanner.nextInt();
            String str = scanner.next();
            int[] chars = new int[26];
            int isValid = 0;

            for(char ch: str.toCharArray()) chars[ch-'a']++;
            for(int c: chars) if(c % 2 == 1) isValid++;

            int res = 0;
            if(isValid <= 1){
                boolean hasEvenCount = false;
                for(int c: chars){
                    if(c > 0 && c % 2 == 0) hasEvenCount = true;
                }

                if(hasEvenCount) res = 1;
                else res = 2;
            }

            System.out.println(res);

        }
    }
}
