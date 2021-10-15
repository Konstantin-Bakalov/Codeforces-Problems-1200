import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// codeforces.com/problemset/problem/875/A

public class ClassroomWatch {

    public static int sum(long n) {
        int res = 0;
        while(n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Long> v = new ArrayList<>();
        for(int i = 1; i <= 81; i++) {
            long x = n - i;
            if(x + sum(x) == n && !v.contains(x)) v.add(x);
        }
        System.out.println(v.size());
        Collections.sort(v);
        for(int i = 0; i < v.size(); i++)
            System.out.println(v.get(i));
    }
}