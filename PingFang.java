import java.util.Scanner;



public class PingFang {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        if(k>0&&k<1000){
            System.out.println((int)Math.sqrt(k));

        }else {
            System.out.println("-1");
        }
    }
}
