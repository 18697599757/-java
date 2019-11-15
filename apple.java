import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int c=0;c<n;c++) {
            int h=in.nextInt();
            int t=in.nextInt();
            int m=in.nextInt();
            int[]a=new int[m];
            for(int i=0;i<m;i++){
                a[i]=in.nextInt();
            }
            int k=0;
            for(int j=0;j<m;j++){
                if (a[j] >= h && a[j]<=h+t) {
                    k=k+1;
                }
            }
            System.out.println(k);

        }
        }

    }



