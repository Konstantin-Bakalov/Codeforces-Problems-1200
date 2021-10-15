import java.util.Scanner;

// codeforces.com/problemset/problem/787/A

public class TheMonster {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int i = 0, j = 0;
        outer:
        for(i = 0; i <= 100; i++)
            for(j = 0; j <= 100; j++)
                if(b + i * a == d + j * c)
                    break outer;
        System.out.println(b + i * a == d + j * c ? b + i * a : -1);
    }
}