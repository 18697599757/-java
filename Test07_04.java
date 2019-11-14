import java.util.Scanner;

public class Test07_04 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr[i].length ; j++) {
                int t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(String.format("%10d",arr[i][j]));

            }
            System.out.println();
        }

    }


}
