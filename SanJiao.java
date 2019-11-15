import java.util.Scanner;

public class SanJiao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int c = 0; c < n; c++) {
            int m = in.nextInt();
            int p = 0;
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = in.nextInt();
            }
            for (int j = 0; j < m-2; j++) {//a0=2
                for (int k = j+1; k <m-1; k++) {//a1=3,
                    for (int l = k+1; l <m; l++) {//a2=4
                        if (Math.pow(arr[j], 2) + Math.pow(arr[k], 2) > Math.pow(arr[l], 2)) {
                            p ++;

                        }else break;
                    }
                }
            }
            System.out.println(p);
        }
    }
}
