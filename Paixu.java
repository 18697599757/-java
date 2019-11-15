import java.util.Arrays;
import java.util.Scanner;

public class Paixu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<arr .length;i++){
            arr[i]=in.nextInt();

        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }


            }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");

        }
        }

    }

