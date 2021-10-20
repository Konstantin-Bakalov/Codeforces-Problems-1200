import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// codeforces.com/problemset/problem/990/B

public class MicroWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int K = s.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        for(int i = 0; i < n; i++) v.add(s.nextInt());
        Collections.sort(v);
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = v.get(i);
        int res = 0;
        int pointer1 = 0, pointer2 = 1;
        if(n == 1) System.out.println(1);
        else {
            while(pointer2 < n) {
                while (pointer2 < n - 1 && a[pointer2 - 1] == a[pointer2]) pointer2++;
                while (pointer1 < pointer2) {
                    if (a[pointer1] < a[pointer2] && a[pointer2] <= a[pointer1] + K) {
                        res++;
                    }
                    pointer1++;
                }
                pointer2++;
            }
            System.out.println(n - res);
        }
    }
}