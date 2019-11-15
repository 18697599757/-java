
import java.util.Scanner;

public class MaoPao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int[] arr = new int[k];
        for (int c = 0; c < k; c++) {
            arr[c] = in.nextInt();

        }
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int n = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = n;
                }
            }
            ;
        }
        for (int p=0;p<arr.length;p++) {
            System.out.println(arr[p]);
            if(arr[p]/100!=arr[p+1]/100){
                System.out.println();
            }
    }
    }
}












