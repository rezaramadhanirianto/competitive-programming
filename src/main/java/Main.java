import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main implements Runnable {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st = new StringTokenizer("");
    static final int mod = (int) 1e9 + 7;

    // code goes here
    void solve() {

    }

    public static void main(String[] args) {
        new Thread(null, new Main(), "Main", 1 << 28).start();
    }

    @Override
    public void run() {
        int tests = readInt();
        while (tests-- > 0) solve();
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

    public static void sort(int[] arr, Comparator<Integer> comparator) {
        //because Arrays.sort() uses quicksort
        //Collections.sort() uses merge sort
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int x : arr) ls.add(x);
        Collections.sort(ls, comparator);
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

    static long gcd(long n, long m) {
        if (m == 0) return n;
        else return gcd(m, n % m);
    }

    static long isPrime(long n) {
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return i;
        }
        return -1;
    }

    static long factorial(int x) {
        if (x == 0) return 1;
        long ans = x;
        for (int i = x - 1; i >= 1; i--) {
            ans *= i;
            ans %= mod;
        }
        return ans;
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
        } catch (Exception e) {
            return null;
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

    private static BigInteger nextBigInteger() {
        return new BigInteger(next());
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

    // out
    void println(char[] s) {
        out.println(String.valueOf(s));
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
    }

    // classes
    static class Pair implements Comparable<Pair> {
        int index, value;

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }

        public int compareTo(Pair o) {
            return Integer.compare(value, o.value);
        }

    }
}
