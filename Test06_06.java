import java.util.Arrays;

public class Test06_06 {
    public static void main(String[] args) {
        int[][] arr=new int[10][];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=new int[i+1];

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][0]=arr[i][j]=1;
                if(i>1&&j<i&&j>0){
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.printf("%5d",arr[i][j]);

            }
            System.out.println();

        }

    }
}

