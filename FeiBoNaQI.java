import java.util.Scanner;

public class FeiBoNaQI {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        int i=fbnq(k);
        System.out.println(i);
    }
    public static int fbnq(int i){
        if(i==1||i==2){
            return 1;

        }else{
            return fbnq(i-1)+fbnq(i-2);
        }
    }
}
