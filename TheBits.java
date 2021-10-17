import java.util.Scanner;

// codeforces.com/problemset/problem/1017/B

public class TheBits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String a = s.next();
        String b = s.next();
        long t00 = 0, t10 = 0, t11 = 0, t01 = 0;
        for(int i = 0; i < n; i++) {
            if(a.charAt(i) == '0' && b.charAt(i) == '0') t00++;
            else if(a.charAt(i) == '1' && b.charAt(i) == '1') t11++;
            else if(a.charAt(i) == '1' && b.charAt(i) == '0') t10++;
            else if(a.charAt(i) == '0' && b.charAt(i) == '1') t01++;
        }
        System.out.println(t00 * t10 + t00 * t11 + t01 * t10);
    }
}