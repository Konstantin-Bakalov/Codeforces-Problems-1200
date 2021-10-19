import java.util.Scanner;

// codeforces.com/problemset/problem/574/A

public class BearAndElections {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        int res = 0;
        while(true) {
            int maxIndex = 1;
            for (int i = 1; i < n; i++) {
                if (a[i] >= a[0] && a[i] >= a[maxIndex]) maxIndex = i;
            }
            if (a[maxIndex] < a[0]) break;
            else {
                a[maxIndex]--;
                a[0]++;
                res++;
            }
        }
        System.out.println(res);
    }
}