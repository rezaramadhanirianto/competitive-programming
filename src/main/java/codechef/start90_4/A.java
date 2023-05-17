package codechef.start90_4;

import java.util.Scanner;

public class A {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int extra = scanner.nextInt();
        System.out.println((row+ extra) * col);
    }
}
