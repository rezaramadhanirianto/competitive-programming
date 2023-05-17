package codechef.start90_4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- > 0){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            Set<Integer> set = new HashSet();
            for(int i = 0; i < n; i++){
                arr[i] = scanner.nextInt();
                set.add(arr[i]);
            }

            String res = "yes";
            for(int i = 0; i < n-2; i++){
                for(int j = i+1; j < n-1; j++){
                    int diff = arr[j] - arr[i];
                    int target = arr[j] + diff;
                    if(set.contains(target)) res = "no";
                }
            }
            System.out.println(res);
        }
    }
}
