import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// codeforces.com/problemset/problem/262/B

public class RomaAndChangingSigns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        for(int i = 0; i < n; i++) v.add(s.nextInt());
        for(int i = 0; i < n; i++) {
            if(k == 0 || v.get(i) > 0) break;
            if(v.get(i) < 0) {
                v.set(i, v.get(i) * -1);
                k--;
            }
        }
        if(k > 0) {
            Collections.sort(v);
            k = k % 2;
            if(k == 1) v.set(0, v.get(0) * -1);
        }
        long sum = 0;
        for(int i = 0; i < n; i++) sum += v.get(i);
        System.out.println(sum);
    }
}