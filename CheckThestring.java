import java.util.Arrays;
import java.util.Scanner;

// codeforces.com/problemset/problem/960/A

public class CheckThestring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss = s.next();
        char[] a = ss.toCharArray();
        char[] b = ss.toCharArray();
        Arrays.sort(a);
        boolean ok = true;
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                ok = false;
                break;
            }
        }
        if(!ok) System.out.println("NO");
        else {
            int a1 = 0, b1 = 0, c1 = 0;
            for(int i = 0; i < a.length; i++) {
                if(a[i] == 'a') a1++;
                else if(a[i] == 'b') b1++;
                else if(a[i] == 'c') c1++;
            }
            if((a1 == c1 || b1 == c1) && (a1 > 0 && b1 > 0)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}