import java.util.Scanner;

// codeforces.com/problemset/problem/1076/B

public class DivisorSubtraction {

    public static long smallestDiv(long n) {
        for(long i = 2; i * i <= n; i++)
            if(n % i == 0) return i;
        return n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long res = 0;
        long d = smallestDiv(n);
        if(n % 2 == 1) {
            n -= d;
            res++;
        }
        System.out.println(res + n / 2);
    }
}