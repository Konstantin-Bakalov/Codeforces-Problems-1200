import java.util.Scanner;

// codeforces.com/problemset/problem/842/A

public class KirillAndTheGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int r = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();
        long k = s.nextLong();
        for(long i = x; i <= y; i++) {
            if(i * k >= l && i * k <= r) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}