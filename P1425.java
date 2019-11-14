import java.util.Scanner;

public class P1425 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        int e=((c-a)*60+(d-b))/60;
        int f=((c-a)*60+(d-b))%60;
        System.out.println(e+" "+f);
    }

}
