package codeforces.div4_round871;

import java.util.*;

// template
public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        while(tests-- > 0){
            int size = scanner.nextInt();
            PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.comparingInt(o -> o));
            PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.comparingInt(o -> o));
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o));
            while(size-- > 0){
                int book = scanner.nextInt();
                String skills = scanner.next();
                if(skills.charAt(0) == '1') pq1.add(book);
                if(skills.charAt(1) == '1') pq2.add(book);

                if(skills.equals("11")) pq.add(book);
            }
            if(pq1.isEmpty() || pq2.isEmpty()) System.out.println("-1");
            else {
                int min = (pq.isEmpty()) ? Integer.MAX_VALUE : pq.poll();
                min = Math.min(min, pq1.peek() + pq2.peek());
                System.out.println(min);
            }
        }
    }
}

