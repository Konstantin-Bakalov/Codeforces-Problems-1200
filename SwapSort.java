import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// codeforces.com/problemset/problem/489/A

public class SwapSort {

    static class Pair<Integer> {
        public Integer left;
        public Integer right;
        Pair(Integer l, Integer r) {
            left = l;
            right = r;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Long> v = new ArrayList<>();
        ArrayList<Long> w = new ArrayList<>();
        ArrayList<Pair> q = new ArrayList<>();
        long res = 0;
        for(int i = 0; i < n; i++) {
            long m = s.nextLong();
            v.add(m);
            w.add(m);
        }
        Collections.sort(w);
        for(int i = 0; i < n; i++) {
            if(v.get(i) != w.get(i)) {
                for(int j = i + 1; j < n; j++) {
                    if(v.get(j).equals(w.get(i))) {
                        res++;
                        q.add(new Pair(i, j));
                        long temp = v.get(i);
                        v.set(i, v.get(j));
                        v.set(j, temp);
                        break;
                    }
                }
            }
        }
        System.out.println(res);
        for(int i = 0; i < q.size(); i++) System.out.println(q.get(i).left + " " + q.get(i).right);
    }
}