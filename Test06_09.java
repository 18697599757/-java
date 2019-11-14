import java.util.Scanner;

public class Test06_09 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[]  arr=new int[15];
        for (int i = 0; i <15 ; i++) {
            arr[i]=in.nextInt();
        }
         int k=in.nextInt();
        int begin=0;
        int end=arr.length-1;
        int mid=(begin+end)/2;
        int index=-1;
        while (true){
            if(begin>end){
                break;
            }
            if(arr[mid]==k){
                index=mid;
                break;
            }else {
                if(arr[mid]>k){
                    end=mid-1;
                }else {
                    begin=mid+1;
                }
            }
            mid=(begin+end)/2;
        }

        System.out.println(index);
    }
}
