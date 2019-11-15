import java.util.Arrays;

public class TestArray2 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        int n=2;
        int[] arr2=new int[arr.length-1];
        for(int i=0;i<arr2.length;i++){
            if(i<n){
                arr2[i]=arr[i];
            }else {
                arr2[i]=arr[i+1];
            }
        }
        arr=arr2;
        System.out.println(Arrays.toString(arr2));
    }
}
