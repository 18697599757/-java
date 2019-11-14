import java.util.Scanner;

public class Test06_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {

            int m = in.nextInt();
            int[] arr = new int[m];

            for (int j = 0; j < m; j++) {
                arr[j] = in.nextInt();
            }
            for (int j = 0; j <m ; j++) {
                int mind=j;
                for (int k = j+1; k <m ; k++) {
                    if(arr[mind]>arr[k]){
                        mind=k;
                        int t=arr[j];
                        arr[j]=arr[mind];
                        arr[mind]=t;
                    }

                }




            }
            for (int j = 0; j <m ; j++) {

                if(j+1==m){
                    System.out.print(arr[j]);
                    System.out.println();

                }else {
                    System.out.print(arr[j]+" ");
                }

                }

            }

        }
    }

