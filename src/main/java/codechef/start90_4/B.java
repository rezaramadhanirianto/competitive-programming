package codechef.start90_4;

import java.util.Scanner;

public class B {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        while(tests-- > 0){
            int num = scanner.nextInt();
            if(num % 2 == 0 && num % 7 == 0){
                System.out.println("Alice");
            }else if(num % 2 == 1 && num % 9 == 0){
                System.out.println("Bob");
            }else{
                System.out.println("Charlie");
            }
        }
    }
}
