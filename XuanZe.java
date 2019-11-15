import java.util.Arrays;

public class XuanZe {
    public static void main(String[] args) {
        int[] arr=new int[]{5,6,1,9,2,4,8,6,1};
        for(int i=0;i<arr.length;i++){
            int min=i;//5
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;


            }
        }
            if(i!=min){
                int t=arr[i];
                arr[i]=arr[min];
                arr[min]=t;
            }


        }

            System.out.println(Arrays.toString(arr));
        }
    }

