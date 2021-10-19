import java.util.Scanner;

// codeforces.com/problemset/problem/304/A

public class PythagoreanTheorem {

    public static boolean f(int a, int b, int c) {
        if(a + b > c && b + c > a && a + c > b) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = 0;
        for(int c = 1; c <= n; c++) {
            for(int b = 1; b < c; b++) {
                int m = c * c - b * b;
                double a = Math.sqrt(m);
                if(a % 1 == 0 && (int) a <= b && f((int) a, b, c)) res++;
            }
        }
        System.out.println(res);
    }
}