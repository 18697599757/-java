import java.util.Scanner;

public class Test05_05 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int c=in.nextInt();
        for (int i = 0; i <c; i++) {
        int a=in.nextInt();
        int n=in.nextInt();
        int s=0;
        int t=a;
            for(int j=0;j<n;j++){

                s=s+a;
                a=a*10+t;

            }
            System.out.println(s);
        }

    }
}
