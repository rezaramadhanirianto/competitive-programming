import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

public class Main implements Runnable {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st = new StringTokenizer("");

    public static void main(String[] args) {
        new Thread(null, new Main(), "Main", 1<<28).start();
    }

    @Override
    public void run() {
        int tests = readInt();

        while(tests-- > 0){
            int n = readInt();
            int[] arr = readIntArray(n);
            int max = 1, min = 0;

            for(int i = 0; i < n; i++){
                int[] temp = arr.clone();

            }

        }
        out.close();
    }

    boolean isLarger(int[] arr1, int[] arr2){
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] < arr2[i]) return false;
        }
        return true;
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

    static String readLine() {
        try {
            return br.readLine().trim();
        } catch (IOException e) {
            return null;
        }
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
