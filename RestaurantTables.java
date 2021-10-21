import java.util.Scanner;

// codeforces.com/problemset/problem/828/A

public class RestaurantTables {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int[] customers = new int[n];
        for(int i = 0; i < n; i++) customers[i] = s.nextInt();
        int res = 0, alone = 0;
        for(int i = 0; i < n; i++) {
            if(customers[i] == 1) {
                if(a > 0) {
                    a--;
                }
                else if(b > 0) {
                    alone++;
                    b--;
                }
                else if(b == 0 && alone > 0) {
                    alone--;
                }
                else res++;
            }
            else if(customers[i] == 2) {
                if(b > 0) {
                    b--;
                }
                else res += 2;
            }
        }
        System.out.println(res);
    }
}