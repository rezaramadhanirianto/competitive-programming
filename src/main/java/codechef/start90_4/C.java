package codechef.start90_4;

import java.util.Scanner;

public class C {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        while(tests-- > 0){
            int size = scanner.nextInt();
            int[] A = new int[size];
            for(int i = 0; i < size; i++) A[i] = scanner.nextInt();

            String res = "";
            for(int a: A){
                if(a == 1) res += "0 ";
                else res += "1 ";
            }
            System.out.println(res.trim());
        }
    }
}
