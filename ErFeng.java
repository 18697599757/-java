import java.util.Scanner;

/**
 * 二分查找
 *
 */
public class ErFeng {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
        int begin=0;//记录开始位置
        int end=arr.length-1;//记录结束位置
        int mid=(begin+end)/2;//记录中间位置
        int index=-1;//查找目标的位置
        while(true){
            if(begin>end){

                break;
            }
            if(arr[mid]==k){
                index=mid;
                break;
            }else{
                if(arr[mid]>k){
                    end=mid-1;

                }else{
                    begin=mid+1;

                }
                mid=(begin+end)/2;

            }
        }
        System.out.println(index);
    }
}
