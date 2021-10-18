import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/problemset/problem/554/B

public class OhanaCleansUp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<String> v = new ArrayList<>();
        for(int i = 0; i < n; i++) v.add(s.next());
        int max = 0;
        for(int i = 0; i < n; i++) {
            int m = 1;
            for(int j = 0; j < n; j++) {
                if(j != i && v.get(i).equals(v.get(j))) m++;
            }
            if(m > max) max = m;
        }
        System.out.println(max);
    }
}