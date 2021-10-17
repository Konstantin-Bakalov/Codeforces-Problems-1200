import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/problemset/problem/1143/B

public class Nirvana {
    public static ArrayList<Integer> g(long n) {
        ArrayList<Integer> v = new ArrayList<>();
        while (n > 0) {
            v.add(0, (int) n % 10);
            n /= 10;
        }
        return v;
    }

    public static long f(long n) {
        long res = 1;
        while(n > 0) {
            res *= n % 10;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long max = 0;
        ArrayList<Integer> v = g(n);
        for(int i = 0; i < v.size(); i++) {
            long temp = 1;
            for(int j = 0; j < v.size(); j++) {
                int digit = v.get(i) - 1;
                if(i == 0 && v.get(i) - 1 == 0) digit = 1;
                if(j > i) digit = 9;
                if(j < i) digit = v.get(j);
                temp *= digit;
            }
            if(temp > max) max = temp;
        }
        if(max < f(n)) max = f(n);
        if(n <= 9) System.out.println(n);
        else System.out.println(max);
    }
}