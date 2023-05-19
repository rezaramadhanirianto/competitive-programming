package codeforces.round874_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

// after
public class D implements Runnable {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st = new StringTokenizer("");

    // code goes here
    void solve(){
        int n = readInt();
        int[] arr = readIntArray(n);
        if(n == 1){
            out.println(arr[0]);
            return;
        }

        int maxIdx = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[maxIdx]) maxIdx = i;
        }

        int secondIdx = maxIdx - 1;
        while(secondIdx - 1 >= 0 && arr[secondIdx-1] > arr[0]) secondIdx--; // smaller index from 0 to secondIdx

        List<Integer> list1 = new ArrayList<>();
        for(int i = maxIdx; i < n; i++) list1.add(arr[i]);
        for(int i = maxIdx - 1; i >= secondIdx; i--) list1.add(arr[i]);
        for(int i = 0; i < secondIdx; i++) list1.add(arr[i]);

        int right = n-1, left = 0;
        List<Integer> list2 = new ArrayList<>();
        list2.add(arr[right--]);
        while(left <= right){
            if(arr[left] < arr[right]){
                list2.add(arr[right--]);
            } else break;
        }
        while(left <= right) list2.add(arr[left++]);

        List<Integer> res = compare(list1, list2);

        StringBuilder sb = new StringBuilder();
        for(int r: res){
            sb.append(r).append(' ');
        }
        out.println(sb.toString());
    }

    private static List<Integer> compare(List<Integer> one, List<Integer> two) {
        for (int i = 0; i < one.size(); ++i) {
            if (one.get(i) > two.get(i)) return one;
            else if (one.get(i) < two.get(i)) return two;
        }
        return one;
    }

    public static void main(String[] args) {
        new Thread(null, new D(), "Main", 1<<28).start();
    }

    @Override
    public void run() {
        int tests = readInt();
        while(tests-- > 0) solve();
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
