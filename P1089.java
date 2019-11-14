import java.util.Scanner;

public class P1089 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[12];
        int save=0;

        int left=0;
        int j;
        for ( j = 0; j <12 ; j++) {
             left += 300;

             arr[j] = in.nextInt();


            if (left-arr[j] < 0) {
                int i=j+1;
                System.out.println("-"+i);
                break;

            }
            left-=arr[j];
            while (left>100){
                left-=100;
                save+=100;
            }

        }
        System.out.print((int)(1.2*save+left));


    }
}
