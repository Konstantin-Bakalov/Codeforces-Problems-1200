import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/problemset/problem/903/B

public class TheModcrab {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h1 = s.nextInt();
        int a1 = s.nextInt();
        int c1 = s.nextInt();
        int h2 = s.nextInt();
        int a2 = s.nextInt();
        ArrayList<String> v = new ArrayList<>();
        while(h2 > 0) {
            if(h2 - a1 <= 0 || h1 - a2 > 0) {
                h1 -= a2;
                h2 -= a1;
                v.add("STRIKE");
            }
            else if(h1 - a2 <= 0) {
                h1 += c1;
                h1 -= a2;
                v.add("HEAL");
            }
        }
        System.out.println(v.size());
        for(int i = 0; i < v.size(); i++) System.out.println(v.get(i));
    }
}