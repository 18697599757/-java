import java.util.Scanner;

public class Test06_05 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 0; i <n ; i++) {
            int m=in.nextInt();
            int[] arr=new int[m];
            for (int j = 0; j <m ; j++) {
                arr[j]=in.nextInt();

            }
            int[] newarr=new int[m];
            for (int j = 0,k=m-1; j<m ; j++,k--) {
                newarr[j]=arr[k];

            }
            for (int j = 0; j <m ; j++) {
                if (j+1==m){
                    System.out.print(newarr[j]);
                    System.out.println();
                }else {
                    System.out.print(newarr[j] + " ");
                }



            }

        }
    }
}
