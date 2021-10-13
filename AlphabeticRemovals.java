import java.util.Scanner;

// codeforces.com/problemset/problem/999/C

public class AlphabeticRemovals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        String str = s.next();
        char[] a = str.toCharArray();
        for(int i = 97; i <= 122; i++) {
            if(k == 0) break;
            for(int j = 0; j < a.length; j++) {
                if(k > 0 && a[j] == (char) i) {
                    a[j] = ' ';
                    k--;
                }
            }
        }
        for(int j = 0; j < a.length; j++)
            if(a[j] != ' ') System.out.print(a[j]);
    }
}