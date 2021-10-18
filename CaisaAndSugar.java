import java.util.Scanner;

// codeforces.com/problemset/problem/463/A

public class CaisaAndSugar {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int s = ss.nextInt();
        int max = -1;
        boolean b = false;
        for(int i = 0; i < n; i++) {
            int x = ss.nextInt();
            int y = ss.nextInt();
            if(x < s  || (x == s && y == 0)) b = true;
            if(x < s && max < 100 - y && y > 0) max = 100 - y;
        }
        if(max == -1 && b) System.out.println(0);
        else System.out.println(max);
    }
}