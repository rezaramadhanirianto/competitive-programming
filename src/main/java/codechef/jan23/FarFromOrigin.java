package codechef.jan23;

import java.util.Scanner;

public class FarFromOrigin {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        for(int i = 0; i < tests; i++){
            int xAlex = scanner.nextInt();
            int yAlex = scanner.nextInt();
            int xBob = scanner.nextInt();
            int yBob = scanner.nextInt();

            // pythagorean theorem
            double stepAlex = Math.sqrt(xAlex * xAlex + yAlex * yAlex);
            double stepBob = Math.sqrt(xBob * xBob + yBob * yBob);

            if(stepBob > stepAlex)
                System.out.println("BOB");
            else if(stepAlex > stepBob)
                System.out.println("ALEX");
            else
                System.out.println("EQUAL");
        }
    }
}
