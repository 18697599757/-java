import java.lang.reflect.Array;
import java.util.Arrays;

public class testArray {
    public static void main(String[] args) {
        int [] arr1= new int[3];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=9;
        }
        System.out.println(Arrays.toString(arr1));
        int [] arr2= new int[arr1.length+1];
        for(int j=0;j<arr1.length;j++){
            arr2[j]=arr1[j];
        }
        int d=8;
        arr2[arr1.length]=d;
        System.out.println(Arrays.toString(arr2));
    }
}
