import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            a[i] = in.nextInt();
        }
        int max = a[1];
        for (int j = 0; j < 3; j++) {
            if (a[j] > max) {
                max = a[j];
            }
        }
        System.out.println(max);
    }

}

