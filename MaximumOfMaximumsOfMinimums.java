import java.util.Scanner;

// codeforces.com/problemset/problem/870/B

public class MaximumOfMaximumsOfMinimums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        if(k == 1) {
            int index = 0;
            for(int i = 0; i < n; i++)
                if(a[index] > a[i]) index = i;
            System.out.println(a[index]);
        }
        else if(k == 2) {
            System.out.println(a[0] > a[n - 1] ? a[0] : a[n - 1]);
        }
        else {
            int index = 0;
            for(int i = 0; i < n; i++)
                if(a[i] > a[index]) index = i;
            System.out.println(a[index]);
        }
    }
}