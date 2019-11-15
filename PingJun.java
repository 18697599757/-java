import java.util.Scanner;

public class PingJun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int c = 0; c < n; c++) {
            int m = in.nextInt();
            int[] arr = new int[m];
            int s = 0;
            for (int i = 0; i < m; i++) {
                arr[i] = in.nextInt();
                s = s + arr[i];
            }
            int p = s / m;
            System.out.println(p);
        }
    }
}
