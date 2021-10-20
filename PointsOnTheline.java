import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// codeforces.com/problemset/problem/940/A

public class PointsOnTheline {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = s.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        for(int i = 0; i < n; i++) v.add(s.nextInt());
        Collections.sort(v);
        int max = 0;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(v.get(j) - v.get(i) <= d) {
                    int br = 0;
                    for(int k = 0; k < n; k++) {
                        if(v.get(k) >= v.get(i) && v.get(k) <= v.get(j)) br++;
                    }
                    if(br > max) max = br;
                }
            }
        }
        if(max == 0) System.out.println(n - 1);
        else System.out.println(n - max);
    }
}