import java.util.Scanner;

public class QiShui {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int c = 0; c < n; c++) {


            int m = in.nextInt();
            int p = m / 5;//空瓶数
            int k = m / 5;//喝了多少瓶
            while (p >= 3) {

                if (p % 3 == 0) {
                    k = k + p / 3;
                    p = p / 3;
                }
                if (p % 3 != 0) {
                    k = k + p / 3;//
                    int t = p % 3;//
                    p = p / 3 + t;//
                }
            }
            if (p == 2) {
                k = k + 1;
            }
            System.out.println(k);
        }


        }
    }








