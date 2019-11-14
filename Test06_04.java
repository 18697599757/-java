import java.util.Scanner;

public class Test06_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int a = in.nextInt();

            for (int i = 2; i >= 0; i--) {
                if (arr[i] > a) {
                    arr[i + 1] = arr[i];
                } else {
                    arr[i + 1] = a;
                    break;
                }

            }





            for (int i = 0; i < n + 1; i++) {
                if (i+1==n+1){
                    System.out.print(arr[i]);
                }else {
                    System.out.print(arr[i] + " ");
                }

            }

        }
    }



