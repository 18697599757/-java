
import java.util.Scanner;

public class Test06_08 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int[][] arr=new int[m][n];
        for (int i = 0; i <arr.length ; i++) {//n=4  m=3
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            int max=arr[i][0];
            int maxin=0;
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                    maxin=j;
                }
            }
            boolean flag=true;
            for (int j = 0; j <m ; j++) {
                if(max>arr[j][maxin]){
                    flag=false;
                    continue;
                }
                
            }
            if(flag){
                System.out.println(arr[i][maxin]);
            }

        }

    }
}
