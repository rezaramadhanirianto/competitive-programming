package codeforces.round871_4;

import java.util.*;

// template
public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        while(tests-- > 0){
            int gold = scanner.nextInt();
            int target = scanner.nextInt();
            Set<Integer> visited = new HashSet<>();
            if(gold < target){
                System.out.println("NO");
            } else{
                if(helper(gold, target, visited)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }

    static boolean helper(int gold, int target, Set<Integer> visited){
        if(!visited.add(gold)) return false;
        else if(gold == target) return true;
        int smaller = gold/3;
        int bigger = gold - (smaller);
        if(smaller*2 != bigger) return false;
        return helper(bigger, target, visited) || helper(smaller, target, visited);
    }
}