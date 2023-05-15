package codeforces.round873_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

public class C implements Runnable {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st = new StringTokenizer("");

    public static void main(String[] args) {
        new Thread(null, new C(), "Main", 1<<28).start();
    }

    @Override
    public void run() {
        int tests = readInt();
        int mod = (int) 1e9 + 7;

        while(tests-- > 0){
            int n = readInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for(int i = 0; i < n; i++) arr1[i] = readInt();
            for(int i = 0; i < n; i++) arr2[i] = readInt();

            sort(arr2);
            sort(arr1);

            long res = 1;
            int left = 0;
            for(int j = 0; j < n; j++){
                while(left < n && arr1[j] > arr2[left]) left++;

                int smallerThanIndex = left;
                if(j >= left){
                    res = 0;
                    break;
                }

                res = (res * (smallerThanIndex - j)) % mod;
            }
            out.println(res);
        }
        out.close();
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
}
