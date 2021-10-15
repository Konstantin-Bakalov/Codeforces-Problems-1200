import java.util.Scanner;

// codeforces.com/problemset/problem/6/C

public class AliceBobAndChocolate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        int alice = 0, bob = 0, res1 = 0, res2 = 0;
        int pointer1 = 0, pointer2 = n - 1;
        while(pointer1 != pointer2) {
            if(alice <= bob) {
                alice += a[pointer1++];
                res1++;
            }
            else {
                bob += a[pointer2--];
                res2++;
            }
        }
        if(pointer1 == pointer2) {
            if(alice <= bob) {
                alice += a[pointer1];
                res1++;
            }
            else {
                bob += a[pointer2];
                res2++;
            }
        }
        System.out.println(res1 + " " + res2);
    }
}