import java.util.Scanner;

public class Test07_01 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        while (true){
            int m=in.nextInt();
            int n=in.nextInt();
            if(m==0&&n==0){
                break;
            }else {
                System.out.print(yue(m,n)+" ");
                System.out.println(bei(m,n));
            }


        }


    }

    public static int yue(int a, int b){
        while (b!=0){
            int c=a%b;
            a=b;
            b=c;
        }
        return a;
    }
    public static int bei(int a,int b){
        int m=a,n=b;
        while (b!=0){
            int c=a%b;
            a=b;
            b=c;
        }
        a=m*n/a;

        return a;
    }

}
