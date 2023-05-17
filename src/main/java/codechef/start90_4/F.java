package codechef.start90_4;

import java.util.Scanner;

public class F {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        while(tests-- > 0){
            long n = scanner.nextLong();
            long target = scanner.nextLong();
            String res = "NO";

            if(n == target) res = "YES";
            else if(n > target && n % 2 == 0){
                while(n % 2 == 0){
                    n >>= 1;
                    if(target % n == 0) break;
                }
                if(target % n == 0) res = "YES";
            }
            System.out.println(res);
        }
    }
}
