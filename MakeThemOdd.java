import java.util.*;

// codeforces.com/problemset/problem/1277/B

public class MakeThemOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            int res = 0;
            for(int i = 0; i < n; i++) {
                int m = s.nextInt();
                if(m % 2 == 0 ) set.add(m);
            }
            while(!set.isEmpty()) {
                int m = set.last();
                set.remove(m);
                if(m % 2 == 0) {
                    set.add(m / 2);
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}