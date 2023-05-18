package codeforces.round873_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

// After
public class D implements Runnable {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st = new StringTokenizer("");

    public static void main(String[] args) {
        new Thread(null, new D(), "Main", 1<<28).start();
    }

    @Override
    public void run() {
        int tests = readInt();

        while(tests-- > 0){
            int n = readInt();
            int[] arr = readIntArray(n);

            long res = 0;
            for(int i = 0; i < n; i++){
                Deque<int[]> deque = new ArrayDeque<>();
                deque.add(new int[]{arr[i], arr[i]});
                for(int j = i + 1; j < n; j++){
                    int[] last = deque.peekLast();
                    if(arr[j] >= last[1]){
                        deque.addLast(new int[]{arr[j], arr[j]});
                        res += j - i - deque.size() + 1;
                    }else if(arr[j] >= last[0]){
                        res += j - i - deque.size() + 1;
                    } else{
                        // because when we found
                        // 2 6 13 3 15 5
                        // return should be 4 and deque should be only [[2,2],[5,15]]
                        // if we check it like arr[j] < deque.peekLast()[0]
                        // return would be 3 and deque should be only [[2,2],[3,13],[5,15]]
                        // that's mean [3,13] is in correct position
                        while(!deque.isEmpty() && arr[j] < deque.peekLast()[1])
                            deque.removeLast();

                        last[0] = arr[j];
                        deque.addLast(last);
                        res += j - i - deque.size() + 1;
                    }
                }
            }

            out.println(res);
        }
        out.close();
    }

    static String tes(Deque<int[]> deq){
        StringBuilder sb = new StringBuilder();
        for(int[] d: deq){
            sb.append(Arrays.toString(d) + " , ");
        }
        return sb.toString();
    }

    public static void sort(int[] arr) {
        //because Arrays.sort() uses quicksort
        //Collections.sort() uses merge sort
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int x : arr) ls.add(x);
        Collections.sort(ls);
        for (int i = 0; i < arr.length; i++)
            arr[i] = ls.get(i);
    }

    public static void sortReverse(int[] arr) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int x : arr) ls.add(x);
        Collections.sort(ls, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++)
            arr[i] = ls.get(i);
    }

    // fast scanner
    public static String next() {
        try {
            while (!st.hasMoreTokens()) {
                String s = br.readLine();
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        } catch(Exception e)  {
            return  null;
        }
    }

    static long readLong() {
        return Long.parseLong(next());
    }

    static int readInt() {
        return Integer.parseInt(next());
    }

    static double readDouble() {
        return Double.parseDouble(next());
    }

    static char readCharacter() {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }

    static int[] readIntArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = readInt();
        return res;
    }

    static long[] readLongArray(int n) {
        long[] res = new long[n];
        for (int i = 0; i < n; i++)
            res[i] = readLong();
        return res;
    }
}
