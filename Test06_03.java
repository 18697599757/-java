import java.util.Scanner;

public class Test06_03 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int s=0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                arr[i][j]=in.nextInt();
                
            }
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (i==j){
                    s=s+arr[i][j];

                }

            }
            
        }
        System.out.println(s);
    }
}
