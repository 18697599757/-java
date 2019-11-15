package demo02;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int c=in.nextInt();
        for(int i=1;i<=c;i++){
            int m=in.nextInt();
            int n=in.nextInt();
            int max=0;
            int min=0;
            if(m>n){
                int t=m;
                m=n;
                n=t;
            }
            for(int j=1;j<=m;j++) {
                if (m % j == 0 && n % j == 0) {
                    max = j;
                }
            }
                min=m*n/max;
            System.out.println(min+"\t"+max);




        }
    }
}
