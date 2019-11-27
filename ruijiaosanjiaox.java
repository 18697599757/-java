import java.util.Scanner;

public class ruijiaosanjiaox {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 0; i <n ; i++) {
            int s=0;
            int m=in.nextInt();
            int[] arr=new int[m];
            boolean flag=false;
            for (int j = 0; j <m ; j++) {
                arr[j]=in.nextInt();
            }
            for (int j = 0; j <arr.length-1 ; j++) {
                for (int k = 0; k <arr.length-i-1 ; k++) {
                    if(arr[k]>arr[k+1]){
                        int t=arr[k];
                        arr[k]=arr[k+1];
                        arr[k+1]=t;
                    }
                }
            }

            for (int j = 0; j <m-2 ; j++) {
                for (int k = j+1; k <m-1 ; k++) {
                    for (int l = k+1; l <m ; l++) {
                        if(arr[j]+arr[k]>arr[l]&&arr[j]+arr[l]>arr[k]&&arr[k]+arr[l]>arr[j]){
                            if(arr[j]*arr[j]+arr[k]*arr[k]>arr[l]*arr[l]||arr[j]==arr[k]&&arr[k]==arr[l]){
                                s++;
                            }
                        }

                    }

                }
                
            }
            System.out.println(s);
        }
    }
}
